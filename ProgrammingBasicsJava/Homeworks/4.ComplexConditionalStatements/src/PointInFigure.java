import java.util.Scanner;

public class PointInFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());;
        int x = Integer.parseInt(scanner.nextLine());;
        int y = Integer.parseInt(scanner.nextLine());;

        boolean insideBottom = (x > 0 && x < h * 3 && y > 0 && y < h);
        boolean insideTop = (x > h && x < h * 2 && y > 0 && y < h * 4);
        boolean outsideTop = (x < h || x > h * 2 || y < 0 || y > h * 4);
        boolean outsideBottom = (x < 0 || x > h * 3 || y < 0 || y > h);

        if (insideBottom || insideTop) {
            System.out.println("Inside");
        } else if (outsideTop && outsideBottom) {
            System.out.println("Outside");
        } else {
            System.out.println("Border");
        }
    }
}
