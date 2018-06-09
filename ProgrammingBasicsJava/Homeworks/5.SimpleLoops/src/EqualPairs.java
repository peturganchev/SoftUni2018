import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int previousSum = 0;
        int maxDiff = 0;
        int diff = 0;
        for ( int i = 0; i < n; i++){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int sum = a + b;
            if (i > 0 && sum != previousSum){
                diff = Math.abs(sum - previousSum);
            }
            if (maxDiff < diff){
                maxDiff = diff;
            }
            previousSum = sum;
        }
        if (maxDiff == 0){
            System.out.println("Yes value " + previousSum);
        } else {
            System.out.println("No maxdiff " + maxDiff);
        }
    }
}
