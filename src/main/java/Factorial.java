public class Factorial {
    public static void main(String[] args) {
        final int NUM_FACTS = 100;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}
