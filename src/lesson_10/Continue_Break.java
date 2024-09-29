package lesson_10;

public class Continue_Break {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            if (i == 3) continue; // значит прервать текущую операцию !!!!! и перейти к следующей

            // continue - переход к следующей итерации цикла
            //мы перейдем в блок изменнения потом в блок проверки в текущей итерациии после континье
            System.out.print(i + ", ");

        }
        System.out.println();

        for (int i = 1; i < 7; i++) {
            if (i == 5) break; // звканчивае все последние итерации выполнены не будудт
            System.out.print(i + "; ");


        }
        System.out.println("\n End loop with break");

        int y = 1;
        while (y < 7) {
            if (y == 3) {
                y++;
                continue;
            }

            System.out.print(y++ + ", ");
        }
        System.out.println();
    }
}
