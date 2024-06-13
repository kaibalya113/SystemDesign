package design_patterns.CarRentalSystem.payment;

public class PaymentFactory {
    public Payment makePayment(PaymentType paymentType, Double amount){
        if(paymentType.name().equalsIgnoreCase(PaymentType.CREDIT.name())){
            return new Credit(amount);
        }else if(paymentType.name().equalsIgnoreCase(PaymentType.DEBIT.name())){
            return new Debit(amount);
        }
        return null;
    }
}
