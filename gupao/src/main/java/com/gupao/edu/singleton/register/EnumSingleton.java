package com.gupao.edu.singleton.register;


//注册式单例模式
//反序列化破坏
//从JDK层面就为枚举不被序列化和反射破坏做好了所有工作
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
