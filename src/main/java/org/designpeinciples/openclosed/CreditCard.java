package org.designpeinciples.openclosed;

public class CreditCard implements IPayment{
    @Override
    public void payment(String paymentType) {
        System.out.println(paymentType);
    }
}
