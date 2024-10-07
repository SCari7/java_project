package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }
    String info(){
        return "Im dog "+ name + ", my weight is " + weight;

    }
    void eat(){
        System.out.println("Im eat!");
        weight++;
    }
    void run() {
        while (weight < 3){
            System.out.println("Sorry im hungry");
            System.out.println("naw eating, my weight: " + weight);


            eat();
        }
        System.out.println("Im ran");
        weight -= 2;
        System.out.println("after run: " + weight);
        System.out.println("==============\n");
    }


}
