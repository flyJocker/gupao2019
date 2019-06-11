package com.gupao.edu.adapter.loginadapter.v2.adapters;

import com.gupao.edu.decorator.passport.old.ResultMsg;

public class RegistForQQAdapter implements RegistAdapter, LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
