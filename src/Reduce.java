public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        while (n > 0) {
            boolean even = n % 2 == 0;
            if (even) {
                n = n / 2;
            }
            else {
                n--;
            }
            sum++;
        }
        System.out.println(sum);
    }
}
