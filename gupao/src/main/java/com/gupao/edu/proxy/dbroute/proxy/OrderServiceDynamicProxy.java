package com.gupao.edu.proxy.dbroute.proxy;

import com.gupao.edu.proxy.dbroute.IOrderService;
import com.gupao.edu.proxy.dbroute.Order;
import com.gupao.edu.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    Object proxyObj;

    public Object getInstance(Object proxyObj){
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj = method.invoke(proxyObj, args);
        after(args[0]);
        return obj;
    }

    //target应该是订单对象order
    private void before(Object target) {
        try {
            //数据源的切换
            System.out.println("Proxy before method");

            //约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));

            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void after(Object target) {
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }
}
