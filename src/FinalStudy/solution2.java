package FinalStudy;

public class solution2 {
    public static void main(String[] args){
        int[][] myList = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i<myList.length;i++) {
            for(int j=0;j<myList[i].length;j++) {
                System.out.print(myList[i][j] + " ");
            }
            System.out.println();
        }
    }
}

