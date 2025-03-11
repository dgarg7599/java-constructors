import java.util.Scanner;

public class CarRentalSystem {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0;

    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();

        System.out.print("Enter number of rental days: ");
        int rentalDays = scanner.nextInt();

        CarRentalSystem rental = new CarRentalSystem(customerName, carModel, rentalDays);

        System.out.println("\nRental Details:");
        rental.displayRentalDetails();

        scanner.close();
    }
}

/*
Enter name:
Div
Enter age:
20
Enter phone number:
123456789

Original Person Details:
Name: Div
Age: 20
Phone Number: 123456789

Cloned Person Details:
Name: Div
Age: 20
Phone Number: 123456789
 */