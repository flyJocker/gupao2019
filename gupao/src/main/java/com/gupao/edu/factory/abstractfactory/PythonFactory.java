package com.gupao.edu.factory.abstractfactory;

import com.gupao.edu.factory.ICourse;

public class PythonFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return null;
    }

    @Override
    public INote createNote() {
        return null;
    }

    @Override
    public IVideo createVideo() {
        return null;
    }
}
