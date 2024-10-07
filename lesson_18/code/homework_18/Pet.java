package homework_18;

public class Pet {
   public int id;
    public int age;
    public String type;
    public String name;

    public Pet(int id, int age, String type, String name) {
        this.id = id;
        this.age = age;
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public void voice (){
        System.out.println("This is a pet.");
    }
}
