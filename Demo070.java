public class Demo070 {
    public static void main(String[] args) {
        int[] numbers = {10, 17, 19, 22, 23, 33, 37, 40, 41};
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
