import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSUm = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                oddSum += Integer.parseInt(scanner.nextLine());
            } else {
                evenSUm += Integer.parseInt(scanner.nextLine());
            }
        }
        if (oddSum == evenSUm){
            System.out.println("Yes sum " + oddSum);
        } else {
            System.out.println("No diff " + Math.abs(oddSum - evenSUm));
        }
    }
}
