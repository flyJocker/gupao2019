package com.gupao.edu.decorator.v1;

import com.gupao.edu.decorator.v1.BatterCakeWithEgg;
import com.gupao.edu.decorator.v1.BatterCakeWithEggAndSausage;
import com.gupao.edu.decorator.v1.Battercake;

public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + "，总价格：" + battercake.getPrice());

        Battercake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getMsg() + "，总价格：" + batterCakeWithEgg.getPrice());

        Battercake batterCakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(batterCakeWithEggAndSausage.getMsg() + "，总价格：" + batterCakeWithEggAndSausage.getPrice());
    }

}
