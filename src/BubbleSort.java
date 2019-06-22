public class BubbleSort {
    public void bubbleSort (int[] A){
        int n=A.length;
        boolean swapped;
        do {
            swapped=false;
            for (int i = 1; i < n; i++) {
                if (A[i-1]>A[i]){
                    int temp = A[i];
                    A[i]=A[i-1];
                    A[i-1]=temp;
                    swapped=true;
                }
            }
        } while (swapped);
    }
}
