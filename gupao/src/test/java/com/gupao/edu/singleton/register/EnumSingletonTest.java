package com.gupao.edu.singleton.register;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {

//    public static void main(String[] args) {
//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//        s2.setData(new Object());
//        FileOutputStream fos = null;
//        FileInputStream fis = null;
//        try {
//            fos = new FileOutputStream("seriableSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//
//            fis = new FileInputStream("seriableSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton)ois.readObject();
//            ois.close();
//
//            System.out.println(s1.getData());
//            System.out.println(s2.getData());
//            System.out.println(s1 == s2);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if(fos != null){
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(fis != null){
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton obj = (EnumSingleton)c.newInstance("Tom", 666);
            System.out.println(obj);
            //从JDK层面就为枚举不被序列化和反射破坏做好了所有工作
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
