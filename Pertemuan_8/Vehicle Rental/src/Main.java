public class Main {
    public static void main(String[] args) {
        Car innova = new Car("Innova Reborn", 2015, 500.0, CarType.PREMIUM_CAR);
        Car avanza = new Car("Avanza", 2009, 300.0, CarType.FAMILY_CAR);
        Car brio = new Car("Honda Brio", 2012, 300.0, CarType.CITY_CAR);

        innova.displayInfo();
        avanza.displayInfo();
        brio.displayInfo();

        Truck isuzuTruck = new Truck("Isuzu", 2013, 800.0, 3000);
        Truck volvoTruck = new Truck("Volvo", 2013, 850.0, 2500);
        Truck hinoTruck = new Truck("Hino", 2005, 800.0, 4000);
        Truck mitsubishiTruck = new Truck("Mitsubishi", 2010, 850.0, 4000);

        isuzuTruck.displayInfo();
        volvoTruck.displayInfo();
        hinoTruck.displayInfo();
        mitsubishiTruck.displayInfo();

    }
}

