import java.util.Arrays;

public class MergeSort {

    public static void main (String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        // divide array into two arrays, which are unsorted, the first array is the left array, the second is the right array
        // keep splitting until only one element each
        // merge every left/right pair of sibling arrays into a sorted array
        // repeat until you have a single sorted array
        // not an in-place algorithm
        // O (n log n)

//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }
        mergeSort(intArray, 0, intArray.length);
    }

    public static void mergeSort(int[] input, int start, int end) {
        // if the length of the array is 1 or fewer
        if (end - start < 2) {
            System.out.println(input[start]);
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
//        for (int i = 0; i < lArray.length; i++) {
//            System.out.println(lArray[i]);
//        }
//        for (int i = 0; i < rArray.length; i++) {
//            System.out.println(rArray[i]);
//        }

    }

    public static void merge(int[] input, int start, int mid, int end) {
        // if the last element to the left array is less than the right array, then we can copy the entire left array then right array into temp array.
        if (input[mid - 1] <= input[mid]) {
           return;
        }
    }

}
