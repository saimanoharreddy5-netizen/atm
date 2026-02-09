package Atm;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 20000;
        boolean exit = false;

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        System.out.println("1. Check Balance");

        if (pin == correctPin) {

            while (!exit) {

                System.out.println("2. Cash Withdrawal");
                System.out.println("3. Exit");
                System.out.print("Choose option: ");
                System.out.println("---.. ATM MENU ..---");

                int option = sc.nextInt();

                switch (option) {

                    case 1:
                        System.out.println("Your balance is: " + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        int amount = sc.nextInt();

                        if (amount > 0 && amount <= balance) {
                            balance -= amount;
                            System.out.println("Please take your cash");
                            System.out.println("Remaining balance: " + balance);
                        } else {
                            System.out.println("Insufficient balance");
                        }
                        break;

                    case 3:
                        System.out.println("Thank you for using ATM 🙏");
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid option");
                }
            }

        } else {
            System.out.println("Wrong PIN");
        }

        sc.close();
    }
}
