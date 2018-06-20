import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String dollar = "$";
        for (int i = 0; i < n; i++) {
            System.out.println(dollar);
            dollar += " $";
        }
    }
}
