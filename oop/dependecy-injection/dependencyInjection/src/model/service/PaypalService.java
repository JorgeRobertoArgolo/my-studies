package model.service;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double paymentFee(Double amount) {
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (months <= 0) {
            throw new IllegalArgumentException("Month must be bigger than zero");
        }

        return amount * (0.01 * months);
    }
}