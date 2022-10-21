SpringBoot-事件监听的4种实现方式

springboot进行事件监听有四种方式:

- 1.手工向ApplicationContext中添加监听器
- 2.将监听器装载入spring容器
- 3.在application.properties中配置监听器
- 4.通过@EventListener注解实现事件监听

讲到事件监听，这里我们说下自定义事件和自定义监听器类的实现方式：
自定义事件：继承自ApplicationEvent抽象类，然后定义自己的构造器
自定义监听：实现ApplicationListener<T>接口，然后实现onApplicationEvent方法

