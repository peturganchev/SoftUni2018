import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int roofRow=0;
        if (n % 2 == 0){
            for (int i = 0; i < (n+1)/2; i++) {
                System.out.println(String.format("%s%s**%s",
                        repeatString("-",(n-2-roofRow)/2),
                        repeatString("*",roofRow),
                        repeatString("-",(n-2-roofRow)/2)
                ));
                roofRow += 2;
            }
        } else {
            for (int i = 0; i < (n+1)/2; i++) {
                System.out.println(String.format("%s%s*%s",
                        repeatString("-",(n-1-roofRow)/2),
                        repeatString("*",roofRow),
                        repeatString("-",(n-1-roofRow)/2)
                ));
                roofRow += 2;
            }
        }
        for (int i = 0; i < n/2; i++) {
            System.out.println(String.format("|%s|",
                    repeatString("*",n-2)));
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
