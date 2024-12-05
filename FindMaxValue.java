//Create a method that accepts an array and returns the maximum value using a for loop.
public class FindMaxValue {

    // Method to find the maximum value in an array
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0]; // Assume the first element is the maximum
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger value is found
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Example usage
        int[] numbers = { 45, 67, 89, 23, 99, 12, 78 };

        // Call the findMax method and print the result
        int maxValue = findMax(numbers);
        System.out.println("The maximum value in the array is: " + maxValue);
    }
}
