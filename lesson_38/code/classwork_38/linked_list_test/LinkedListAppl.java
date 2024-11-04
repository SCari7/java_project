package classwork_38.linked_list_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// заполнить список случайными целыми числами
// проверить работу методов LinkedList
public class LinkedListAppl {
    private static final int N_NUMBERS = 10;
    private static final Random random = new Random();
    private static final int MIN = 10;
    private static final int MAX = 20;


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();// определяем имплементацию
        fillList(list);//creation
        printList(list);//reading

        System.out.println(list.size());
        System.out.println(list.get(0));//находим первый
        System.out.println(list.get(list.size() - 1));//последний элемент

//
        System.out.println(list.indexOf(10));
        list.set(0, 50);
        list.set(N_NUMBERS - 1, 100);
        printList(list);
        list.set(4, 100);// поставить в средину
        printList(list);
//        list.set(N_NUMBERS -1 /2, 200);
        printList(list);

        // remove 15 if es is ТАК УДАЛЯТЬ НЕ НУЖНО
//        for (Integer num : list) {
//            if (num == 15){
//                list.remove(num);
//            }
//        }
//
//        printList(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num.equals(15)) {
                iterator.remove();//удаление в позиции курсора
            }
        }
        printList(list);

        Integer num = 100;
        list.remove(num);
        printList(list);
        list.remove(list.indexOf(100));
        printList(list);


        // удаление по условию *предикат, лямбда*
        // удалим все элементы кратные 3
        list.removeIf(e -> e % 3 == 0);
        printList(list);

    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("-------------");


    }

    private static void fillList(List<Integer> list) {

        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MIN, MAX));
        }


    }


}
