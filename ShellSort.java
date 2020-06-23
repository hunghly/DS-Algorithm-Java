public class ShellSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1 - 22 };
        // Using the knuth sequence
        /*
        k = 1, gap = 1
        k = 2, gap = 4
        k = 3, gap = 13
        k = 4, gap = 40
        k = 5, gap = 121
        gap is calculated using (3^k -1) / 2, where k is the length of the array

        In-place algorithm
        Does not require as much shifting as insertion sort
        Unstable algorithm
        O(n^2)
        Can be used to improve bubble sort or insertion sort.


        For this example, we will use array.length / 2 which is 3
        */
        int gap = intArray.length / 2;
        System.out.println(gap);
        // int (int i = 0; )

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}