package com.gupao.edu.decorator.v2;

public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake batterCake) {
        super(batterCake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
