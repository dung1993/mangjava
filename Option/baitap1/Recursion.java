package Option.baitap1;


import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int [] arrays = {1,2,3,4,5,6,7};
        Soft.interChangeSoft(arrays);
        System.out.println(Arrays.toString(arrays));
        Find.binarySearch(arrays,4);
        System.out.println();
    }

}

