import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        switch (type){
            case "Premiere":
                sum = row * col * 12.00;
                break;
            case "Normal":
                sum = row * col * 7.50;
                break;
            case "Discount":
                sum = row * col * 5.00;
                break;
        }
        System.out.printf("%.2f",sum);
    }
}
