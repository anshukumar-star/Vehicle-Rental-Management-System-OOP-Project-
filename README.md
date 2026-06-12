# Vehicle-Rental-Management-System-OOP-Project-

A simple Java-based Vehicle Rental Management System developed using Core Java and Object-Oriented Programming (OOP) concepts. This project simulates a vehicle rental service where users can rent different types of vehicles and calculate rental charges based on the number of rental days.

📌 Features
Manage vehicle details such as:
Vehicle Number
Brand
Rent Per Day
Support for multiple vehicle types:
Car
Bike
Calculate rental charges based on vehicle type
Demonstrates key OOP concepts:
Inheritance
Method Overriding
Runtime Polymorphism
Constructor Chaining using super
Console-based user interaction
🛠️ Technologies Used
Java
Object-Oriented Programming (OOP)
Scanner Class for User Input
📂 Project Structure
Vehicle (Base Class)
│
├── Car (Subclass)
│
└── Bike (Subclass)

Project (Main Class)
🚀 How It Works
User enters Car details and rental duration.
User enters Bike details.
The system creates objects using a Vehicle reference.
Runtime polymorphism invokes the appropriate calculateRent() method.
Rental cost is displayed based on vehicle type.
Rent Calculation

Car

Rent = (Rent Per Day × Days) + 500

Bike

Rent = (Rent Per Day × Days) - 100
💻 Sample Input
Enter Car Details:
Vehicle Number: CG04AB1234
Brand: Hyundai
Rent per Day: 1500
Enter number of days: 3

Enter Bike Details:
Vehicle Number: CG04XY5678
Brand: Honda
Rent per Day: 500
📋 Sample Output
Vehicle Number: CG04AB1234
Brand: Hyundai
Car Rent for 3 days: 5000.0

Vehicle Number: CG04XY5678
Brand: Honda
Bike Rent for 3 days: 1400.0
🎯 Learning Outcomes
Understanding class inheritance in Java
Implementing method overriding
Using runtime polymorphism
Applying constructor chaining with super
Building real-world applications using OOP principles
🔮 Future Enhancements
Add Customer Management
Vehicle Availability Tracking
Database Integration using JDBC & MySQL
GUI using JavaFX or Swing
Online Booking and Billing System
PDF Invoice Generation
👨‍💻 Author

Anshu Kumar
B.Tech CSE (Google Program)
Rungta International Skills University, Bhilai
