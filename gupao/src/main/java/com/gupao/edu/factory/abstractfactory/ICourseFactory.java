package com.gupao.edu.factory.abstractfactory;

import com.gupao.edu.factory.ICourse;

//要求所有的子工厂都实现这个工厂
//（一个品牌的抽象）

//不符合开闭原则
//扩展性非常强
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
