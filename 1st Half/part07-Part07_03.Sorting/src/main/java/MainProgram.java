import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[indexOfSmallest] > array[i]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        for (; startIndex < table.length; startIndex++) {
            if (table[indexOfSmallest] > table[startIndex]) {
                indexOfSmallest = startIndex;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swapHelper = array[index1];
        array[index1] = array[index2];
        array[index2] = swapHelper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            if (array[i] > smallest(array)) {
                swap(array, indexOfSmallestFrom(array, i), i);
            }
        }
    }
}
