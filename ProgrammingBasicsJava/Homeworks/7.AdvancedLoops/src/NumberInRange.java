import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n < 1 || n > 100) {
            System.out.println("Еnter a number in the range [1...100]:\nInvalid number!");
            n = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Еnter a number in the range [1...100]:\nThe number is: " + n);
    }
}
