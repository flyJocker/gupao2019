package com.gupao.edu.strategy.pay;

import com.sun.org.apache.xpath.internal.operations.Or;

public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1", "2019031300000", 324.5);
        MsgResult result = order.pay(PayStrategy.UNION_PAY);
        System.out.println(result);
    }
}
