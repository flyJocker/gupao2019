package com.gupao.edu.singleton.hungry;


//饿汉式单例

import java.io.Serializable;

/**
 *
 * 缺点：浪费内存空间
 *
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){ }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //重写readResolve方法，只不过是覆盖了反序列化出来的对象
    //还是创建了两次，发生在JVM层面，相对来说比较安全
    //之前反序列化出来的对象会被GC回收
    private Object readResolve(){
        return hungrySingleton;
    }
}
