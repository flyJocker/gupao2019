package com.gupao.edu.proxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibTest {

    public static void main(String[] args) {
        try {
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "F://projectRunFile");
            Customer obj = (Customer) new CGlibMeipo().getInstance(Customer.class);
            System.out.println(obj);
            obj.findLove();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
