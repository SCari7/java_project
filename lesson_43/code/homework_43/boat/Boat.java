package homework_43.boat;

public class Boat {
    private String manufacturer;
    private String country;
    private int year;
    private double length;
    private String HullMaterial;
    private double price;

    public Boat(String manufacturer, String country, int year, double length, String hullMaterial, double price) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.length = length;
        HullMaterial = hullMaterial;
        this.price = price;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public String getHullMaterial() {
        return HullMaterial;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boat{");
        sb.append("manufacturer='").append(manufacturer).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", year=").append(year);
        sb.append(", length=").append(length);
        sb.append(", HullMaterial='").append(HullMaterial).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }






}
