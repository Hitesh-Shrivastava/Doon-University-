import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroesToEnd(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) arr[index++] = num;
        }
        while (index < arr.length) arr[index++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 0, 3, 6};
        moveZeroesToEnd(arr);
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
    }
}
