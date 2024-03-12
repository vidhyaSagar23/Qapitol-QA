package org.threads.safe;

public class Trainer {
    synchronized void askQuestion(String name,String question){
        System.out.println(name+" asking "+question);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println(name+" got answer");
    }
}
