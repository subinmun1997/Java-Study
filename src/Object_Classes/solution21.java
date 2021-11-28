package Object_Classes;

public class solution21 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome ");
        sb.append("Java");
        sb.insert(8, "HTML and ");
        sb.delete(8,17);
        sb.deleteCharAt(8);
        sb.insert(8, "J");
        sb.reverse();
        sb.replace(11, 15, "HTML");
        sb.setCharAt(0, 'w');
        System.out.println(sb);

    }
}
