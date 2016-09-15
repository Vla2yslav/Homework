package module5;

import java.util.Date;

public class GoogleAPI implements API {

    Room [] rooms;


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

    public GoogleAPI() {
        rooms = new Room[5];
        Room room11 = new Room(856, 370, 2, new Date(), "Cool hotel", "Kiev");
        Room room12 = new Room(735, 290, 3, new Date(2016, 10, 20), "Mountain", "Praha");
        Room room13 = new Room(5, 640, 4, new Date(2016, 10, 19), "Harold", "Berlin");
        Room room14 = new Room(790, 505, 2, new Date(2016, 10, 17), "Apler", "Paris");
        Room room15 = new Room(23, 527, 2, new Date(2016, 10, 18), "Sungarden", "Kiev");

        rooms[0] = room11;
        rooms[1] = room12;
        rooms[2] = room13;
        rooms[3] = room14;
        rooms[4] = room15;

    }

    public Room[] getRooms() {
        return rooms;
    }
}

