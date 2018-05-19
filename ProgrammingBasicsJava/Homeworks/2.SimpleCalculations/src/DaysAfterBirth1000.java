import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysAfterBirth1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(),formatter);
       dateOfBirth = dateOfBirth.plusDays(999);
        System.out.println(formatter.format(dateOfBirth));
    }
}
