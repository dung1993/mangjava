package Softs;

public class InsertionSort {
//    {1, 9, 4, 6, 5, -4};
    public static void insertionSort(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            int j = i + 1;
            int number = numbers[j];
            while (j >=1 && number < numbers[j-1]) {
                numbers[j] = numbers[j-1];
                j--;
            }
            numbers[j] = number;
        }
    }
}
// i = 0 > i < 5 > j = 1 > number = 9 > 9 while không thực hiện > numbers[0] = 9;
// i = 1 > i < 5 > j = 2 > number = 4 while thực hiện > numbers[2] = 9; > j = 1; numbers[1] = 4;
// i = 2 > i < 5 > j = 3 > number = 6 while thực hiện > numbers[3] = 9; > j = 2; numbers[2] = 6;
// i = 3 > i < 5 > j = 4 > number = 5 while không thực hiện > numbers[4] = 5;