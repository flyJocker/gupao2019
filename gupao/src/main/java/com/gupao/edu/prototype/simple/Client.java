package com.gupao.edu.prototype.simple;

public class Client {

//    private ProtoType protoType;

//    public Client (ProtoType protoType){
//        this.protoType = protoType;
//    }

    public ProtoType startClone(ProtoType concretePrototype){
        return concretePrototype.clone();
    }
}
