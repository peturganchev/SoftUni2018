import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int width = 5*n;
        for (int i = 0; i < n/2; i++) {
            System.out.printf("%s%s%s",
                    repeatString(".", n+i),
                    repeatString("#", n*3 -i*2),
                    repeatString(".", n+i));
            System.out.println();
        }
        for (int i = 0; i < (n/2+1); i++) {
            System.out.printf("%s#%s#%s",
                    repeatString(".", n+n/2+i),
                    repeatString(".", 2*(n-i)-2),
                    repeatString(".", n+n/2+i));
            System.out.println();
        }
        System.out.printf("%s%s%s",
                repeatString(".", n*2),
                repeatString("#", n),
                repeatString(".", n*2));
        System.out.println();

        for (int i = 0; i < (n/2); i++) {
            System.out.printf("%s%s%s",
                    repeatString(".", n*2-2),
                    repeatString("#", n+4),
                    repeatString(".", n*2-2));
            System.out.println();
        }
        System.out.printf("%sD^A^N^C^E^%s",
                repeatString(".", (width - 10)/2),
                repeatString(".", (width - 10)/2));
        System.out.println();
        for (int i = 0; i < (n/2+1); i++) {
            System.out.printf("%s%s%s",
                    repeatString(".", n*2-2),
                    repeatString("#", n+4),
                    repeatString(".", n*2-2));
            System.out.println();
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
