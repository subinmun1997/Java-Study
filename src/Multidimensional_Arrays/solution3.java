package Multidimensional_Arrays;

public class solution3 {
    public static void main(String[] args) {
        int[][] triangleArray = {
                {1,2,3,4,5},
                {2,3,4,5},
                {3,4,5},
                {4,5},
                {5}
        };

        for(int i=0;i<triangleArray.length;i++) {
            System.out.print(triangleArray[i].length + " ");
        }
    }
}
