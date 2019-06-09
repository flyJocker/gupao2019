package com.gupao.edu.proxy.dbroute;

import com.gupao.edu.proxy.dbroute.db.DynamicDataSourceEntity;
import com.gupao.edu.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import com.gupao.edu.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class DbRouteProxyTest {

    public static void main(String[] args) {
        try {
            Order order = new Order();

//        order.setCreateTime(new Date().getTime());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
