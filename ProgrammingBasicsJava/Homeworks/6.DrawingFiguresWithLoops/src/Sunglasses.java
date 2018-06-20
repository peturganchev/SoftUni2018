import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("%s%s%s",
                repeatString("*", 2*n),
                repeatString(" ", n),
                repeatString("*", 2*n)));
        for (int i = 0; i < n-2; i++) {
            if (i == ((n-1) / 2 - 1)){
                System.out.println(String.format("*%s*%s*%s*",
                        repeatString("/", 2*n-2),
                        repeatString("|", n),
                        repeatString("/", 2*n-2)
                        ));
            } else {
                System.out.println(String.format("*%s*%s*%s*",
                        repeatString("/", 2*n-2),
                        repeatString(" ", n),
                        repeatString("/", 2*n-2)
                ));
            }
        }
        System.out.println(String.format("%s%s%s",
                repeatString("*", 2*n),
                repeatString(" ", n),
                repeatString("*", 2*n)));
    }
    private static String repeatString(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
