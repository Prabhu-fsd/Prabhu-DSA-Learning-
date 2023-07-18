public class Shadowing {
    static int x = 20; // shadowing means same variable calls over again that global variable is shadowed
    public static void main(String[] args) {
        System.out.println(x); //this will be shadowed by no 7 line x
        fun();
        int x = 50;
        System.out.println(x); //this is called local variable x and its overlaps no 4 line x
    }
    static void fun(){
        System.out.println(x);
    }
}
