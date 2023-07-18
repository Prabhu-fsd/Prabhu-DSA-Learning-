import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 89, 35};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Change(int[] nums){
        nums[4] = 99;

    }
}
