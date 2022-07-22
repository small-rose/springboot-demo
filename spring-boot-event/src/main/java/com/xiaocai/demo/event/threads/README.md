学习链接 https://cloud.tencent.com/developer/article/1522404

一、实现

本文使用了8种方法实现在多线程中让线程按顺序运行的方法，涉及到多线程中许多常用的方法，不止为了知道如何让线程按顺序运行，更是让读者对多线程的使用有更深刻的了解。使用的方法如下:

```text
    [1] 使用线程的join方法
    [2] 使用主线程的join方法
    [3] 使用线程的wait方法
    [4] 使用线程的线程池方法
    [5] 使用线程的Condition(条件变量)方法
    [6] 使用线程的CountDownLatch(倒计数)方法
    [7] 使用线程的CyclicBarrier(回环栅栏)方法
    [8] 使用线程的Semaphore(信号量)方法
```


二、实现

我们下面需要完成这样一个应用场景：

1.早上；2.测试人员、产品经理、开发人员陆续的来公司上班；3.产品经理规划新需求；4.开发人员开发新需求功能；5.测试人员测试新功能。

规划需求，开发需求新功能，测试新功能是一个有顺序的，我们把thread1看做产品经理，thread2看做开发人员，thread3看做测试人员。

— 1 —

使用线程的 join 方法

join():是Theard的方法，作用是调用线程需等待该join()线程执行完成后，才能继续用下运行。

应用场景:当一个线程必须等待另一个线程执行完毕才能执行时可以使用join方法。
```java

package com.wwj.javabase.thread.order;

/**
 * @author wwj
 * 通过子程序join使线程按顺序执行
 */
public class ThreadJoinDemo {

    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理规划新需求");
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                    System.out.println("开发人员开发新需求功能");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
                    System.out.println("测试人员测试新功能");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("早上：");
        System.out.println("测试人员来上班了...");
        thread3.start();
        System.out.println("产品经理来上班了...");
        thread1.start();
        System.out.println("开发人员来上班了...");
        thread2.start();
    }
}

```
运行结果

```
    早上：
    测试人员来上班了…
    产品经理来上班了…
    开发人员来上班了…
    产品经理规划新需求
    开发人员开发新需求功能
    测试人员测试新功能

```
— 2 —

使用主线程的 join 方法

这里是在主线程中使用join()来实现对线程的阻塞。

```java
package com.wwj.javabase.thread.order;

/**
 * @author wwj
 * 通过主程序join使线程按顺序执行
 */
public class ThreadMainJoinDemo {

    public static void main(String[] args) throws Exception {

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理正在规划新需求...");
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开发人员开发新需求功能");
            }
        });

        final Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("测试人员测试新功能");
            }
        });

        System.out.println("早上:");
        System.out.println("产品经理来上班了");
        System.out.println("测试人员来上班了");
        System.out.println("开发人员来上班了");
        thread1.start();
        //在父进程调用子进程的join()方法后，父进程需要等待子进程运行完再继续运行。
        System.out.println("开发人员和测试人员休息会...");
        thread1.join();
        System.out.println("产品经理新需求规划完成!");
        thread2.start();
        System.out.println("测试人员休息会...");
        thread2.join();
        thread3.start();
    }
}

```
运行结果

```
    产品经理来上班了
    测试人员来上班了
    开发人员来上班了
    开发人员和测试人员休息会…
    产品经理正在规划新需求…
    产品经理新需求规划完成!
    测试人员休息会…
    开发人员开发新需求功能
    测试人员测试新功能

```
— 3 —

使用线程的 wait 方法

wait():是Object的方法，作用是让当前线程进入等待状态，同时，wait()也会让当前线程释放它所持有的锁。“直到其他线程调用此对象的 notify() 方法或 notifyAll() 方法”，当前线程被唤醒(进入“就绪状态”)

notify()和notifyAll():是Object的方法，作用则是唤醒当前对象上的等待线程；notify()是唤醒单个线程，而notifyAll()是唤醒所有的线程。

