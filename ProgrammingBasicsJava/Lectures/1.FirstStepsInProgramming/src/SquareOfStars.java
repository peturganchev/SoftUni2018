import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        String star = "";
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            star += "*";
        }
        System.out.println(star);
        star = "*";
        for (int i = 0; i < n-2; i++) {
            star += " ";
        }
        star += "*";
        for (int i = 0; i < n-2; i++) {
            System.out.println(star);
        }
        star = "";
        for (int i = 0; i < n; i++) {
            star += "*";
        }
        System.out.println(star);
    }
}
