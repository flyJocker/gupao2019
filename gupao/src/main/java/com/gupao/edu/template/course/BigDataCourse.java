package com.gupao.edu.template.course;

public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeworkFlag;
    }
}
