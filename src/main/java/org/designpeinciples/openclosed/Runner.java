package org.designpeinciples.openclosed;

public class Runner {
    public static void main(String[] args) {
        IPayment i1=new CreditCard();
        i1.payment("Creditcard");

        IPayment i2=new DebitCard();
        i2.payment("Debit card");
    }
}
