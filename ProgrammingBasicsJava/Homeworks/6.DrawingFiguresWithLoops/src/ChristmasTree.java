import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            System.out.println(String.format("%s%s | %s",
                    repeatString(" ", n-i),
                    repeatString("*", i),
                    repeatString("*", i)));
        }
    }
    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
