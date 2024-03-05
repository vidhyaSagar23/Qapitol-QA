package org.designpatterns.singleton;

public class Singleton {
    private static Singleton singleton=null;
    private Singleton(){
        System.out.println("Singleton initialized once");
    }
    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
    public void display(){
        System.out.println("Displaying");
    }
}
