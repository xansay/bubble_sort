/**
 * This Java program demonstrates the Bubble Sort algorithm to sort an array of integers.
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements, and swaps them if they are in the wrong order. The pass through
 * the list is repeated until no swaps are needed, which indicates that the list is sorted.
 */
public class bubble_sort {

    /**
     * The main method initializes an array of integers, sorts it using the bubbleSort method,
     * and then prints the sorted array elements to the console.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Initialize the array with integers
        int[] arr = new int[] {1, 4, 9, 25, 18, 3, 59, 12, 54, 90, 6};

        // Sort the array using the bubble sort algorithm
        bubbleSort(arr);

        // Display the sorted array elements
        System.out.println("Bubble sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t" + arr[i]);
        }
    }

    /**
     * Sorts the given array of integers using the Bubble Sort algorithm.
     *
     * @param arr The array of integers to be sorted
     */
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop to perform comparisons and swaps
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps were made in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
//------------------------------END OF FILE------------------------------//