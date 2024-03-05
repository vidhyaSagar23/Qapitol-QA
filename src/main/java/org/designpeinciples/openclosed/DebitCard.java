package org.designpeinciples.openclosed;

public class DebitCard implements IPayment{
    @Override
    public void payment(String paymentType) {
        System.out.println(paymentType);
    }
}
