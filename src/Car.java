package car;

public class Car {
    private int id;
    private String model;
    private int year;
    private double price;
    private String regNumber;

    public Car(int id, String model, int year, double price, String regNumber) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
        this.regNumber = regNumber;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model +
                ", year=" + year +
                ", price=" + price +
                ", regNumber='" + regNumber +
                '}';
    }
}