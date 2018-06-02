import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String from = scanner.nextLine();
        String to = scanner.nextLine();
        switch (from){
            case "mm":
                num = num / 1000;
                break;
            case "cm":
                num = num / 100;
                break;
            case "mi":
                num = num * 1609.344;
                break;
            case "in":
                num = num / 39.3700787;
                break;
            case "km":
                num = num / 0.001;
                break;
            case "ft":
                num = num / 3.2808399;
                break;
            case "yd":
                num = num / 1.0936133;
                break;
        }
        switch (to){
            case "mm":
                num = num * 1000;
                break;
            case "cm":
                num = num * 100;
                break;
            case "mi":
                num = num / 1609.344;
                break;
            case "in":
                num = num * 39.3700787;
                break;
            case "km":
                num = num * 0.001;
                break;
            case "ft":
                num = num * 3.2808399;
                break;
            case "yd":
                num = num * 1.0936133;
                break;
        }
        System.out.printf("%.8f",num);
    }
}
