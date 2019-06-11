package com.gupao.edu.observer.gperadvice;

public class ObserverTest {

    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于那些场景？");
        gper.addObserver(tom);
        gper.addObserver(mic);
        gper.publishQuestion(question);
    }

}
