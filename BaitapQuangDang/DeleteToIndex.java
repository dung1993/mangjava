package BaitapQuangDang;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteToIndex {
    public static void main(String[] args) {
        int[] arrays = {1,3,5,7,9};

        Scanner scanner = new Scanner(System.in);
        System.out.println("input number:");
        int num = scanner.nextInt();
        System.out.println("input index:");
        int index = scanner.nextInt();
//        Delete(arrays,index,num);


    }
//    public static int Delete(int[] arrays, int index, int num){
//        int[] newArr = new int[arrays.length - num];
//        for (int i = 0; i < index; i++) {
//            newArr[i] = arrays[i];
//        }
//        int j = newArr.length - 1;
//        for (int i = arrays.length - 1; i > index + num - 1; i--) {
//
//            newArr[j--] = arrays[i];
//        }
//////        return newArr;
////    }
}
