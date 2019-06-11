package com.gupao.edu.decorator.v2;

public class SausageDecorator extends BattercakeDecorator {

    public SausageDecorator(Battercake batterCake) {
        super(batterCake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
