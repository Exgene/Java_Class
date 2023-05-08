import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lower limit of the range: ");
        int lower = input.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int upper = input.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + " are: ");

        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
