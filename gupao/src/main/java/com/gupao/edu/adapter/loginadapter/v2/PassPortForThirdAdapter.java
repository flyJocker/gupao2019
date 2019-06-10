package com.gupao.edu.adapter.loginadapter.v2;

import com.gupao.edu.adapter.loginadapter.ResultMsg;
import com.gupao.edu.adapter.loginadapter.v1.service.SiginService;
import com.gupao.edu.adapter.loginadapter.v2.adapters.*;

/**
 * 结合了策略模式、工厂模式适配器模式
 */
public class PassPortForThirdAdapter extends SiginService implements IPassPortForThird {

    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username, passport);
        return super.login(username, passport);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz){
        try{
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(key, adapter);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
