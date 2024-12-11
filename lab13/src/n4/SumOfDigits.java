package n4;

public class SumOfDigits {

    public static void main(String[] args) {
        int k = 3;
        int s = 6;
        System.out.println(countNumbers(k, s));
    }

    public static int countNumbers(int k, int s) {
        return countRecursive(0, 0, k, s);
    }

    public static int countRecursive(int position, int sum, int k, int s) {
        if (position == k) {
            return sum == s ? 1 : 0;
        }
        int startDigit = (position == 0) ? 1 : 0;
        int count = 0;
        for (int digit = startDigit; digit <= 9; digit++) {
            count += countRecursive(position + 1, sum + digit, k, s);
        }
        return count;
    }
}
