package module5;

import java.util.Date;

public class BookingComAPI implements API {

    Room[] rooms = new Room[5];

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room [] findRooms = new Room [rooms.length];
        int count = 0;
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel)
                findRooms[count++] = rooms[i];
        }
        Room[] resultRooms = new Room[count];
        for (int i = 0; i < count; i++) {
            resultRooms[i] = findRooms[i];
        }
        return resultRooms;
    }

    public BookingComAPI() {
        rooms = new Room[5];
        Room room1 = new Room(31, 300, 2, new Date(), "Boom hotel", "Kiev");
        Room room2 = new Room(100, 250, 3, new Date(2016, 10, 20), "Hilton", "Praha");
        Room room3 = new Room(345, 500, 4, new Date(2016, 10, 19), "Hilton", "Berlin");
        Room room4 = new Room(657, 50, 1, new Date(2016, 10, 17), "Arizon", "Paris");
        Room room5 = new Room(6, 167, 1, new Date(2016, 10, 18), "Sunrise", "Kiev");

        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

   public Room[] getRooms() {
        return rooms;
    }
}
