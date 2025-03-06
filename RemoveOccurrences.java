import java.util.Arrays;

public class RemoveOccurrences {
    public static int[] removeElement(int[] arr, int key) {
        return Arrays.stream(arr).filter(num -> num != key).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 1};
        int key = 1;
        int[] result = removeElement(arr, key);
        System.out.println("Array after removing " + key + ": " + Arrays.toString(result));
    }
}
