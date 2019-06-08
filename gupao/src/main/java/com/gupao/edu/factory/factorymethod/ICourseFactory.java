package com.gupao.edu.factory.factorymethod;

import com.gupao.edu.factory.ICourse;

//public interface ICourseFactory {
public abstract class ICourseFactory{
    public void preCreate(){

    }
    abstract ICourse create();
//    ICourse create();
}
