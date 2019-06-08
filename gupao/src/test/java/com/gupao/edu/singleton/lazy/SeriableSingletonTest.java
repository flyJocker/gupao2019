package com.gupao.edu.singleton.lazy;

import com.gupao.edu.singleton.hungry.HungrySingleton;

import java.io.*;

//序列化破坏单例模式
public class SeriableSingletonTest {

    public static void main(String[] args) {
        HungrySingleton s1 = null;
        HungrySingleton s2 = HungrySingleton.getInstance();
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("seriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            fis = new FileInputStream("seriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (HungrySingleton)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
