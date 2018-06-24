import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = tryParseInt(scanner.nextLine()); // use tryParseInt method with input from scanner
        while (n % 2 != 0) { // while the number is odd
            if (n == -1) { // if the number is -1 ( not an integer)
                System.out.println("Invalid number!");
            } else { // if the number is odd
                System.out.println("The number is not even.");
            }
            n = tryParseInt(scanner.nextLine()); // give n another value
        }
        System.out.println("Even number entered: " + n); // at the end print the even number
    }


    /**
     * @param stringFromScanner enter a string ex: "hello" or scanner.nextLine()
     * @return returns int or -1 if not integer
     */
    private static int tryParseInt(String stringFromScanner) { // method that tries to parse an string to integer
        int number;
        try {// try to do action
            number = Integer.parseInt(stringFromScanner); // parse stringFromScanner
        } catch (Exception e) { // if we get some exception then do the following
            return -1; // -1 is used for non int values
        }
        return number; // return the number
    }
}
