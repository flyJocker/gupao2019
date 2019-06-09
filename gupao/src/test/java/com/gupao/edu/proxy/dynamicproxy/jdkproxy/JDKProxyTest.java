package com.gupao.edu.proxy.dynamicproxy.jdkproxy;

import com.gupao.edu.proxy.Person;
import com.gupao.edu.proxy.dynamicproxy.jdkproxy.JDKMeipo;

public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            Person obj = (Person)new JDKMeipo().getInstance(new Girl());
            obj.findLove();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
