import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits) {
            case "Mango" -> System.out.println("King of sweetness");
            case "apple" -> System.out.println(" a red fruit");
            case "guva" -> System.out.println("a green fruit");
            default -> System.out.println("select a valid one");
        }
    }
}