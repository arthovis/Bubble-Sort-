import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
