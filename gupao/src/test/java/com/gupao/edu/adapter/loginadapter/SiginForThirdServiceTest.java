package com.gupao.edu.adapter.loginadapter;

import com.gupao.edu.adapter.loginadapter.v1.service.SinginForThirdService;

public class SiginForThirdServiceTest {

    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("tom", "123456");
        service.loginForQQ("dsdadsadwd");
        service.loginForWechat("dsadawea");
    }
}
