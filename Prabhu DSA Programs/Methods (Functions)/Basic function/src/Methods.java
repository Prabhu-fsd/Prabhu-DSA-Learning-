import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        /*
        * return_type name (arguments){
        *       //body
        *       return statement;
        * }
        * */

        int ans = sum2(70,40);
        System.out.println(ans);

        }
        //pass the values in main and inside the return call function
        static int sum2(int a, int b){
            int sum = a + b;
            return sum;

        }

        //return the values

        static int sum1() {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter first number : ");
            int num1 = in.nextInt();

            System.out.print("Enter Second number : ");
            int num2 = in.nextInt();

            int sum = num1 + num2;

            return sum;

        }


}