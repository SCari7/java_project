package classwork_07;

public class Appels {
    public static void main(String[] args) {
        int apple = 30;//начальные параметры

        int count = 1;

        int startApples =30;

        while (count <= 30){
            System.out.println("Take one apple");
            apple --;
            count ++;
            System.out.println("Now we have only: " + apple + " in the basket");


        }
        System.out.println("The job is done!" + count + " apples added in pea ");
    }
}
