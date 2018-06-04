import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commision = 0;
        if (sales >= 0){
            switch (city){
                case "Sofia":
                    if (sales >= 0 & sales <=500){
                        commision = 0.05;
                    } else if (sales > 500 & sales <= 1000){
                        commision = 0.07;
                    }else if (sales > 1000 & sales <= 10000){
                        commision = 0.08;
                    } else if (sales > 10000){
                        commision = 0.12;
                    }
                    commision = commision * sales;
                    System.out.printf("%.2f",commision);
                    break;

                case "Varna":
                    if (sales >= 0 & sales <=500){
                        commision = 0.045;
                    } else if (sales > 500 & sales <= 1000){
                        commision = 0.075;
                    }else if (sales > 1000 & sales <= 10000){
                        commision = 0.10;
                    } else if (sales > 10000){
                        commision = 0.13;
                    }
                    commision = commision * sales;
                    System.out.printf("%.2f",commision);
                    break;

                case "Plovdiv":
                   if (sales >= 0 & sales <=500){
                    commision = 0.055;
                } else if (sales > 500 & sales <= 1000){
                    commision = 0.08;
                }else if (sales > 1000 & sales <= 10000){
                    commision = 0.12;
                } else if (sales > 10000){
                    commision = 0.145;
                }
                commision = commision * sales;
                System.out.printf("%.2f",commision);
                break;

                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}
