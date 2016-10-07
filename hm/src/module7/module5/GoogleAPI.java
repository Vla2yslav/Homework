package module7.module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoogleAPI implements API {
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

    public GoogleAPI() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(856, 370, 2, new Date(), "Cool hotel", "Kiev"));
        rooms.add(new Room(735, 290, 3, new Date(2016, 10, 20), "Mountain", "Praha"));
        rooms.add(new Room(5, 640, 4, new Date(2016, 10, 19), "Harold", "Berlin"));
        rooms.add(new Room(790, 505, 2, new Date(2016, 10, 17), "Apler", "Paris"));
        rooms.add(new Room(23, 527, 2, new Date(2016, 10, 18), "Sungarden", "Kiev"));

    }

}

