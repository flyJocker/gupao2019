package com.gupao.edu.singleton.lazy;

import java.io.Serializable;

//懒汉式单例
//全程没有用到synchronized关键字
//性能最优的一种写法
//作业：理解内部类的执行逻辑
public class LazyInnerClassSingleton {

    //虽然构造方法私有了，但是可以通过反射破坏
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例对象");
        }
    }


    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    //LazyHolder里面的逻辑需要等到外部方法调用时才执行
    //巧妙利用了内部类的特性
    //JVM底层执行逻辑，完美的避免了线程安全问题
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
