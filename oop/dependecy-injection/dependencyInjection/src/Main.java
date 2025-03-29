import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Contract data\n");
            System.out.println("Number : ");
            int num = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the date(yyyy-MM-dd): ");
            String date = sc.nextLine();

            System.out.println("Contract's total value : ");
            Double totalValue = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter the quantity of installment :");
            int quantityInstallment = sc.nextInt();
            sc.nextLine();

            Contract contract = new Contract(num, LocalDate.parse(date), totalValue);
            ContractService service = new ContractService(new PaypalService());
            service.processContract(contract, quantityInstallment);

            System.out.println("\nInstallments\n");
            for (Installment installment : contract.getInstallments()) {
                System.out.println(installment.getDueDate() + " - " +
                        installment.getAmount());
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}