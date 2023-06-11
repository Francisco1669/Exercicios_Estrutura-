public class Fibonacci {
    public int recursao(int n) {
        if (n < 2) {
            return n;
        } else {
            return recursao(n-1) + recursao(n-2);
        }
    }
}