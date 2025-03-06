import java.util.Scanner;

public class FibonacciSum {
    public static int fibonacciSum(int n) {
        if (n <= 0) return 0;
        int a = 0, b = 1, sum = a + b;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        System.out.println("Sum of Fibonacci series up to " + terms + " terms: " + fibonacciSum(terms));
        sc.close();
    }
}
