
import java.time.LocalDate;

public class Rental {

    // RENT INFORMATION
    int rentalID;
    String customerName;
    int howManyDays;
    double pricePerDay;
    LocalDate rentalStartDate;
    LocalDate rentalEndDate;
    String vin;

    // CALCULATE TOTAL RENTAL PRICE
    double calculateTotalPrice() {
        return howManyDays * pricePerDay;
    }


    // DISPLAY RENTAL INFORMATION
    void displayInfo() {
        System.out.println();
        System.out.println("===== RENTAL INFORMATION =====");
        System.out.println("Rental ID: " + rentalID);
        System.out.println("Customer: " + customerName);
        System.out.println("Days: " + howManyDays);
        System.out.println("Price per day: $" + pricePerDay);
        System.out.println("Start: " + rentalStartDate);
        System.out.println("End: " + rentalEndDate);
        System.out.println("Car VIN: " + vin);
        System.out.printf("Total: $%.2f%n", calculateTotalPrice());
        System.out.println("==============================");
        System.out.println();
    }

}
}

// Car.dealershipInfo():
//static void dealershipInfo();
//static void dealershipInfo() {
//    System.out.println("Welcome to the future of RentalCars");
//}
//Car.dealershipInfo();
//c1.dealershipInfo();
//Static information that does not change and is not linked to any object
//non-static method is Always linked to the individual object