package Arrays;

// Linear Search
public class solution8 {
    public static void main(String[] args) {
        int[] myList = {1,2,3,4,5};
        int key = 3;
        System.out.println(linearSearch(myList, key));
    }
    public static int linearSearch(int[] array, int key) {
        for(int i=0;i<array.length;i++) {
            if(array[i] == key)
                return i;
        }
        return -1;
    }
}
