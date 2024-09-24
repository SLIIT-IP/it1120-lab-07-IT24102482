import java.util.Scanner;

public class IT24102482Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double discount_rate = 0.05;

        for(int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            System.out.println("Enter total bill amount: ");
            double total_bill = sc.nextDouble();

            System.out.println("Enter mode of payment (C for cash, O for other): ");
            char payment_mode = sc.next().charAt(0);

            double discount = 0.0;
            if (payment_mode == 'C'){
                discount = total_bill * discount_rate;
            } else if(payment_mode == 'O') {
                System.out.println("No discount is applicable.");
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            double amount_to_pay = total_bill - discount;

            System.out.println("Discount is: " + discount);
            System.out.println("Amount to be paid: " + amount_to_pay);
        }

    }
}