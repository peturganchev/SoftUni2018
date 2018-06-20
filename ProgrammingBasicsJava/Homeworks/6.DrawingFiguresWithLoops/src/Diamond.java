import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int OuterSpace; // used for calculating how many - there are outside of the diamond

        if (n % 2 == 0){ // for even numbers
            for (int i = 0; i < n/2; i++) { // making the upper part
                OuterSpace = ((n-2)-2*i)/2;
                System.out.println(String.format("%s*%s*%s",
                        repeatString("-",OuterSpace), // how many - there are on the left
                        repeatString("-",i*2), // how many - there are inside
                        repeatString("-",OuterSpace))); // how many - there are on the right
            }
            for (int i = 0; i < n/2 -1; i++) { // making the lower part
                System.out.println(String.format("%s*%s*%s",
                        repeatString("-",i+1), // how many - there are on the left
                        repeatString("-",n-4-2*i), // how many - there are inside
                        repeatString("-",i+1))); // how many - there are on the right
            }
        } else { // for odd numbers
            System.out.println(String.format("%s*%s", // drawing the first line --*--
                    repeatString("-", (n-1)/2), // - on the left
                    repeatString("-",(n-1)/2))); // - on the right
            for (int i = 1; i < n/2+1; i++) { // drawing the upper body after the first line
                OuterSpace = ((n-1)-2*i)/2;
                System.out.println(String.format("%s*%s*%s", // prints the -*--*- part of the body
                        repeatString("-",OuterSpace), // - on the left
                        repeatString("-",i*2-1), // - inside
                        repeatString("-",OuterSpace))); // - on the right
            }
            for (int i = 0; i < n/2-1; i++) { // printing lower part of the body
                System.out.println(String.format("%s*%s*%s",
                        repeatString("-",i+1), // - on the left
                        repeatString("-",n-2*(i+2)), // - inside
                        repeatString("-",i+1))); // - on the right
            }
            if (n>1) { // couldn't think of a formula for n == 1
                System.out.println(String.format("%s*%s", // prints the last line --*--
                        repeatString("-", (n - 1) / 2), // - on the left
                        repeatString("-", (n - 1) / 2))); // - on the right
            }
        }
    }

    /**
     *
     * @param text input a string you want to be repeated. ex. -
     * @param count how many times you want to be repeated. ex. 4
     * @return returns a repeated string. ex. ----
     */
    private static String repeatString(String text, int count) { // use this to quickly repeat any string or char
        StringBuilder result = new StringBuilder(); // creates StringBuilder (for faster string formatting)
        for (int i = 0; i < count; i++) { // how many times will the string be repeated
            result.append(text); // add the input string to the result string
        }
        return result.toString(); // returns the final result as a String
    }
}
