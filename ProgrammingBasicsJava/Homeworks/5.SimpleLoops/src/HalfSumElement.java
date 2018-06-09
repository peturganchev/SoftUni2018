import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int num = 0;
        for (int i = 0; i < n; i++){
            num = Integer.parseInt(scanner.nextLine());
            if (num > max){
                max = num;
            }
            sum += num;
        }
        if ((sum - max) == max){
            System.out.println("Yes sum " + max);
        } else {
            System.out.println("No diff " + Math.abs(sum - (2 * max)));
        }
    }
}
