import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
