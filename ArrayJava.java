public class ArrayJava {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Retrieval if we know the index is O(1)
        // Retrieval without index is O(n) - linear time
        // Adding an element to a full array O(n)
        // Adding to an array with space available O(1)
        // Insert or update an element at an index O(1)
        // Delete an element by setting it to null O(1)
        // Delete an element by shifting elements O(n)

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
            System.out.println(intArray[i]);
        }
        System.out.print("index = " + index);
    }
}