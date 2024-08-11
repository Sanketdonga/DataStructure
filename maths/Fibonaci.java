
public class Fibonaci {

    //print n number of fibbonaci series
    public static void printFibonaciSeries(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a + " , ");
        System.out.print(b + " , ");
        for (int i = 3; i <= num; i++) {
            int c = a + b;
            System.out.print(c + " , ");
            a = b;
            b = c;
        }
    }

    //Find the N the number of fibonacci series
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        printFibonaciSeries(10);
        System.out.println("");
        System.out.println(fibo(5));
    }
}
