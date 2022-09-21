package Option.baitap1;

public class Find {
    public static int binarySearch(int[] arrays, int array){
        int start = 0;
        int end = arrays.length - 1;
        while (end >= start) {
            int mid = (end + start) / 2;
            if (array > arrays[mid]) {
                start = mid + 1;
            } else if (array == arrays[mid]) {
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
