public class CountNum {
    public static void main(String[] args) {
        int num = 9429282;

        int count = 0;
        while (num > 0){
            int reminder = num % 10;
            num = num / 10;
            if (reminder == 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
