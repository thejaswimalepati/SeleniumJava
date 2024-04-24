package javapractice;

public class interview {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8}; // Example array
        swapFirst4WithNext4(array);
        // Print the modified array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void swapFirst4WithNext4(int[] array) {
        if (array.length < 8) {
            // Ensure the array has at least 8 elements
            System.out.println("Array length is insufficient for swapping.");
            return;
        }

        // Swap the first 4 elements with the next 4 elements
        for (int i = 0; i < 4; i++) {
            int temp = array[i];
            array[i] = array[i + 4];
            array[i + 4] = temp;
        }
    }
}
