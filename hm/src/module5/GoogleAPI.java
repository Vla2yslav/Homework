package module5;

import java.util.Date;

public class GoogleAPI implements API {

    private Room [] rooms;
    Room [] findRooms;

    public GoogleAPI() {
        Room room11 = new Room(856, 370, 2, new Date(), "Cool hotel", "Kiev");
        Room room12 = new Room(735, 290, 3, new Date(2016, 10, 20), "Mountain", "Praha");
        Room room13 = new Room(5, 640, 4, new Date(2016, 10, 19), "Harold", "Berlin");
        Room room14 = new Room(790, 505, 2, new Date(2016, 10, 17), "Apler", "Paris");
        Room room15 = new Room(23, 527, 2, new Date(2016, 10, 18), "Sungarden", "Kiev");
        rooms[10] = room11;
        rooms[11] = room12;
        rooms[12] = room13;
        rooms[13] = room14;
        rooms[14] = room15;

    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room roomHotel[] = rooms;
        for (int i =0; i <= 5;i++){
            if (roomHotel[i].getPrice() == price || roomHotel[i].getPersons() == persons || roomHotel[i].getCityName() == city || roomHotel[i].getHotelName() == hotel)
                roomHotel[i] = findRooms[i];
        }

        return findRooms;
    }

    public Room[] getRooms() {
        return rooms;
    }
}

