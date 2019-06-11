package com.gupao.edu.observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("tom");

        //从Struts到SpringMVC的升级
        //因为Struts面向的类，而SringMVC面向的是方法

        //前面两者面向的是类，Guava面向的是方法

        //guava是一个能够轻松落地观察者模式的一种解决方案
    }

}
