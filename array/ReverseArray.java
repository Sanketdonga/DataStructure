
public class ReverseArray {

    public static int[] reverse(int[] arr) {
        int low = 0;
        int heigh = arr.length - 1;
        while (low <= heigh) {
            int temp = arr[low];
            arr[low] = arr[heigh];
            arr[heigh] = temp;
            low++;
            heigh--;
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArr(arr);
        int[] revArr = reverse(arr);
        printArr(revArr);
    }
}
