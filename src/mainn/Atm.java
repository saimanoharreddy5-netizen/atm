package mainn;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 20000;

        System.out.println("Enter PIN:");
        int pin = sc.nextInt();

        if (pin == correctPin) {

            System.out.println("1. Check Balance");
            System.out.println("2. Cash Withdrawal");
            System.out.print("Choose option: ");
            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    int amount = sc.nextInt();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Please take cash");
                        System.out.println("Remaining balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } else {
            System.out.println("Wrong PIN");
        }

        sc.close();
    }
}
