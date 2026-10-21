import java.time.LocalDate;


public class Main {


    public static void main(String[] arg) {
        System.out.println("Learning about OOP");
        System.out.println("Learning about classes");


        // Creating or instance of an object
        // Car 1 - BMW
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.model = "M3";
        car1.buildYear = 2024;
        car1.vin = "BMW001";
        car1.color = "Blue";

        // Car 2 - Tesla
        Car car2 = new Car();
        car2.brand = "Tesla";
        car2.model = "Model 3";
        car2.buildYear = 2025;
        car2.vin = "TES002";
        car2.color = "White";

        // Car 3 - Toyota
        Car car3 = new Car();
        car3.brand = "Toyota";
        car3.model = "Corolla";
        car3.buildYear = 2022;
        car3.vin = "TOY003";
        car3.color = "Red";

        // Car 4 - Mercedes
        Car car4 = new Car();
        car4.brand = "Mercedes-Benz";
        car4.model = "C-Class";
        car4.buildYear = 2023;
        car4.vin = "MER004";
        car4.color = "Black";

        // Car 5 - Ferrari
        Car car5 = new Car();
        car5.brand = "Ferrari";
        car5.model = "488 GTB";
        car5.buildYear = 2019;
        car5.vin = "FER005";
        car5.color = "Yellow";


        // create my current car
        Car currentCar = new Car();
        currentCar.brand = "Hyundai";
        currentCar.color = "Gray";

        // future car
        Car futureCar = new Car();
        futureCar.brand = "Mitsubishi Evo";
        futureCar.model = "8";
        futureCar.buildYear = 2006;
        futureCar.color = "Black";



        // Display information for all cars
        car1.displayInfo(); // BMW
        car2.displayInfo(); // Tesla
        car3.displayInfo(); // Toyota
        car4.displayInfo(); // Mercedes
        car5.displayInfo(); // Ferrari

// Display my personal cars
        currentCar.displayInfo(); // My Hyundai
        futureCar.displayInfo();// My dream Mitsubishi Evo

        Rental rental1 = new Rental();
        rental1.rentalID = 1001;
        rental1.customerName = "Thuan Luu";
        rental1.howManyDays = 3;
        rental1.pricePerDay = 120.00;
        rental1.rentalStartDate = LocalDate.of(2026, 10, 21);
        rental1.rentalEndDate = LocalDate.of(2026, 10, 24);
        rental1.vin = "BMW001";

        Rental rental2 = new Rental();
        rental2.rentalID = 1002;
        rental2.customerName = "Alexis Williams";
        rental2.howManyDays = 5;
        rental2.pricePerDay = 85.00;
        rental2.rentalStartDate = LocalDate.of(2026, 10, 22);
        rental2.rentalEndDate = LocalDate.of(2026, 10, 27);
        rental2.vin = "TES002";

        Rental rental3 = new Rental();
        rental3.rentalID = 1003;
        rental3.customerName = "Jack Naillon";
        rental3.howManyDays = 7;
        rental3.pricePerDay = 55.00;
        rental3.rentalStartDate = LocalDate.of(2026, 10, 23);
        rental3.rentalEndDate = LocalDate.of(2026, 10, 30);
        rental3.vin = "TOY003";

        Rental rental4 = new Rental();
        rental4.rentalID = 1004;
        rental4.customerName = "Hassieb Hassieb";
        rental4.howManyDays = 2;
        rental4.pricePerDay = 110.00;
        rental4.rentalStartDate = LocalDate.of(2026, 10, 24);
        rental4.rentalEndDate = LocalDate.of(2026, 10, 26);
        rental4.vin = "MER004";

        Rental rental5 = new Rental();
        rental5.rentalID = 1005;
        rental5.customerName = "Maurice Rodriguez";
        rental5.howManyDays = 2;
        rental5.pricePerDay = 450.00;
        rental5.rentalStartDate = LocalDate.of(2026, 10, 25);
        rental5.rentalEndDate = LocalDate.of(2026, 10, 27);
        rental5.vin = "FER005";

        Rental rental6 = new Rental();
        rental6.rentalID = 1006;
        rental6.customerName = "Paul Walker";
        rental6.howManyDays = 6;
        rental6.pricePerDay = 450.00;
        rental6.rentalStartDate = LocalDate.of(2026, 11, 25);
        rental6.rentalEndDate = LocalDate.of(2026, 11, 27);
        rental6.vin = "COR006";
    }
}

