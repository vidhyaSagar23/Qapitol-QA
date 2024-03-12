package org.threads;

public class Employee extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Employee id = "+i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
