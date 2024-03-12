package org.threads;
public class Student implements Runnable{

    @Override
    public void run(){
        for (int i = 6; i <= 10 ; i++) {
            System.out.println("Student id = "+i);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
