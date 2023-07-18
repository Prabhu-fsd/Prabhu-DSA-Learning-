public class Scoping {
    public static void main(String[] args) {
        //scoping means if the variables runs within the function
        int a = 10;
        String name = "Prabhu";
        {
            //here it is called block of code within the function
            //value is initialized in this block , it will remain in this block
            // if I am accessing the value of a here it cant be accessed over because block of code separated by function
            a = 100; //here i cant use the same data type but i can change the value
            name = "raj";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
    }
    static  void Scope(){
        int num = 10;
        System.out.println(num);
    }
}
