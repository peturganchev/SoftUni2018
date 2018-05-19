import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double b1 = Double.parseDouble(console.nextLine());
        double b2 = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        System.out.println((b1+b2)*h/2);
    }
}
