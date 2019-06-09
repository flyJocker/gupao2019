package com.gupao.edu.proxy.dynamicproxy.gpproxy;

import com.gupao.edu.proxy.Person;
import com.gupao.edu.proxy.dynamicproxy.jdkproxy.Girl;
import com.gupao.edu.proxy.dynamicproxy.jdkproxy.JDKMeipo;

public class GPProxyTest {

    public static void main(String[] args) {
        try {
            Person obj = (Person)new GPMeipo().getInstance(new Girl());
            obj.findLove();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
