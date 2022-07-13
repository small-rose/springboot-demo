## 事件

### spring boot中事件的使用和发布

**实现**

- spring 3.x 事件发布
- guava的eventbus
- 异步框架Reactor
- springboot ApplicationEvent以及Listener


### Java的事件机制

java中的事件机制一般包括3个部分：事件、事件监听器、事件源。

- EventObject，
- EventListener
- Source。

**EventObject**

java.util.EventObject是事件状态对象的基类，它封装了事件源对象以及和事件相关的信息。所有java的事件类都需要继承该类。

**EventListener**

java.util.EventListener是一个标记接口，就是说该接口内是没有任何方法的。所有事件监听器都需要实现该接口。事件监听器注册在事件源上，当事件源的属性或状态改变的时候，调用相应监听器内的回调方法。

**Source**

事件源不需要实现或继承任何接口或类，它是事件最初发生的地方。因为事件源需要注册事件监听器，所以事件源内需要有相应的盛放事件监听器的容器。

java的事件机制是一个观察者模式。大家可以根据这个模式，自己实现一个。可以看看这篇博文:《java事件机制》一个很简单的实例。

### Spring的事件

    ApplicationEvent以及Listener是Spring为我们提供的一个事件监听、订阅的实现，内部实现原理是观察者设计模式，设计初衷也是为了系统业务逻辑之间的解耦，提高可扩展性以及可维护性。

    ApplicationEvent就是Spring的事件接口
    ApplicationListener就是Spring的事件监听器接口，所有的监听器都实现该接口
    ApplicationEventPublisher是Spring的事件发布接口，ApplicationContext实现了该接口
    ApplicationEventMulticaster就是Spring事件机制中的事件广播器，默认实现SimpleApplicationEventMulticaster

在Spring中通常是ApplicationContext本身担任监听器注册表的角色，在其子类AbstractApplicationContext中就聚合了事件广播器ApplicationEventMulticaster和事件监听器ApplicationListnener，并且提供注册监听器的addApplicationListnener方法。

其执行的流程大致为：

    当一个事件源产生事件时，它通过事件发布器ApplicationEventPublisher发布事件，然后事件广播器ApplicationEventMulticaster会去事件注册表ApplicationContext中找到事件监听器ApplicationListnener，并且逐个执行监听器的onApplicationEvent方法，从而完成事件监听器的逻辑。

在Spring中，使用注册监听接口，除了继承ApplicationListener接口外，还可以使用注解@EventListener来监听一个事件，同时该注解还支持SpEL表达式，来触发监听的条件，比如只接受编码为001的事件，从而实现一些个性化操作。下文示例中会简单举例下。

简单来说，在Java中，通过java.util. EventObject来描述事件，通过java.util. EventListener来描述事件监听器，在众多的框架和组件中，建立一套事件机制通常是基于这两个接口来进行扩展。

SpringBoot的默认启动事件

(1)在SpringBoot的1.5.x中，提供了几种事件，供我们在开发过程中进行更加便捷的扩展及差异化操作。

    ApplicationStartingEvent：springboot启动开始的时候执行的事件

    ApplicationEnvironmentPreparedEvent：spring boot对应Enviroment已经准备完毕，但此时上下文context还没有创建。在该监听中获取到ConfigurableEnvironment后可以对配置信息做操作，例如：修改默认的配置信息，增加额外的配置信息等等。

    ApplicationPreparedEvent：spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的。在获取完上下文后，可以将上下文传递出去做一些额外的操作。值得注意的是：在该监听器中是无法获取自定义bean并进行操作的。

    ApplicationReadyEvent：springboot加载完成时候执行的事件。

    ApplicationFailedEvent：spring boot启动异常时执行事件。
    
