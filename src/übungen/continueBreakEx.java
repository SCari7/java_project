package übungen;

public class continueBreakEx {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                continue;

            }
            if (i > 7){
                break;
            }
            System.out.println(i);
        }


    }
}
