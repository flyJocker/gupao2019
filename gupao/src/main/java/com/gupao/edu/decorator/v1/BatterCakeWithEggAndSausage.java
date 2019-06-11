package com.gupao.edu.decorator.v1;

public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {

    @Override
    public String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