(2)
应用程序事件在应用程序运行时按以下顺序发送：

    ApplicationStartingEvent: springboot启动开始的时候执行的事件

    ApplicationEnvironmentPreparedEventEnvironment: spring boot对应Enviroment已经准备完毕，但此时上下文context还没有创建。在该监听中获取到ConfigurableEnvironment后可以对配置信息做操作，例如：修改默认的配置信息，增加额外的配置信息等等。

    ApplicationContextInitializedEvent ApplicationContext :当准备好并且已调用 ApplicationContextInitializers 时，但在加载任何 Bean 定义之前，

    ApplicationPreparedEvent: after the context has been refreshed but before any application and command-line runners have been called .在刷新开始之前，但在加载 Bean 定义之后

    ApplicationStartedEvent: 在刷新上下文之后但在调用任何应用程序和命令行运行程序之前发送 。

    ApplicationReadyEvent: springboot加载完成时候执行的事件。

    ApplicationFailedEvent: spring boot启动异常时执行事件。

上面的列除了上述事件，以下事件发布：SpringApplicationEvent、SpringApplication、ApplicationPreparedEvent、ApplicationStartedEvent

(1) ContextRefreshedEvent: ApplicationContext 刷新执行完成时执行。

(2) WebServerInitializedEvent、WebServerServlet、WebServerInitializedEvent、ReactiveWebServerInitializedEventA 在 准备就绪后发送。 并且分别是 servlet 和反应变体。

从官网文档中，我们可以知道，由于一些事件实在上下文为加载完触发的，所以无法使用注册bean的方式来声明，文档中可以看出，可以通过SpringApplication.addListeners(…​)或者SpringApplicationBuilder.listeners(…​)来添加，或者添加META-INF/spring.factories文件z中添加监听类也是可以的，这样会自动加载。
```text
org.springframework.context.ApplicationListener=com.example.project.MyListener
```
启动类中添加:

```java
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication app =new SpringApplication(Application.class);
        app.addListeners(new MyApplicationStartingEventListener());//加入自定义的监听类
        app.run(args);
    }
}
```


官网：https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/#boot-features-application-events-and-listeners    

具体实例参考：com.xiaocai.demo.event.events

#### spring Event 事件中的事务控制

Spring Event 可以简单实现业务解耦，从 Spring 4.2 以后，事件处理不用实现 ApplicationListener 的 onApplicationEvent 方法了，使用注解 @EventListener 可以自动关联相关的 ApplicationListener

**事务绑定事件**

标准的事件模型在一些业务上能很好的满足需求，例如异步化处理，不干扰主线程执行等，不论事务被提交或回滚，都能正常执行。但是如果我们只是希望事务被提交后，再执行事件呢？

例如，用户注册成功后添加一个发送邮件的事件，或者推送消息，或者短信，这时候需要保存数据库后，再进行这些操作。但是万一事务提交失败数据库事务会回滚，这时候如果用户收到邮件，那可惨淡了！

在 Spring 事务管理中， 事务是配置注解声明的 (@Transactional) 提交操作将在方法结束后执行。提交是自动自行的 (transaction.commit ()). 以下是一些解决方式:

解决方案 1 (<Spring 4.2):

```text
@EventListener
public void afterRegisterSendMail(MessageEvent event) {
    // Spring 4.2 之前
    TransactionSynchronizationManager.registerSynchronization(
            new TransactionSynchronizationAdapter() {
                @Override
                public void afterCommit() {
                    internalSendMailNotification(event);
                }
            });
}

```
上面的代码将在事务提交后执行。如果在非事务 context 中将抛出 java.lang.IllegalStateException: Transaction synchronization is not active

```text
	    @EventListener
		public void afterRegisterSendMail(MessageEvent event) {
		    // Spring 4.2 之前
		 
		    if (TransactionSynchronizationManager.isActualTransactionActive()) {
		 
		        TransactionSynchronizationManager.registerSynchronization(
		                new TransactionSynchronizationAdapter() {
		                    @Override
		                    public void afterCommit() {
		                    	mailService.send(event);
		                    }
		                });
		    } else {
		        mailService.send(event);
		    }
		}
```
这样无论是否有事务都能兼容啦。

解决方案 2 (Spring 4.2 +)

Spring 4.2 除了 `@EventListener` 之外，额外提供了新的注解 `@TransactionalEventListener`

