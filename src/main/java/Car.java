
public class Car {

    // CAR INFORMATION
    String brand;
    String model;
    int buildYear;
    String vin;
    String color;

    // DISPLAY CAR INFORMATION
    void displayInfo() {
        System.out.println();
        System.out.println("===== CAR INFORMATION =====");
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Build Year: " + buildYear);
        System.out.println("VIN: " + vin);
        System.out.println("===========================");
        System.out.println();
    }

    // STATIC WELCOME MESSAGE
    static void dealershipInfo() {
        System.out.println("Welcome to the future of RentalCars");
        System.out.println();
    }
}











