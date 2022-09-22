package BaitapQuangDang;

import java.util.Arrays;

public class ConnectArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {7,8};
        int[] array3 = {};


        for (int i = 0; i < (array1.length+array2.length); i++) {
            array3[i]= array1[i];
        }
        for (int i = array1.length; i < (array1.length+array2.length); i++) {
            array3[1+array1.length] = array2[i];
        }
        System.out.println(array3);
    }
}
