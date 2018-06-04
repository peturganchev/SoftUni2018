import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        if (!(num >= 100 && num <= 200 || num == 0)){ // if the number is not between 100-200 or its not 0 then print invalid
            System.out.println("invalid");
        }
    }
}
