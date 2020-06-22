public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1 - 22 };

        // Also an in-place algorithm
        // Runs in O(n^2) - quadratic
        // It is a stable sorting algorithm
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int currentElement = intArray[firstUnsortedIndex];
            int j;
            for (j = firstUnsortedIndex; j > 0 && intArray[j - 1] > currentElement; j--) {
                // go through the unsorted index and swap as long as the currentElement is less
                // than the previous index
                intArray[j] = intArray[j - 1];
            }
            intArray[j] = currentElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}