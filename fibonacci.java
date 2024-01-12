public class fibonacci {
    public static void main(String[] args) {
        int fib[] = new int[21];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= 20; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println("fib" + i + ": " + fib[i]);
        }
    }
}
