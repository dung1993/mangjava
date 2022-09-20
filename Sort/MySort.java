package Sort;

public class MySort {
    private int [] list;
    private int max = 1000;
    private int min = 0;
    public MySort(){
         list = new int[10000000];

            for (int i = 0; i < list.length; i++) {
                int item = (int) Math.random()*(max - min + 1) + min;
                list[i] = item;
        }
    }

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }
}
