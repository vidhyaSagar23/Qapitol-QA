package org.threads;
public class Runner {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.start();
        Student s=new Student();
        Thread t=new Thread(s);
        t.start();
    }
}
