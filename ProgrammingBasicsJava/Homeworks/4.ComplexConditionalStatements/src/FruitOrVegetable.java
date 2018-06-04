import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plant = scanner.nextLine();
        switch (plant){
            case "banana": // We use empty cases because we want all fruits to have the same print out to the console
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato": // Same as the fruits we want all vegetables to print "vegetable" in the console
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
                default:
                    System.out.println("unknown"); // If not a fruit, nor a vegetable print unknown
                    break;
        }
    }
}
