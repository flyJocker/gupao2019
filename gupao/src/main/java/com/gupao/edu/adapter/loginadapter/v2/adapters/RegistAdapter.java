package com.gupao.edu.adapter.loginadapter.v2.adapters;

import com.gupao.edu.adapter.loginadapter.ResultMsg;

public interface RegistAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
