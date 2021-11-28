package Object_Classes;

public class solution18 {
    public static void main(String[] args) {
        String str = "Java+HTML+Perl";
        String[] tokens = str.split("\\+", 0);
        for(int i=0;i<tokens.length;i++) {
            System.out.print(tokens[i] + " ");
        }
    }
}
