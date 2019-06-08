package com.gupao.edu.singleton.lazy;

//不用线程池，就用两个线程演示多线程安全
public class ExecutorThread implements Runnable{
    @Override
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
