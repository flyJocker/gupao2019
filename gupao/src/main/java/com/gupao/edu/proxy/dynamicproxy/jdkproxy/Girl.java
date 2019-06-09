package com.gupao.edu.proxy.dynamicproxy.jdkproxy;

import com.gupao.edu.proxy.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
