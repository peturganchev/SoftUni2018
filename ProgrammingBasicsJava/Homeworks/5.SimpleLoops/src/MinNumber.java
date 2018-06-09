import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            num = Integer.parseInt(scanner.nextLine());
            if (num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
