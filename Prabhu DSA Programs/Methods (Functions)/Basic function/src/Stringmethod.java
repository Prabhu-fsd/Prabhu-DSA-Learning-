import java.util.Scanner;

public class Stringmethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = in.nextLine();
        String Person = greet(name);
        System.out.println(Person);

    }
    static String greet(String name) {
        String message = ("Hello " + name);
        return message;
    }
}
