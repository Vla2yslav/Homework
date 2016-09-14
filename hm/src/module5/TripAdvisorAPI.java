package module5;

import java.util.Date;

public class TripAdvisorAPI implements API {
    Room [] rooms;
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room [] findRooms = new Room [rooms.length];
        int count = 0;
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i].getPrice() == price || rooms[i].getPersons() == persons || rooms[i].getCityName() == city || rooms[i].getHotelName() == hotel)
                findRooms[count++] = rooms[i];
        }
        Room[] resultRooms = new Room[count];
        for (int i = 0; i < count; i++) {
            resultRooms[i] = findRooms[i];
        }
        return resultRooms;
    }

    public TripAdvisorAPI() {
        rooms = new Room[5];
            Room room6 = new Room(351, 370, 2, new Date(), "Spa hotel", "Kiev");
            Room room7 = new Room(67, 150, 3, new Date(2016, 9, 20), "Garden", "Praha");
            Room room8 = new Room(39, 670, 4, new Date(2016, 9, 19), "Brand", "Berlin");
            Room room9 = new Room(4, 80, 1, new Date(2016, 9, 17), "Arizonaburg", "Paris");
            Room room10 = new Room(479, 127, 1, new Date(2016, 9, 18), "Sunshine", "Kiev");
        rooms[0] = room6;
        rooms[1] = room7;
        rooms[2] = room8;
        rooms[3] = room9;
        rooms[4] = room10;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
