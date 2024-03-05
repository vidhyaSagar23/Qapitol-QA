package org.designpeinciples.singleresponsibility;

public class Runner {
   static ProductController p=new ProductController();
    public static void main(String[] args) {
        p.save();
        p.display();
    }
}
