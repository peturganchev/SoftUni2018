import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double bonusScore = 0;
        double score = 0;
        if (num > 1000){
            bonusScore = num * 0.1;
        } else if (num > 100){
            bonusScore = num * 0.2;
        } else if (num <= 100){
            bonusScore = 5;
        }
        if (num % 2 == 0){
            bonusScore += 1;
        }
        if (num % 10 == 5){
            bonusScore +=2;
        }
        score = num + bonusScore;
        System.out.println(bonusScore);
        System.out.println(score);
    }
}
