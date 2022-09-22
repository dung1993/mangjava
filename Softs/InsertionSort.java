package Softs;

public class InsertionSort {
    public static void insertionSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            int j = i + 1;
            int number = numbers[j];
            while (number < numbers[j - 1]) {
                numbers[j] = numbers[j - 1];
                j--;
            }
            numbers[j] = number;
        }
    }
}
