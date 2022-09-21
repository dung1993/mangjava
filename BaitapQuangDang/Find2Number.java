package BaitapQuangDang;

public class Find2Number {
    public static void main(String[] args) {
        int[] numbers = {5,3,6,7,8,9};
        int n = numbers.length;
        print2largest(numbers, n);

    }
    static void print2largest(int numbers[], int arr_size) {
        int i;
        if (arr_size < 2) {
            System.out.printf("Khong ton tai phan tu lon thu 2");
            return;
        }

        for (i = arr_size - 2; i >= 0; i--) {
            if (numbers[i] != numbers[arr_size - 1]) {
                System.out.printf("Phan tu lon thu 2: " + numbers[i]);
                return;
            }
        }
        System.out.printf("Khong ton tai phan tu lon thu 2");
    }
}
