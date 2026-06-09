import java.util.Scanner;

interface Service {
    double calculateBill(int days, double rate);
}

class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerDay;
    private boolean isAvailable;

    public Room(int roomNumber, String roomType, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean status) {
        isAvailable = status;
    }

    public void displayRoom() {
        System.out.println(
            "Room " + roomNumber +
            " | Type: " + roomType +
            " | Price: Rs." + pricePerDay +
            " | Status: " + (isAvailable ? "Available" : "Occupied")
        );
    }
}

class Hotel implements Service {

    private Room[][] rooms;

    public Hotel(int floors, int roomsPerFloor) {

        rooms = new Room[floors][roomsPerFloor];

        int roomNo = 101;

        for (int i = 0; i < floors; i++) {

            for (int j = 0; j < roomsPerFloor; j++) {

                String type;
                double price;

                if (j % 3 == 0) {
                    type = "Single";
                    price = 1000;
                } else if (j % 3 == 1) {
                    type = "Double";
                    price = 1500;
                } else {
                    type = "Deluxe";
                    price = 2500;
                }

                rooms[i][j] = new Room(roomNo, type, price);
                roomNo++;
            }

            roomNo += 99;
        }
    }

    public void bookRoom(int floor, int roomIndex) {

        if (rooms[floor][roomIndex].isAvailable()) {

            rooms[floor][roomIndex].setAvailability(false);

            System.out.println("Room booked successfully!");

        } else {

            System.out.println("Room already occupied.");
        }
    }

    public void cancelBooking(int floor, int roomIndex) {

        if (!rooms[floor][roomIndex].isAvailable()) {

            rooms[floor][roomIndex].setAvailability(true);

            System.out.println("Booking cancelled successfully.");

        } else {

            System.out.println("Room is already available.");
        }
    }

    public void displayRooms() {

        System.out.println("\n===== ROOM STATUS =====");

        for (int i = 0; i < rooms.length; i++) {

            for (int j = 0; j < rooms[i].length; j++) {

                rooms[i][j].displayRoom();
            }
        }
    }

    public double calculateBill(int days, double rate) {

        double total = days * rate;

        double tax = total * 0.10;

        return total + tax;
    }

    public Room getRoom(int floor, int roomIndex) {
        return rooms[floor][roomIndex];
    }
}

public class HotelReservationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel(2, 3);

        int choice;

        do {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. Book Room");
            System.out.println("2. Cancel Booking");
            System.out.println("3. Calculate Bill");
            System.out.println("4. Display Rooms");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter floor number (0-1): ");
                    int floor = sc.nextInt();

                    System.out.print("Enter room index (0-2): ");
                    int room = sc.nextInt();

                    hotel.bookRoom(floor, room);

                    break;

                case 2:

                    System.out.print("Enter floor number (0-1): ");
                    floor = sc.nextInt();

                    System.out.print("Enter room index (0-2): ");
                    room = sc.nextInt();

                    hotel.cancelBooking(floor, room);

                    break;

                case 3:

                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();

                    System.out.print("Enter room rate: ");
                    double rate = sc.nextDouble();

                    double bill = hotel.calculateBill(days, rate);

                    System.out.println("Total Bill = Rs." + bill);

                    break;

                case 4:

                    hotel.displayRooms();

                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}