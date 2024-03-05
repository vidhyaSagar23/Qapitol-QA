package org.designpatterns.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel sagar=new Channel();

        Subscriber s1=new Subscriber("Raghu");
        Subscriber s2=new Subscriber("prem");
        Subscriber s3=new Subscriber("sagar");
        Subscriber s4=new Subscriber("sai");

        sagar.subscribe(s1);
        sagar.subscribe(s2);
        sagar.subscribe(s3);
        sagar.subscribe(s4);

        s1.subscribeChannel(sagar);
        s2.subscribeChannel(sagar);
        s3.subscribeChannel(sagar);
        s4.subscribeChannel(sagar);

        sagar.unSubscribe(s2);

        sagar.upload("java basics uploaded");
    }
}
