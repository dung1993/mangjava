package Softs;

public class BubbleSort {
    public static void bubbleSort(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = numbers.length-1; j>i; j--) {
                if (numbers[j] < numbers[j-1]) {
                    int swap = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }
    }
}
