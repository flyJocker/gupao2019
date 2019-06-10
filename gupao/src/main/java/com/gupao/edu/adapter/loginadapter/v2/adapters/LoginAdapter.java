package com.gupao.edu.adapter.loginadapter.v2.adapters;

import com.gupao.edu.adapter.loginadapter.ResultMsg;


/**
 * 在适配器里面，这个接口是可有可无的，不要跟模板模式混淆
 * 模板模式里面这里一定是抽象类，而这里仅仅是一个接口
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
