import java.util.Arrays;

public class ArrayRotation {
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // In case d > n
        int[] temp = new int[d];

        // Store first d elements in temp array
        System.arraycopy(arr, 0, temp, 0, d);
        
        // Shift remaining elements to the left
        System.arraycopy(arr, d, arr, 0, n - d);
        
        // Copy temp elements to the end
        System.arraycopy(temp, 0, arr, n - d, d);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateArray(arr, d);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
