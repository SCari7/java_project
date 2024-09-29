package lesson_06;

import java.util.Random;

public class booleanEx {
    public static void main(String[] args) {

        boolean boll = true;
        boll = false;

        int x = 10;
        int y = 5;
        // sravnenie na ravenstvo
        boolean b1 = x == y; // x raven y 10 = 5 false
        System.out.println(x + " == " + y + " -> " + b1);


        // ne ravenstvo
        // x ne raven y
        b1 = x != y; // 10 ne ravno 5 --> try
        System.out.println(x + " != " + y + " -> " + b1);

        // bolshe ">"
        // x bolshe chen y
        b1 = x > y; // 10 > 5 --> true
        System.out.println(x + " > " + y + " -> " + b1);

        y = 10;
        b1 = x > y; // 10 bolshe 10 --> false

        // bolshe ili ravno " >= "
        b1 = x >= y;
        System.out.println(x + " >= " + y + " -> " + b1);

        x = 7;
        b1 = x < y; // menshe chem 10
        System.out.println(x + " < " + y + " -> " + b1);

        // menshe ili ravno <=
        b1 = x <= y; // 7 menche ili ravno 10
        System.out.println(x + " <= " + y + " -> " + b1);


        String str = "Java is the best";
        str.contains("Java"); // stroka sodergit v sebe podstrokw "Java"
        boolean contains = str.contains("Java");
        System.out.println("str.contains(\"Java\"): " + contains);


        // logicheskoe NE otricanie " ! "
        boolean b2;
        b2 = !false; //  poluchaem znachenie true
        System.out.println("!false: " + b2);

        b2 = !(4 == 5); //!false = true
        System.out.println("!/4 == 5): " + b2);

        // sostavnue sravnenia 2 uslovia
        // logish &

        //


        b2 = true & true;
        System.out.println("true & true: " + b2);
        b2 = (2 < 5) & (11 == 10);  // true & false --> false
        System.out.println("(2 < 5) & (11 == 10) -> " + b2);

        // vvedite chislo ot 0 do 100
        int x1 = 50;
        boolean b3 = x1 > 0 & x1 < 100;

        // logish ili " | "

        // ispol kogda dostatocjno chtob hoti odno uslovie bulo istinnum
        boolean b4 = true | false;
        System.out.println("true | false: " + b4);
        System.out.println("false | false -> " + (false | false));

        // vvedite ili chetnoe ili chislo kotoroe delitsia na 5 bez osttka
        // chetnoe chislo  chislo kotoroe delitsia bez ostatka na 2
        // generacia sluchainogo chisla
        Random random = new Random();
        // v diapazone ot 0 do x
        int rand = random.nextInt(100);// (0 ...x-1) -> (0..99) vkluchitelno
        System.out.println("rand: " + rand);

        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber);

        // logish iskluchaychaa  ili ( XOR)
        // vozvrachaet tru esli 2 chasti vurageniia raznue
        boolean b5 = true ^ false;


        // logicheskoe sokrachennoe  I "&&"
        // vudaet true tolko esli obe chati ravnu true;
        boolean b6 = true && false;
        System.out.println("true && false:" + b6);
        b6 = true && true;
        System.out.println("true && true:" + b6);
        b6 = (2 > 5) && (11 == 11);
        System.out.println("(2 > 5) && (11 == 11): " + b6);

        int a = 10;
        int b = 0;

        boolean b7 = (b != 0) && (a / b > 2);
        System.out.println("a / b > 2: " + b7);

        // logicheskoe sokrachennoe ili "||"
        // vudaet tru esli hoti odna chasti vuragenia true
        boolean b8 = true || (a / b > 2);
        System.out.println("b8: " + b8);
        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);

        System.out.println();

        System.out.println(true ^ true &&   false);

    }
}
