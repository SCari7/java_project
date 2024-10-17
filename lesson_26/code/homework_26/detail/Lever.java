package homework_26.detail;

public class Lever extends Detail {
    public double power;

    public Lever(long barCode, double size, String material, String vendor,
                 double weight, double power) {
        super(barCode, size, material, vendor, weight);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
