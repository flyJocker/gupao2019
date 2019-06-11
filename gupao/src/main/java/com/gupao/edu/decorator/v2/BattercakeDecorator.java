package com.gupao.edu.decorator.v2;

public abstract class BattercakeDecorator extends Battercake {

    //静态代理，委派
    private Battercake batterCake;

    public BattercakeDecorator(Battercake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    public String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.batterCake.getPrice();
    }
}
