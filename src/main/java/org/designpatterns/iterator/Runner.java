package org.designpatterns.iterator;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Book> list= Arrays.asList(
                new Book("Java","sagar"),
                new Book("SQL","Raghu"),
                new Book("JS","Prem")
        );

        Library lib=new Library(list);
        Iterator i=lib.createIterator();

        while(i.hasNext()){
            Book book=(Book) i.next();
            System.out.println(book);
        }
    }
}
