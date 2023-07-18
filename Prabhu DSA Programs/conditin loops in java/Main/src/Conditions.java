public class Conditions {
    public static void main(String[] args) {
        /*
        if (boolean expression T or F) {
            //body
        } else {
            //do this
        }
        */

        // mulitiple if else statements
        int salary = 2000;
        if (salary > 20000) {
            salary = salary + 2000;
        }
        else if (salary > 10000) {
            salary = salary + 1000;
        }
        else {
            salary = salary + 500;
        }
        System.out.println(salary);
    }
}