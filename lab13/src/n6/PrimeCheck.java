package n6;

public class PrimeCheck {

    public static void main(String[] args) {
        int n = 31;
        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int n, int divisor) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return isPrime(n, divisor + 1);
    }
}
