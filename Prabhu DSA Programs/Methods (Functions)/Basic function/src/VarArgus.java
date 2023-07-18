import java.util.Arrays;

public class VarArgus {
    public static void main(String[] args) {
        fun("Prabhu","raj","kunal" );
        multiple(20, 30, "dev");

    }
    static void multiple (int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
