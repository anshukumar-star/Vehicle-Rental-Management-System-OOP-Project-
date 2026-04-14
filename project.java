import java.util.Scanner;

class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double rentPerDay;

    Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    double calculateRent(int days) {
        return rentPerDay * days;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    double calculateRent(int days) {
        return (rentPerDay * days) + 500;
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    double calculateRent(int days) {
        return (rentPerDay * days) - 100;
    }
}

public class project{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car Details:");
        System.out.print("Vehicle Number: ");
        String cNum = sc.nextLine();
        System.out.print("Brand: ");
        String cBrand = sc.nextLine();
        System.out.print("Rent per Day: ");
        double cRent = sc.nextDouble();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        sc.nextLine();

        System.out.println("\nEnter Bike Details:");
        System.out.print("Vehicle Number: ");
        String bNum = sc.nextLine();
        System.out.print("Brand: ");
        String bBrand = sc.nextLine();
        System.out.print("Rent per Day: ");
        double bRent = sc.nextDouble();

        Vehicle v1 = new Car(cNum, cBrand, cRent);
        Vehicle v2 = new Bike(bNum, bBrand, bRent);

        System.out.println();
        v1.display();
        System.out.println("Car Rent for " + days + " days: " + v1.calculateRent(days));

        System.out.println();
        v2.display();
        System.out.println("Bike Rent for " + days + " days: " + v2.calculateRent(days));

        sc.close();
    }
}