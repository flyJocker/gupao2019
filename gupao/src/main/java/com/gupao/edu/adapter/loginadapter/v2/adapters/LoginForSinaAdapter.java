package com.gupao.edu.adapter.loginadapter.v2.adapters;

import com.gupao.edu.decorator.passport.old.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForSinaAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
