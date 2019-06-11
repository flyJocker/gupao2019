package com.gupao.edu.decorator.passport.upgrade;

import com.gupao.edu.decorator.passport.old.ISiginService;
import com.gupao.edu.decorator.passport.old.ResultMsg;

public class SiginForThirdService implements ISiginForThirdService{

    private ISiginService siginService;

    public SiginForThirdService(ISiginService siginService) {
        this.siginService = siginService;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return this.siginService.regist(username, password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return this.siginService.login(username, password);
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }
}
