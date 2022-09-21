package BaitapQuangDang;

import java.util.Arrays;

public class SwapNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0, j = numbers.length - 1; i < j ; i++, j--) {
            int swap = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = swap;
        }
        System.out.println(Arrays.toString(numbers));
    }
}