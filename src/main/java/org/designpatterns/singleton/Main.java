package org.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
      Singleton s=Singleton.getInstance();

        System.out.println(s);
        System.out.println(s);

        s.display();
    }
}
