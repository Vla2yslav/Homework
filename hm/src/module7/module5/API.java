package module7.module5;

import java.util.List;

public interface API {
   List<Room> getRooms();
    List<Room> findRooms(int price, int persons, String city, String hotel);

}
