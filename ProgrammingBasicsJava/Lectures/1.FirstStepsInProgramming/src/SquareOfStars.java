import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String line = "";
        String row = "";
        for (int i = 0; i < n; i++) {
            line += "*";
        }
        System.out.println(line);
        row = "*";
        for (int i = 0; i < n-2; i++) {
            row += " ";
        }
        row += "*";
        for (int i = 0; i < n-2; i++) {
            System.out.println(row);
        }
        System.out.println(line);
    }
}