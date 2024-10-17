package homework_26.detail;

/*
radius: double

tooth: int
 */
public class Gear extends Detail {
    public double radius;
    public int tooth;

    public Gear(long barCode, double size, String material, String vendor, double weight,
                double radius, int tooth) {
        super(barCode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }
}
