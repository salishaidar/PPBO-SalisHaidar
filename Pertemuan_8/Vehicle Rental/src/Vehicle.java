public class Vehicle {
    protected String brand;
    protected double rentalPrice;
    protected int year;

    public Vehicle(String brand, int year, double rentalPrice) {
        this.brand = brand;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public double calculateDiscount() {
        double discount = 0.0;
        if (year < 2010) {
            discount += 0.1;
        }
        return discount;
    }
}


