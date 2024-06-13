package design_patterns.CarRentalSystem.payment;

public class Credit implements Payment{

    private double amount;

    public Credit(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean makePayment() {
        System.out.println(amount+" Payment done through Credit Card");
        return true;
    }
}
