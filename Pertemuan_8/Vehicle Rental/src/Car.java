enum CarType {
    CITY_CAR,
    FAMILY_CAR,
    PREMIUM_CAR
}

public class Car extends Vehicle{
    private CarType type;

    public Car(String brand, int year, double rentalPrice, CarType type) {
        super(brand, year, rentalPrice);
        this.type = type;
    }

    @Override
    public double calculateDiscount() {
        double discount = super.calculateDiscount();
        if (type == CarType.FAMILY_CAR) {
            discount += 0.05;
        } else if (type == CarType.PREMIUM_CAR) {
            discount += 0.1;
        }
        return discount;
    }

    public void displayInfo() {
        double discount = calculateDiscount();
        double finalPrice = rentalPrice - (rentalPrice * discount);

        System.out.println("Detail Mobil :");
        System.out.println("Merk : " + brand);
        System.out.println("Tahun : " + year);
        System.out.println("Harga Sewa : " + rentalPrice);
        System.out.println("Tipe Mobil : " + type);
        System.out.printf("Total Diskon : %.1f\n", rentalPrice * discount);
        System.out.println("Harga setelah diskon : " + finalPrice);
        System.out.println("-".repeat(30));

    }
}

