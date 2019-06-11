package com.gupao.edu.decorator.v1;

public class BatterCakeWithEgg extends Battercake {

    @Override
    public String getMsg() {
        return super.getMsg() + "1个鸡蛋";
    }

    //加一个鸡蛋加一块钱
    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
