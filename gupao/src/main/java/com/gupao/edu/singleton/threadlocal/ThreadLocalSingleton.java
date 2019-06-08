package com.gupao.edu.singleton.threadlocal;

//注册时单例（容器式）
//线程内线程安全，伪线程安全
//ThreadLocal初始化时
// ThreadLocalMap<key, value>,key为当前线程
// value是初始化的ThreadLocalSingleton对象
//使用ThreadLocal来实现多数据源动态切换
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
