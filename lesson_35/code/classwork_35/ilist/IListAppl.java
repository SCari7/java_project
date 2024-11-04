package classwork_35.ilist;

import classwork_28.car_garage.ait.cars.model.Car;
import classwork_35.ilist.model.IList;
import classwork_35.ilist.model.IListImpl;

import java.util.ArrayList;
import java.util.List;

public class IListAppl {
    public static void main(String[] args) {
// список с целыми числами

        IList<Integer> listOfAge = new IListImpl<>();

        listOfAge.add(61);
        listOfAge.add(22);
        listOfAge.add(33);
        listOfAge.add(27);
        listOfAge.add(37);
        listOfAge.add(11);
        listOfAge.add(37);
        listOfAge.add(45);
        listOfAge.add(79);
        listOfAge.add(33);
        listOfAge.add(63);
        listOfAge.add(63);
        listOfAge.add(64);
        listOfAge.add(37);
        listOfAge.add(66);
        listOfAge.add(66);
        listOfAge.add(67);
        listOfAge.add(68);


        System.out.println(listOfAge.size());
        System.out.println(listOfAge.indexOf(61));//0
        System.out.println(listOfAge.indexOf(63));//0
        System.out.println(listOfAge.indexOf(37));//0

        System.out.println(listOfAge);
        for (Integer integer : listOfAge) {
            System.out.println(listOfAge.indexOf(integer) + " : " + integer);
        }
        System.out.println("---------------------------------------");
        for (int i = 0; i < listOfAge.size(); i++) {
            if (listOfAge.get(i) == 37) {
                System.out.println(i + " : 37");
            }
        }

        int sum = 0;
        for (Integer integer : listOfAge) {
            sum += integer;
        }
        System.out.println("---------------------------------");
        System.out.println(sum);
        double avgAge = (double) sum / listOfAge.size();
        System.out.println(avgAge);
        System.out.println("-----------------------");

        IList<String> listOfNames = new IListImpl<>();
        listOfNames.add("Leonid");
        System.out.println(listOfNames.size());

        listOfNames.add("Artiom");
        listOfNames.add("Diana");
        listOfNames.add("Carina");
        listOfNames.add("Juri");
        listOfNames.add("Dmitri");
        listOfNames.add("Artem");
        listOfNames.add("German");
        listOfNames.add(null);
        System.out.println(listOfNames.size());

        int index = 0;
        for (String str : listOfNames) {
            System.out.println(index);
        }
        String strTotal = " ";
        for (String str : listOfNames) {
            strTotal += str;
        }
        System.out.println(strTotal);
        index = 0;
        listOfNames.remove(2);
        for (String str : listOfNames) {

            System.out.println(index++ + " : " + str);
        }

        /*
        - создать список городских маршрутов на основе автобусов из городского автопарка;
- отсортировать автобусы в порядке убывания их вместимости;
- подсчитать общую вместимость автобусов из автопарка.
         */
        List<Car> listCars = new ArrayList<>();



    }

}
