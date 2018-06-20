import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int width = n+5;
        System.out.println(String.format("%s^%s",
                repeatString("_", (width -1)/2),
                repeatString("_", (width -1)/2)));
        System.out.println(String.format("%s/|\\%s",
                repeatString("_", (width -1)/2 -1),
                repeatString("_", (width -1)/2 -1)));
    }
    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
