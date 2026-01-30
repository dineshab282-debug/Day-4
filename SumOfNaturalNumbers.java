import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt();

        int sum = 0;

        // Calculate sum of first N natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Print result
        System.out.println(sum);

        sc.close();
    }
}