wait(long timeout):让当前线程处于“等待(阻塞)状态”，“直到其他线程调用此对象的notify()方法或 notifyAll() 方法，或者超过指定的时间量”，当前线程被唤醒(进入“就绪状态”)。

应用场景：Java实现生产者消费者的方式。

```java
package com.wwj.javabase.thread.order;

/**
 * @author wwj
 */
public class ThreadWaitDemo {

    private static Object myLock1 = new Object();
    private static Object myLock2 = new Object();

    /**
     * 为什么要加这两个标识状态?
     * 如果没有状态标识，当t1已经运行完了t2才运行，t2在等待t1唤醒导致t2永远处于等待状态
     */
    private static Boolean t1Run = false;
    private static Boolean t2Run = false;
    public static void main(String[] args) {

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (myLock1){
                    System.out.println("产品经理规划新需求...");
                    t1Run = true;
                    myLock1.notify();
                }
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (myLock1){
                    try {
                        if(!t1Run){
                            System.out.println("开发人员先休息会...");
                            myLock1.wait();
                        }
                        synchronized (myLock2){
                            System.out.println("开发人员开发新需求功能");
                            myLock2.notify();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (myLock2){
                    try {
                        if(!t2Run){
                            System.out.println("测试人员先休息会...");
                            myLock2.wait();
                        }
                        System.out.println("测试人员测试新功能");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        System.out.println("早上：");
        System.out.println("测试人员来上班了...");
        thread3.start();
        System.out.println("产品经理来上班了...");
        thread1.start();
        System.out.println("开发人员来上班了...");
        thread2.start();
    }
}

```
运行结果:这里输出会有很多种顺序，主要是因为线程进入的顺序，造成锁住线程的顺序不一致。

```
    早上：
    测试人员来上班了…
    产品经理来上班了…
    开发人员来上班了…
    测试人员先休息会…
    产品经理规划新需求…
    开发人员开发新需求功能
    测试人员测试新功能

```
— 4 —

使用线程的线程池方法

JAVA通过Executors提供了四种线程池

    单线程化线程池(newSingleThreadExecutor);
    可控最大并发数线程池(newFixedThreadPool);
    可回收缓存线程池(newCachedThreadPool);
    支持定时与周期性任务的线程池(newScheduledThreadPool)。

单线程化线程池(newSingleThreadExecutor):优点，串行执行所有任务。

submit()：提交任务。

shutdown()：方法用来关闭线程池，拒绝新任务。

应用场景:串行执行所有任务。如果这个唯一的线程因为异常结束，那么会有一个新的线程来替代它。此线程池保证所有任务的执行顺序按照任务的提交顺序执行。

```java
package com.wwj.javabase.thread.order;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wwj
 * 通过SingleThreadExecutor让线程按顺序执行
 */
public class ThreadPoolDemo {

    static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理规划新需求");
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开发人员开发新需求功能");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("测试人员测试新功能");
            }
        });

        System.out.println("早上：");
        System.out.println("产品经理来上班了");
        System.out.println("测试人员来上班了");
        System.out.println("开发人员来上班了");
        System.out.println("领导吩咐:");
        System.out.println("首先，产品经理规划新需求...");
        executorService.submit(thread1);
        System.out.println("然后，开发人员开发新需求功能...");
        executorService.submit(thread2);
        System.out.println("最后，测试人员测试新功能...");
        executorService.submit(thread3);
        executorService.shutdown();
    }
}

```
运行结果

```
    早上：
    产品经理来上班了
    测试人员来上班了
    开发人员来上班了
    领导吩咐:
    首先，产品经理规划新需求…
    然后，开发人员开发新需求功能…
    最后，测试人员测试新功能…
    产品经理规划新需求
    开发人员开发新需求功能
    测试人员测试新功能

```
— 5 —

使用线程的 Condition(条件变量) 方法

