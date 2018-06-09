import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double OddSum = 0;
        double OddMin = Double.MAX_VALUE;
        double OddMax = -Double.MAX_VALUE;
        double EvenSum = 0;
        double EvenMin = Double.MAX_VALUE;
        double EvenMax = -Double.MAX_VALUE;
        for (int i = 1; i <= n; i++){
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0){
                EvenSum += num;
                if (EvenMin > num){
                    EvenMin = num;
                }
                if (EvenMax < num){
                    EvenMax = num;
                }
            } else {
                OddSum += num;
                if (OddMin > num){
                    OddMin = num;
                }
                if (OddMax < num){
                    OddMax = num;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.############");
        System.out.println("OddSum "+ df.format(OddSum));
        System.out.println("OddMin "+ (OddMin == Double.MAX_VALUE ? "No" : df.format(OddMin)));
        System.out.println("OddMax "+ (OddMax == -Double.MAX_VALUE ? "No" : df.format(OddMax)));
        System.out.println("EvenSum "+ df.format(EvenSum));
        System.out.println("EvenMin "+ (EvenMin == Double.MAX_VALUE ? "No" : df.format(EvenMin)));
        System.out.println("EvenMax "+ (EvenMax == -Double.MAX_VALUE ? "No" : df.format(EvenMax)));
    }
}
