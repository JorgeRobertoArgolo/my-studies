package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Installment> installments = new ArrayList<>();;

    public Contract() {}

    public Contract(Integer number, LocalDate date, Double totalValue) {
        super();
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public void addInstallment(Installment installment) {
        if (installment != null) {
            List<Installment> list = getInstallments();
            list.add(installment);
        }
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
