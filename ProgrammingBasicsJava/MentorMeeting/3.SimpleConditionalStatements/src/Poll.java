import java.util.Scanner;

public class Poll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int participantsNumber = Integer.valueOf(scanner.nextLine());
        int votedFirstPlace = Integer.valueOf(scanner.nextLine());

        double votedSecondPlace = votedFirstPlace - (votedFirstPlace * 0.2);
        double votedThirdPlace = votedSecondPlace - (votedSecondPlace * 0.1);

        double sumFirstThreePlaces = votedFirstPlace + votedSecondPlace + votedThirdPlace;
        double voteDifference = Math.floor(sumFirstThreePlaces - (participantsNumber/2));

        if (voteDifference >=0) {
            System.out.printf("First three languages have %.0f votes more", voteDifference);
        } else {
            System.out.printf("First three languages have %.0f votes less of half votes", Math.abs(voteDifference));
        }
    }
}
