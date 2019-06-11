package com.gupao.edu.decorator.upgrade;

import com.gupao.edu.decorator.passport.upgrade.SiginForThirdService;
import com.gupao.edu.decorator.passport.old.SiginService;
import com.gupao.edu.decorator.passport.upgrade.ISiginForThirdService;

public class DecoratorTest {

    public static void main(String[] args) {
        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SiginService());
        siginForThirdService.loginForQQ("dsadasdas");
    }

}
