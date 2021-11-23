package Arrays;

// Binary Search
public class solution9 {
    public static void main(String[] args) {
        int[] myList = {1,2,3,4,5,6,7,8,9,10};
        int key = 8;
        System.out.println(binarySearch(myList, key));
    }
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while(high >= low) {
            int mid = (high + low) / 2;
            if(key < array[mid])
                high = mid - 1;
            else if(key == array[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1-low;
    }
}
