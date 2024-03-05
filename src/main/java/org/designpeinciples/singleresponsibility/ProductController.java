package org.designpeinciples.singleresponsibility;

public class ProductController {
    ProductService p=new ProductService();

    public void save(){
        p.save();
    }
    public void display(){
        p.getProducts();
    }
}
