package Arrays;

public class solution5 {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];

        for(int i=0;i<sourceArray.length;i++) {
            targetArray[i] = sourceArray[i];
        }
        for(int i=0;i<sourceArray.length;i++) {
            System.out.print(targetArray[i] + " ");
            System.out.print(sourceArray[i] + " ");
        }
        int[] twotargetArray = new int[sourceArray.length];
        System.arraycopy(sourceArray,0,twotargetArray,0,sourceArray.length);
        for(int i=0;i<sourceArray.length;i++) {
            System.out.print(twotargetArray[i] + " ");
        }
    }
}
