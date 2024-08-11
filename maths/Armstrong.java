

public class Armstrong {
    public static boolean isArmStrong(long num){
        int n=String.valueOf(num).length();
        long orgNum=num;
        long sum=0;
        while (num!=0) { 
            long digit=num%10;
            num=num/10;
            sum+=Math.pow(digit, n);
        }
        return  sum==orgNum;
    }
    public static void main(String[] args) {
        long num=1634;
        System.out.println(isArmStrong(num));
    }
}