Condition（条件变量）:通常与一个锁关联。需要在多个Contidion中共享一个锁时，可以传递一个Lock/RLock实例给构造方法，否则它将自己生成一个RLock实例。

    Condition中await()方法类似于Object类中的wait()方法。
    Condition中await(long time,TimeUnit unit)方法类似于Object类中的wait(long time)方法。
    Condition中signal()方法类似于Object类中的notify()方法。
    Condition中signalAll()方法类似于Object类中的notifyAll()方法。

应用场景：Condition是一个多线程间协调通信的工具类，使得某个，或者某些线程一起等待某个条件（Condition）,只有当该条件具备( signal 或者 signalAll方法被调用)时 ，这些等待线程才会被唤醒，从而重新争夺锁。
```java

package com.wwj.javabase.thread.order;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wwj
 * 使用Condition(条件变量)实现线程按顺序运行
 */
public class ThreadConditionDemo {

    private static Lock lock = new ReentrantLock();
    private static Condition condition1 = lock.newCondition();
    private static Condition condition2 = lock.newCondition();

    /**
     * 为什么要加这两个标识状态?
     * 如果没有状态标识，当t1已经运行完了t2才运行，t2在等待t1唤醒导致t2永远处于等待状态
     */
    private static Boolean t1Run = false;
    private static Boolean t2Run = false;

    public static void main(String[] args) {

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                System.out.println("产品经理规划新需求");
                t1Run = true;
                condition1.signal();
                lock.unlock();
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    if(!t1Run){
                        System.out.println("开发人员先休息会...");
                        condition1.await();
                    }
                    System.out.println("开发人员开发新需求功能");
                    t2Run = true;
                    condition2.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    if(!t2Run){
                        System.out.println("测试人员先休息会...");
                        condition2.await();
                    }
                    System.out.println("测试人员测试新功能");
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("早上：");
        System.out.println("测试人员来上班了...");
        thread3.start();
        System.out.println("产品经理来上班了...");
        thread1.start();
        System.out.println("开发人员来上班了...");
        thread2.start();
    }
}
```

运行结果:这里输出会有很多种顺序，主要是因为线程进入的顺序，造成锁住线程的顺序不一致
```text

    早上：
    测试人员来上班了…
    产品经理来上班了…
    开发人员来上班了…
    测试人员先休息会…
    产品经理规划新需求
    开发人员开发新需求功能
    测试人员测试新功能

```
— 6 —

使用线程的 CuDownLatch(倒计数) 方法

CountDownLatch:位于java.util.concurrent包下，利用它可以实现类似计数器的功能。

应用场景:比如有一个任务C，它要等待其他任务A,B执行完毕之后才能执行，此时就可以利用CountDownLatch来实现这种功能了。
```java
package com.wwj.javabase.thread.order;

import java.util.concurrent.CountDownLatch;

/**
 * @author wwj
 * 通过CountDownLatch（倒计数）使线程按顺序执行
 */
public class ThreadCountDownLatchDemo {

    /**
     * 用于判断线程一是否执行，倒计时设置为1，执行后减1
     */
    private static CountDownLatch c1 = new CountDownLatch(1);

    /**
     * 用于判断线程二是否执行，倒计时设置为1，执行后减1
     */
    private static CountDownLatch c2 = new CountDownLatch(1);

    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理规划新需求");
                //对c1倒计时-1
                c1.countDown();
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //等待c1倒计时，计时为0则往下运行
                    c1.await();
                    System.out.println("开发人员开发新需求功能");
                    //对c2倒计时-1
                    c2.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //等待c2倒计时，计时为0则往下运行
                    c2.await();
                    System.out.println("测试人员测试新功能");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("早上：");
        System.out.println("测试人员来上班了...");
        thread3.start();
        System.out.println("产品经理来上班了...");
        thread1.start();
        System.out.println("开发人员来上班了...");
        thread2.start();
    }
}
```
运行结果
```
    早上：
    测试人员来上班了…
    产品经理来上班了…
    开发人员来上班了…
    产品经理规划新需求
    开发人员开发新需求功能
    测试人员测试新功能
```

