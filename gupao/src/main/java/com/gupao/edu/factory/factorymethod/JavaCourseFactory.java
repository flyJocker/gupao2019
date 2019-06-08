package com.gupao.edu.factory.factorymethod;

import com.gupao.edu.factory.ICourse;
import com.gupao.edu.factory.JavaCourse;

public class JavaCourseFactory extends ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
