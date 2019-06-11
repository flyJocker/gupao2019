package com.gupao.edu.adapter.loginadapter.v2.adapters;

import com.gupao.edu.decorator.passport.old.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }

}
