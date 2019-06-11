package com.gupao.edu.decorator.v2;

import com.gupao.edu.decorator.v2.Battercake;

public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake;

        battercake = new BaseBatterCake();

        battercake = new EggDecorator(battercake);

        battercake = new EggDecorator(battercake);

        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() + "，总价格：" + battercake.getPrice());
    }

}
