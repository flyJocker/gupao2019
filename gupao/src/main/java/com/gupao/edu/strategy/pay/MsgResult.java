package com.gupao.edu.strategy.pay;

public class MsgResult {

    private int code;
    private Object data;
    private String msg;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "交易状态[" + code + "]，" + msg +
                "，交易详情：" + data;
    }
}
