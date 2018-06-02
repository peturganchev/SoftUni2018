import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        if (day.equals("Saturday")||day.equals("Sunday")){
            switch (fruit){
                case "banana":
                    sum = quantity * 2.70;
                    break;
                case "apple":
                    sum = quantity * 1.25;
                    break;
                case "orange":
                    sum = quantity * 0.90;
                    break;
                case "grapefruit":
                    sum = quantity * 1.60;
                    break;
                case "kiwi":
                    sum = quantity * 3.00;
                    break;
                case "pineapple":
                    sum = quantity * 5.60;
                    break;
                case "grapes":
                    sum = quantity * 4.20;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
            switch (fruit){
                case "banana":
                    sum = quantity * 2.50;
                    break;
                case "apple":
                    sum = quantity * 1.20;
                    break;
                case "orange":
                    sum = quantity * 0.85;
                    break;
                case "grapefruit":
                    sum = quantity * 1.45;
                    break;
                case "kiwi":
                    sum = quantity * 2.70;
                    break;
                case "pineapple":
                    sum = quantity * 5.50;
                    break;
                case "grapes":
                    sum = quantity * 3.85;
                    break;
                    default:
                        System.out.println("error");
                        break;
            }
        } else {
            System.out.println("error");
        }
        if (sum > 0.0) {
            System.out.printf("%.2f", sum);
        }
    }
}
