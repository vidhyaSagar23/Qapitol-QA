package org.customannotation;

@Sagar(count=13)
public class MyClass {
    @Sagar(value = "I am developer")
    int sagaAge;

    public MyClass(int sagaAge){
        this.sagaAge=sagaAge;
    }

    @Sagar(count = 22,value = "Method annotation")
    public  void myMethod(){
        System.out.println("inside method annotation");
    }
}