```text
	    @TransactionalEventListener
		public void afterRegisterSendMail(MessageEvent event) {
			mailService.send(event);
		}
```
这个注解的强大之处在于可一直控制事务的 before/after commit, after rollback ,after completion (commit 或 rollback). 默认情况下，在事务中的 Event 将会被执行，其他情况不触发.

在非事务 context 下，如果也想执行，启用参数:fallbackExecution=true,
```text
        @TransactionalEventListener(fallbackExecution = true)
		public void afterRegisterSendMail(MessageEvent event) {
			mailService.send(event);
		}
```

总结
一般的监听器

    实现ApplicationListener接口,实现onApplicationEvent方法,
    用@Componnet修饰,ioc容器启动的时候加入到事件管理器中,获取手动调用上下文对象的addApplicationListener方法加入
    发布事件,随即触发事件

@TransactionalEventListener修饰的监听器

1.每一个被该注解修饰的方法都会创建一个监听器(持有method对象和当前类的Class),并加入到事件管理器中
2.发布事件时,调用上一步创建的监听器的监听方法,将该监听器和必要的信息封装成对象,放到事务管理器
3.由事务切面在提交事务之后，从事务管理器里取出上一步存储的对象，反射调用我们自己的监听方法。

需注意点：

(1) 事务监听方法所在的类一定要注册到spring容器中,如果没被实例化，则不会判断方法中是否存在@TransactionalEventListener注解,不会创建监听器适配器。
(2) 发布事件一定要在被事务管理的代码中。如果在事务范围之外发布事件,事务切面已经结束,则不会去调用监听器适配器中反射调用我们监听方法的方法。

[Spring事务监听器@TransactionalEventListener 源码解析](https://www.jianshu.com/p/22b75f98ed16)
	
	    
## guava的eventbus

EventBus主要分为两种，一种是同步消息总线（EventBus）；另一种是异步消息总线（AsyncEventBus）。

自身示例：com.xiaocai.demo.event.guava.original

与spring整合使用示例

示例1：com.xiaocai.demo.event.guava.spring

示例1：com.xiaocai.demo.event.guava.spring2
 		
 		
## spring reactor 事件框架

例1：com.xiaocai.demo.event.reactor

（1）Reactor 配置
```java
@Configuration
public class ReactorConfig {

    @Bean
    Environment env() {
        return new Environment();
    }

    @Bean
    Reactor createReactor(Environment env) {
        return Reactors.reactor()
                .env(env)
                .dispatcher(Environment.THREAD_POOL)
                .get();
    }
}
```
(2) 事件监听器

事件的监听器，以便于接收发送的事件并处理。需要实现 Consumer<Event<T>> 接口，其中 T 是处理程序接收的数据类型，要根据具体业务设置

本示例中之所以注入 `Reactor reactor;` 是为了演示本事件触发下一个事件，可以忽略或者删除

```java
@Component
public class AppListener<User> implements Consumer<Event<User>> {

    public void accept(Event<User> event) {
        System.out.println("Received user object with " +event.getData());
    }
}
```

(3) 将事件绑定到指定的监听器

ReactorService，实现InitializingBean接口，以便将发送的事件绑定到指定的监听器

```java
@Service
public class ReactorService implements InitializingBean {
    
    @Autowired
    private Reactor reactor;

    @Autowired
    private AppListener appListener;

    @Override
    public void afterPropertiesSet() throws Exception {
        reactor.on($("eventHandler"), appListener);
    }
}
```
(4) 触发事件

通过reactor.notify发送事件

```java
@RestController
@RequestMapping("/api")
public class ReactorController {

    @Autowired
    private Reactor reactor;

    @RequestMapping("/test")
    public void test() throws InterruptedException{
        User user = new User();
        user.setFirstName("Chetan");
        user.setLastName("Birajdar");
        user.setAddress("钦州北路");
        user.setCity("上海");

        // 通过reactor.notify发送事件
        reactor.notify("eventHandler", Event.wrap(user));
        System.out.println("yes, I sent something for you!!");
    }
}
```