package Softs;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        BubbleSort.bubbleSort(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }


}
