import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n; i++){
            sumLeft += Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n; i++){
            sumRight += Integer.parseInt(scanner.nextLine());
        }
        if (sumLeft == sumRight){
            System.out.println("Yes sum " + sumLeft);
        } else {
            System.out.println("No diff " + Math.abs(sumLeft - sumRight));
        }
    }
}
