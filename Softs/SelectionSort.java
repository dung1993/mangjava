package Softs;

public class SelectionSort {
    public static void selectionSort(int[] numbers){
        for (int i=0;i<numbers.length-1;i++){
            int minindex=i;
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[j]<numbers[minindex]){
                    minindex=j;
                }
            }
            int min = numbers[minindex];
            numbers[minindex]=numbers[i];
            numbers[i]=min;
        }
    }
}