```
— 7 —

使用 CyclicBarrier (回环栅栏)实现线程按顺序执行

CyclicBarrier(回环栅栏):通过它可以实现让一组线程等待至某个状态之后再全部同时执行。叫做回环是因为当所有等待线程都被释放以后，CyclicBarrier可以被重用。我们暂且把这个状态就叫做barrier，当调用await()方法之后，线程就处于barrier了。

应用场景:公司组织春游,等待所有的员工到达集合地点才能出发，每个人到达后进入barrier状态。都到达后，唤起大家一起出发去旅行。

```java
package com.wwj.javabase.thread.order;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author wwj
 * 使用CyclicBarrier(回环栅栏)实现线程按顺序运行
 */
public class CyclicBarrierDemo {

    static CyclicBarrier barrier1 = new CyclicBarrier(2);
    static CyclicBarrier barrier2 = new CyclicBarrier(2);

    public static void main(String[] args) {

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("产品经理规划新需求");
                    //放开栅栏1
                    barrier1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //放开栅栏1
                    barrier1.await();
                    System.out.println("开发人员开发新需求功能");
                    //放开栅栏2
                    barrier2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        final Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //放开栅栏2
                    barrier2.await();
                    System.out.println("测试人员测试新功能");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("早上：");
        System.out.println("测试人员来上班了...");
        thread3.start();
        System.out.println("产品经理来上班了...");
        thread1.start();
        System.out.println("开发人员来上班了...");
        thread2.start();
    }
}
```
运行结果
```
    早上：
    测试人员来上班了…
    产品经理来上班了…
    开发人员来上班了…
    产品经理规划新需求
    开发人员开发新需求功能
    测试人员测试新功能
```
— 8 —

使用线程的 Sephmore(信号量) 实现线程按顺序执行

Sephmore(信号量):Semaphore是一个计数信号量,从概念上将，Semaphore包含一组许可证,如果有需要的话，每个acquire()方法都会阻塞，直到获取一个可用的许可证,每个release()方法都会释放持有许可证的线程，并且归还Semaphore一个可用的许可证。然而，实际上并没有真实的许可证对象供线程使用，Semaphore只是对可用的数量进行管理维护。

acquire():当前线程尝试去阻塞的获取1个许可证,此过程是阻塞的,当前线程获取了1个可用的许可证，则会停止等待，继续执行。

release():当前线程释放1个可用的许可证。

应用场景:Semaphore可以用来做流量分流，特别是对公共资源有限的场景，比如数据库连接。假设有这个的需求，读取几万个文件的数据到数据库中，由于文件读取是IO密集型任务，可以启动几十个线程并发读取，但是数据库连接数只有10个，这时就必须控制最多只有10个线程能够拿到数据库连接进行操作。这个时候，就可以使用Semaphore做流量控制。
```java
package com.wwj.javabase.thread.order;

import java.util.concurrent.Semaphore;
/**
 * @author wwj
 * 使用Sephmore(信号量)实现线程按顺序运行
 */
public class SemaphoreDemo {
    private static Semaphore semaphore1 = new Semaphore(1);
    private static Semaphore semaphore2 = new Semaphore(1);
    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("产品经理规划新需求");
                semaphore1.release();
            }
        });

        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore1.acquire();
                    System.out.println("开发人员开发新需求功能");
                    semaphore2.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore2.acquire();
                    thread2.join();
                    semaphore2.release();
                    System.out.println("测试人员测试新功能");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("早上：");
        System.out.println("测试人员来上班了...");
        thread3.start();
        System.out.println("产品经理来上班了...");
        thread1.start();
        System.out.println("开发人员来上班了...");
        thread2.start();
    }
}
```
运行结果
```text
    早上：
    测试人员来上班了…
    产品经理来上班了…
    开发人员来上班了…
    产品经理规划新需求
    开发人员开发新需求功能
    测试人员测试新功能
```

三、总结

看完了这么多种方法，是不是对多线程有了更深入的了解呢?不妨自己试试吧(代码拷贝均可运行)

使用的场景还有很多，根据开发需求场景，选择合适的方法，达到事半功倍的效果。