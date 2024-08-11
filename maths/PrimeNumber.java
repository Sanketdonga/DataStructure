
class CheckPrimeNumber {

    public boolean isPrimeNumber(int num) {
        num = Math.abs(num);
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeRec(int n, int i) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (i >= n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        } else {
            return isPrimeRec(n, i + 1);
        }
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        CheckPrimeNumber obj = new CheckPrimeNumber();
        int num = 13;
        System.out.println(obj.isPrimeNumber(num));
        System.out.println(CheckPrimeNumber.isPrimeRec(num,2));
    }
}
