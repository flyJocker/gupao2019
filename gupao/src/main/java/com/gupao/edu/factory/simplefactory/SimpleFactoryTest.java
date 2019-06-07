package com.gupao.edu.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
//        ICourse course = new JavaCourse();
//        course.record();

        CourseFactory factory = new CourseFactory();
//        ICourse course = factory.create("java");
//        course.record();

//        ICourse course = factory.create("com.gupao.edu.factory.simplefactory.JavaCourse");
//        course.record();

        ICourse course = factory.create(JavaCourse.class);
        course.record();
        course = factory.create(PythonCourse.class);
        course.record();
    }
}
