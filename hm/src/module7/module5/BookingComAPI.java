package module7.module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookingComAPI implements API {
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

    public BookingComAPI() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(31, 300, 2, new Date(), "Boom hotel", "Kiev"));
        rooms.add(new Room(100, 250, 3, new Date(2016, 10, 20), "Hilton", "Praha"));
        rooms.add(new Room(345, 500, 4, new Date(2016, 10, 19), "Hilton", "Berlin"));
        rooms.add(new Room(657, 50, 1, new Date(2016, 10, 17), "Arizon", "Paris"));
        rooms.add(new Room(6, 167, 1, new Date(2016, 10, 18), "Sunrise", "Kiev"));


    }

}
