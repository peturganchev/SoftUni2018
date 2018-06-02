import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPerson = Integer.parseInt(scanner.nextLine());
        int secondPerson = Integer.parseInt(scanner.nextLine());
        int thirdPerson = Integer.parseInt(scanner.nextLine());
        int sum = firstPerson + secondPerson + thirdPerson;
        int sumMinutes = sum / 60;
        int sumSeconds = sum % 60;
        if (sumSeconds < 10){
            System.out.printf("%d:0%d",sumMinutes,sumSeconds);
        } else {
            System.out.printf("%d:%d",sumMinutes,sumSeconds);
        }
    }
}
