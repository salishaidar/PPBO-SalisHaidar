public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(String brand, int year, double rentalPrice, double cargoCapacity) {
        super(brand, year, rentalPrice);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateDiscount() {
        double discount = super.calculateDiscount();
        if (cargoCapacity > 2000) {
            discount += 0.1;
        }
        return discount;
    }
    public void displayInfo() {
        double discount = calculateDiscount();
        double finalPrice = rentalPrice - (rentalPrice * discount);

        System.out.println("Detail Truk :");
        System.out.println("Merk : " + brand);
        System.out.println("Tahun : " + year);
        System.out.println("Harga Sewa : " + rentalPrice);
        System.out.println("Kapasitas Kargo : " + cargoCapacity);
        System.out.printf("Total Diskon : %.1f\n", rentalPrice * discount);
        System.out.println("Harga setelah diskon : " + finalPrice);
        System.out.println("-".repeat(30));
    }
}


