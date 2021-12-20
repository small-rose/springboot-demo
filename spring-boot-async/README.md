### 异步任务DEMO

#### 1.传统的显式的 new Thread实现

```$xslt
public class Mythread {
    public static void main(String[] args) {

        //使用匿名内部类的方式执行多线程
         Thread th1= new Thread("custom"){
             @Override
             public  void run(){
            for(int i=0;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"使用匿名内部类的方式创建多线程=>"+i);
            }
             }
    
         };//start调用了底层c++的方法，重写run方法，使用的是模板方法模式。
         th1.start();
 
    }
}
```


#### 2、继承Thread类、实现Runnable接口、Callable接口

```$xslt
    /**
     * 任务类
     */
    class Task implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "：异步任务");
        }
    }
```

#### 3.jdk1.8之后可以使用Lambda 表达式

本质和第一种是一样的。

```$xslt
        //新建线程并执行任务类
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "：异步任务");
        }).start();
```

#### 4.线程池

```$xslt
public static void main (String args[]) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 10 ; i ++){
            final int num = i;
            Thread.sleep(i*1000);
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(num);
                }
            });
        }
    }
```

异步线程池

```$xslt

@Service
public class AsyncTaskDemoService {

    @Autowired
    AsyncTaskExecutor asyncTaskExecutor;//注入线程池对象

    public void asyncTask(){
        //通过线程池对象提交异步任务
        asyncTaskExecutor.submit(() -> {
            log.info("异步任务开始");

            //省略异步任务业务逻辑...

            log.info("异步任务结束");
        });
    }
}

```