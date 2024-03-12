package org.threads.safe;
public class Runner {
    public static void main(String[] args) {
        Trainer t1=new Trainer();
        Student s1=new Student(t1,"Encapsulation","Sagar");
        Student s2=new Student(t1,"JDBC","SAI");
        Student s3=new Student(t1,"JS","SUREN");

        s1.start();
        s2.start();
        s3.start();
    }
}
