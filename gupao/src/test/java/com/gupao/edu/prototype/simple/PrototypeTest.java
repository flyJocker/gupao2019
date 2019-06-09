package com.gupao.edu.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) {
        ConcreteProtoTypeA concreteProtoType = new ConcreteProtoTypeA();
        concreteProtoType.setAge(18);
        concreteProtoType.setName("Tom");
        List hobbies = new ArrayList<String>();
        concreteProtoType.setHobbies(hobbies);

        Client client = new Client();
        ConcreteProtoTypeA copy = (ConcreteProtoTypeA)client.startClone(concreteProtoType);
        System.out.println(copy);

//        System.out.println();

        System.out.println("克隆对象中引用类型地址的值：" + copy.getHobbies());
        System.out.println("原对象中的引用类型地址的值：" + concreteProtoType.getHobbies());
        System.out.println("对象地址比较：" + (copy.getHobbies() == concreteProtoType.getHobbies()));
    }
}
