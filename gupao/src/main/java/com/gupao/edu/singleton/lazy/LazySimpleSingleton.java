package com.gupao.edu.singleton.lazy;

//懒汉式单例简单实现方式
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {}

    //jdk1.5之后对synchronized性能优化了不少
    //不可避免的还是存在一定的性能问题
    public static synchronized LazySimpleSingleton getInstance(){
        if(lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
