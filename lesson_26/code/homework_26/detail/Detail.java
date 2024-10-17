package homework_26.detail;

import java.util.Objects;

/*
barCode: long
size: double
material: String
vendor: String
weight: double
 */
public abstract class Detail {

    protected final long barCode;
    protected double size;
    protected  String material;
    protected String vendor;
    protected double weight;

    public Detail(long barCode, double size, String material,
                  String vendor, double weight) {
        this.barCode = barCode;
        this.size = size;
        this.material = material;
        this.vendor = vendor;
        this.weight = weight;
    }

    public long getBarCode() {
        return barCode;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Detail detail)) return false;
        return barCode == detail.barCode && Double.compare(size, detail.size) == 0 && Double.compare(weight, detail.weight) == 0 && Objects.equals(material, detail.material) && Objects.equals(vendor, detail.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode, size, material, vendor, weight);
    }
}
