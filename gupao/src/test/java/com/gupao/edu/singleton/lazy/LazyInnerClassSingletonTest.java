package com.gupao.edu.singleton.lazy;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        Class<?> clazz = LazyInnerClassSingleton.class;
        try {
            //调用者破坏单例，通过反射机制
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);//强行反射
            Object o1 = c.newInstance();
            Object o2 = LazyInnerClassSingleton.getInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
