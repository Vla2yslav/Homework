package module5;

import java.util.Date;

public class TripAdvisorAPI implements API {
    private Room [] rooms;
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return rooms;
    }

    public TripAdvisorAPI() {
            Room room6 = new Room(351, 370, 2, new Date(), "Spa hotel", "Kiev");
            Room room7 = new Room(67, 150, 3, new Date(2016, 9, 20), "Garden", "Praha");
            Room room8 = new Room(39, 670, 4, new Date(2016, 9, 19), "Brand", "Berlin");
            Room room9 = new Room(4, 80, 1, new Date(2016, 9, 17), "Arizonaburg", "Paris");
            Room room10 = new Room(479, 127, 1, new Date(2016, 9, 18), "Sunshine", "Kiev");
        rooms[5] = room6;
        rooms[6] = room7;
        rooms[7] = room8;
        rooms[8] = room9;
        rooms[9] = room10;
    }
}
