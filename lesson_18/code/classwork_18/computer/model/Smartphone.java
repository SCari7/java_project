package classwork_18.computer.model;

public class Smartphone extends Laptop{
    private long imei;

    public Smartphone(String cpu, int ram, int ssd, String brand, double prise, double displaySize, double weight, int batteryLife, String color, long imei) {
        super(cpu, ram, ssd, brand, prise, displaySize, weight, batteryLife, color);
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei + super.toString() +
                '}';
    }
}
