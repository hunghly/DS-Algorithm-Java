public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1 - 22 };
        int currentElement;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            currentElement = intArray[firstUnsortedIndex];
            for (int j = firstUnsortedIndex; j > 0; j--) {
                // go through the unsorted index and check to see if that index's value is smaller, if it is move the array down
                if (intArray[j] < intArray[j - 1]) {
                    // swap(intArray, j, j - 1);
                    intArray[j] = intArray[j-1];
                }
                if (j ==)
            }
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