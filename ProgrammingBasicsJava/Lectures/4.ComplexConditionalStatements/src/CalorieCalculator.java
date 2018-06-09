import java.util.Scanner;


        public class CalorieCalculator {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                String gender = scan.nextLine();
                double weight = Double.parseDouble(scan.nextLine());
                double height = Double.parseDouble(scan.nextLine());
                int age = Integer.parseInt(scan.nextLine());
                String activity = scan.nextLine();

                double BNM = 0;

                if (gender.equals("m")) {
                    BNM = 66 + (13.7 * weight) + (5 * height * 100) - (6.8 * age);
                } else {
                    BNM = 655 + (9.6 * weight) + (1.8 * height * 100) - (4.7 * age);
                }

                double calories = 0d;

                switch (activity) {
                    case "sedentary":
                        calories = BNM * 1.2;
                        break;
                    case "lightly active":
                        calories = BNM * 1.375;
                        break;
                    case "moderately active":
                        calories = BNM * 1.55;
                        break;
                    case "very active":
                        calories = BNM * 1.725;
                        break;
                }

                System.out.printf("To maintain your current weight you will need %.0f calories per day.",
                        Math.ceil(calories));
            }
        }

