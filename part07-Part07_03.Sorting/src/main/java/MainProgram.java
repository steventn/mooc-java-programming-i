
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
    public static int smallest(int[] array) {
        int smallestValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }
        return smallestValue;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestValueIndex = 0;
        
        for (int i = smallestValueIndex; i < array.length; i++) {
            if (array[i] == MainProgram.smallest(array)) {
                break;
            }
            smallestValueIndex++;
        }
        return smallestValueIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexSmallestFrom = startIndex; 
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[indexSmallestFrom]) {
                indexSmallestFrom = i;
            }
        }
        return indexSmallestFrom;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tempSwapValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempSwapValue;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
        }   
    }
}
