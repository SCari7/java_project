package classwork_18.model;

public class Human {


    boolean Gender;
    double height;
    double weight;
    String race;
    String country;
    String eyeColor;

    public Human(boolean gender, double height, double weight, String race, String country, String eyeColor) {
        Gender = gender;
        this.height = height;
        this.weight = weight;
        this.race = race;
        this.country = country;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Gender=" + Gender +
                ", height=" + height +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
