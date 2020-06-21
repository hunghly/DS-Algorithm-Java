
class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        // Start from the end of the array and decrement
        // Typically two loops mean O(n^2) or quadratic algorithm
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int swapIndex1, int swapIndex2) {
        if (swapIndex1 == swapIndex2) {
            return;
        }
        int temp = array[swapIndex1];
        array[swapIndex1] = array[swapIndex2];
        array[swapIndex2] = temp;
    }

}