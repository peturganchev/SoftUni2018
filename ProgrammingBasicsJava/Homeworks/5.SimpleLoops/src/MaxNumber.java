import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            num = Integer.parseInt(scanner.nextLine());
            if (num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
