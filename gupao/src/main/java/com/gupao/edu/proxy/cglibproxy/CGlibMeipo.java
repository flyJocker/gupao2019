package com.gupao.edu.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


//JDK是采用读取接口的信息
//cglib覆盖父类方法
//目的：都是生成一个新的类，去实现增强代码逻辑的功能

//JDK Proxy 对于用户而言，必须要有一个接口实现，目标类相对来说复杂
//cglib 可以代理任意一个普通的类，没有任何要求

//cglib 生成代理的逻辑更复杂，效率低，但是调用效率更高，因为生成了一个包含了所有的逻辑的FashClass，不再需要反射调用
//JDK Proxy 生成代理的逻辑简单，执行效率相对要低，每次都要反射动态调用

//cglib 有个坑，cglib不能代理final方法
public class CGlibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        //这个类相当于JDK代理中的Proxy,代理工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("ok的话，准备办事");
    }

}
