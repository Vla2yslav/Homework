package module7.module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TripAdvisorAPI implements API {
    List<Room> rooms = new ArrayList<>();


    @Override
    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> findRooms = new ArrayList<>(rooms);
        Iterator<Room> it = findRooms.iterator();
        while (it.hasNext())
        {
            if (it.next().getPrice() != price && it.next().getPersons() != persons && it.next().getCityName() != city && it.next().getHotelName() != hotel)
                it.remove();
        }

        return findRooms;
    }

    public TripAdvisorAPI() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(351, 370, 2, new Date(), "Spa hotel", "Kiev"));
        rooms.add(new Room(67, 150, 3, new Date(2016, 9, 20), "Garden", "Praha"));
        rooms.add(new Room(39, 670, 4, new Date(2016, 9, 19), "Brand", "Berlin"));
        rooms.add(new Room(4, 80, 1, new Date(2016, 9, 17), "Arizonaburg", "Paris"));
        rooms.add(new Room(479, 127, 1, new Date(2016, 9, 18), "Sunshine", "Kiev"));

    }

}
