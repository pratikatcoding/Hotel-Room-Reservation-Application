# Hotel Room Reservation Application

A console-based Hotel Room Reservation System developed using Core Java and Object-Oriented Programming (OOP) principles. The application simulates a real-world hotel booking environment by managing room reservations, cancellations, availability tracking, and billing operations through a menu-driven interface.

## Project Overview

This project demonstrates the practical implementation of Core Java concepts and OOP principles such as Encapsulation, Abstraction, Interfaces, Classes, and Objects. It provides a simple yet scalable foundation for hotel management software.

## Features

### Room Management

* Manage rooms across multiple hotel floors.
* Track room availability in real time.
* Organize rooms using a 2D array structure.

### Room Reservation

* Book available rooms instantly.
* Validate room availability before confirmation.
* Update room status automatically after booking.

### Booking Cancellation

* Cancel existing reservations.
* Restore room availability immediately.

### Automated Billing

* Calculate customer bills based on room type and duration of stay.
* Generate accurate billing information dynamically.

### Room Status Display

* View all rooms and their current status.
* Display hotel room layout in a structured format.

### Multi-Floor Hotel Representation

* Simulate a hotel with multiple floors and room categories.

## Technologies Used

* Java
* Core Java Collections and Arrays
* Object-Oriented Programming (OOP)
* Interfaces
* Encapsulation
* Abstraction

## OOP Concepts Implemented

### Interface

The `Service` interface defines the billing contract through the `calculateBill()` method, ensuring consistent billing behavior.

### Encapsulation

Room-related attributes are kept private and accessed using public getter and setter methods.

### Abstraction

Billing implementation details are hidden behind the `Service` interface, exposing only the required functionality.

### Classes and Objects

Real-world entities such as `Room` and `Hotel` are modeled using classes and objects.

## Project Structure

```text
Hotel Room Reservation Application
│
├── Service Interface
│   └── calculateBill()
│
├── Room Class
│   ├── roomNumber
│   ├── roomType
│   ├── pricePerDay
│   └── availabilityStatus
│
└── Hotel Class
    ├── Book Room
    ├── Cancel Booking
    ├── Display Rooms
    └── Generate Bill
```

## Workflow

1. Initialize the hotel and room data.
2. Display the main menu.
3. Select an operation:

   * Book Room
   * Cancel Booking
   * View Room Status
   * Generate Bill
4. Perform requested action.
5. Continue until the user exits the application.

## Advantages

* Easy-to-understand console interface.
* Demonstrates key OOP concepts effectively.
* Modular and scalable architecture.
* Reduced manual effort in room management.
* Suitable for academic and learning purposes.

## Future Enhancements

* MySQL or SQLite database integration.
* Java Swing or JavaFX graphical user interface.
* Guest profile management.
* Check-In and Check-Out functionality.
* Dynamic room pricing based on demand.
* Online payment gateway integration.
* Multi-user support and authentication.

## Sample Functionalities

* Room Availability Tracking
* Room Reservation
* Booking Cancellation
* Automated Billing
* Hotel Room Status Display
* Multi-Floor Room Management

## Learning Outcomes

This project provides hands-on experience with:

* Core Java Programming
* Object-Oriented Design
* Interface Implementation
* Encapsulation and Abstraction
* Menu-Driven Application Development
* Real-World System Modeling

## Author

**Pratik Karmakar**
* Rungta International Skills University
* Session: 2025–26

## Conclusion

The Hotel Room Reservation Application successfully demonstrates how Core Java and OOP concepts can be applied to build a functional hotel management system. Its modular design allows future expansion with GUI components, databases, and advanced hotel management features.
