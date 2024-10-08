package classwork_19.compare_string;

//

public class CompareStringAppl {
    public static void main(String[] args) {
        int x = 5;//steak
        int y = 5;//steak

        boolean check = (x == y);
        System.out.println(check);
        String str = "Europe";// str = steak "Europe" = heap (link)
        String str1 = "Europe";
        check = str == str1;

        System.out.println("--------------------------------");
        System.out.println(check);

        System.out.println("--------------------------------");
        String str2 = new String("Europe");
        check = str == str2;
        System.out.println(check); // false, links Not equals!

        System.out.println("--------------------------------");

        check = str1.equals(str2);// compare with method equals
        System.out.println(check);


    }
}
