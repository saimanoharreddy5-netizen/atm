package mainn.Coding;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not a primeNumber");
                return;
            }
        }
        System.out.println("prime number");
    }
}
