package org.threads.safe;

public class Student extends Thread{

    Trainer trainer;
    String question;
    String name;

    public Student(Trainer trainer,String question,String name){
        this.trainer=trainer;
        this.name=name;
        this.question=question;
    }

    @Override
    public void run(){
        trainer.askQuestion(name,question);
    }
}
