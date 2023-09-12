public class Multiples {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            boolean a3 = i % 3 == 0;
            boolean a5 = i % 5 == 0;

            if (a3 || a5) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
