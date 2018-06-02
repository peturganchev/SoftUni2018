import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short hours = Short.parseShort(scanner.nextLine());
        short minutes = (short)(Short.parseShort(scanner.nextLine()) + 15);
        if (minutes >= 60){
            hours++;
            minutes = (short) (minutes - 60);
            if (hours>23){
                hours = 0;
            }
        }
        if (minutes < 10)
        {
            System.out.printf("%d:0%d",hours,minutes);
        } else {
            System.out.printf("%d:%d",hours,minutes);
        }
    }
}
