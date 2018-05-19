import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double r = Double.parseDouble(console.nextLine());
        System.out.println(Math.PI*r*r);
        System.out.println(2*Math.PI*r);
    }
}
