package module5;

import java.util.Date;

public class BookingComAPI implements API {
    private Room [] rooms; 
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return rooms;
    }

    public BookingComAPI() {
        Room room1 = new Room(31, 300, 2, new Date(), "Boom hotel", "Kiev");
        Room room2 = new Room(123, 250, 3, new Date(2016, 10, 20), "Hilton", "Praha");
        Room room3 = new Room(345, 500, 4, new Date(2016, 10, 19), "Hilton", "Berlin");
        Room room4 = new Room(657, 50, 1, new Date(2016, 10, 17), "Arizon", "Paris");
        Room room5 = new Room(6, 167, 1, new Date(2016, 10, 18), "Sunrise", "Kiev");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }
}
