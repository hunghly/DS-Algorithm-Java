public class SelectionSort {

    public static void main(String[] args) {
        // Doing selection sort using a search for max value
        // and assigning to last position of array;
        // You can also do min value and swap with first position
        // It's also O(n^2) - quadratic complexity
        // Does not require as much swapping as bubble sort
        // It is an unstable algorithm
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        int maxIndex;

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            maxIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[maxIndex]) {
                    maxIndex = i;
                }
            }
            swap(intArray, maxIndex, lastUnsortedIndex);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}