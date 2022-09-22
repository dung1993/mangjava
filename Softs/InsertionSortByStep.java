package Softs;

public class InsertionSortByStep {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 4, 6, 5, -4};
        InsertionSort.insertionSort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }
}
