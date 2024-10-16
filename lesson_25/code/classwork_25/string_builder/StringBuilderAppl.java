package classwork_25.string_builder;

public class StringBuilderAppl {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);

        sb.append("_").append("21");
        System.out.println(sb);

        sb.reverse();// печать в другую сторону
        System.out.println(sb);

        StringBuilder sbNew = new StringBuilder("Hello");
        sbNew.insert(5, "!");//указать где добавляем символ за 5, если на 3 место то за 2
        System.out.println(sbNew);
        sbNew.append(true);
        System.out.println(sbNew);

    }

}
