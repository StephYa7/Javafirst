import java.lang.reflect.Array;
import java.util.Arrays;

public class ex006 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 2, 67, 4, 5, 7, 9, 0, 56, 4, 1 };
        System.out.println(Arrays.toString(arr(array)));

    }

    public static int[] arr(int[] array) {
        if (array.length ==1) return array;
        int[]left = arr(Arrays.copyOfRange(array, 0, array.length/2));
        int[]right = arr(Arrays.copyOfRange(array, array.length/2,array.length));
        int[]result = new int[array.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i<left.length && j < right.length){
            if (left[i]<=right[j]){
                result[k] =left[i];
                i++;
                k++;
            }
            else{
                result[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            result[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            result[k]=right[j];
            j++;
            k++;
        }
        return result;
    }
}
