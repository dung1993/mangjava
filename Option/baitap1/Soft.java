package Option.baitap1;

public class Soft {
    public static void interChangeSoft(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0 + i; j < arrays.length; j++) {
                if (arrays[i] < arrays[j]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }
}
