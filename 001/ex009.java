import java.util.Arrays;

public class ex009 {
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 22, 4, 5, 5, 7, 5, 6, 7 };

        ex009 ob = new ex009();
        ob.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public void sort(int arr[]) {
        int len = arr.length;

        for (int i = len / 2 - 1; i >= 0; i--)
            heapify(arr, len, i);


        for (int i = len - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2; 

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}