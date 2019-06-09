package com.gupao.edu.prototype.simple;

import java.util.List;

public class ConcreteProtoTypeA implements ProtoType {

    private int age;//年龄
    private String name;//姓名
    private List hobbies;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public List getHobbies() {
        return hobbies;
    }

    @Override
    public ProtoType clone() {
        ConcreteProtoTypeA concreteProtoType = new ConcreteProtoTypeA();
        concreteProtoType.setAge(this.age);
        concreteProtoType.setName(this.name);
        concreteProtoType.setHobbies(this.hobbies);
        return concreteProtoType;
    }
}
