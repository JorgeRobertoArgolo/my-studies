package model.service;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        if (months > 1) {
            Double amount;
            LocalDate date = contract.getDate();
            for (int i = 1; i <= months; i++) {
                amount = 0.0;
                date =  date.plusMonths(1);

                amount = contract.getTotalValue() / months;
                amount += onlinePaymentService.interest(amount, i);
                amount += onlinePaymentService.paymentFee(amount);

                contract.addInstallment(new Installment(date, amount));
            }
        } else {
            System.out.println("Only possible from 2 installments");
        }
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
}