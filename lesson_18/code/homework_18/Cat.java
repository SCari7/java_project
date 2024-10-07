package homework_18;

public class Cat extends Pet{
    public String breed;
    public double height;
    public int weight;


    public Cat(int id, int age, String type, String name, String breed, double height, int weight) {
        super(id, age, type, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", id=" + id +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}' + super.toString() ;
    }
    @Override
    public void voice(){
        System.out.println(name + " says: Meow-meow!");
    }
}
