package classwork_33.coffee_machine;

public enum Coffee {
    ESP("Espresso", 2.50, 1), AMR("Americano", 3.0, 2),
    CAP("Cappuccino", 4.0, 3), LAT("Latte", 4.9, 4);
    private String title;
    private double price;
    private int choice;

    Coffee(String title, double price, int choice) {
        this.title = title;
        this.price = price;
        this.choice = choice;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getChoice() {
        return choice;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coffee{");
        sb.append("title='").append(title).append('\'');
        sb.append(", price=").append(price);
        sb.append(", choice=").append(choice);
        sb.append('}');
        return sb.toString();
    }
}
