import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int f0 = 0;
        int f1 = 1;
        int result = 0;
        if (n < 2) {
            System.out.println(1);
        } else {
            for (int i = 0; i < n; i++) {
                result = f0 + f1;
                f0 = f1;
                f1 = result;
            }
            System.out.println(result);
        }
    }
}
