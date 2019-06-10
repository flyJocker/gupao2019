package com.gupao.edu.template.course;

public abstract class NetworkCourse {

    protected final void createCourse(){
        //1、发布预习资料
        this.postPreResource();

        //2、制作PPT课件
        this.createPPT();

        //3、在线直播
        this.liveVideo();

        //4、提交课件、课堂笔记
        this.postNote();

        //5、提交源码
        this.postSource();

        //6、布置作业，有些课没有作业，有些课有作业
        //如果有作业，检查作业，如果没有作业，则完成
        if(needHomeWork()){
            checkHomeWork();
        }
    }

    abstract void checkHomeWork();

    //钩子方法：留给用户自己实现流程的微调
    protected boolean needHomeWork(){
        return false;
    }

    private void postSource() {
        System.out.println("提交源代码");
    }

    private void postNote() {
        System.out.println("提交课件和笔记");
    }

    private void liveVideo() {
        System.out.println("直播授课");
    }

    private void createPPT() {
        System.out.println("创建备课PPT");
    }

    protected final void postPreResource(){
        System.out.println("分发预习资料");
    }

}
