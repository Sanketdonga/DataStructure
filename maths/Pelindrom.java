
import java.util.Scanner;


public class Pelindrom {

    public static boolean isPelindrom(long num) {
        long orgNum = num;
        long revNum = 0;
        while (num != 0) {
            long div = num % 10;
            num = num / 10;
            revNum = revNum * 10 + div;
        }
        return orgNum == revNum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        long num=sc.nextLong();
        System.out.println(isPelindrom(num));
        sc.close();
    }
}
