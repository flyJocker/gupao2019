package com.gupao.edu.factory.factorymethod;

import com.gupao.edu.factory.ICourse;
import com.gupao.edu.factory.PythonCourse;

public class PythonCourseFactory extends ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
