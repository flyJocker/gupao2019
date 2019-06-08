package com.gupao.edu.singleton.register;

import com.gupao.edu.singleton.ConcurrentExecutor;

public class ContainerSingletonTest {

    public static void main(String[] args) {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getBean("com.gupao.edu.singleton.register.Pojo");
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                }
            }, 10, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
