package design_patterns.CarRentalSystem.payment;

public class Debit implements Payment{
    private double amount;

    public Debit(double amount) {
        this.amount = amount;
    }
    @Override
    public boolean makePayment() {
        System.out.println(amount+" Payment done thorugh debit card");
        return true;
    }
}
