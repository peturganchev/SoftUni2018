import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n-1){
                System.out.print("+ ");
            }else {
                System.out.print("| ");
            }
            for (int j = 0; j < n - 2; j++) {
                System.out.print("- ");
            }
            if (i == 0 || i == n-1){
                System.out.print("+");
            }else {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
