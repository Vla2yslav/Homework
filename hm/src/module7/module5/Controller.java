package module7.module5;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<API> apis = new ArrayList<>();
    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }



    List<Room> requstRooms(int price, int persons, String city, String hotel){
        List<Room> rezult = new ArrayList<>();
        rezult.addAll(apis.get(0).findRooms(price, persons, city, hotel));
        rezult.addAll(apis.get(1).findRooms(price, persons, city, hotel));
        rezult.addAll(apis.get(2).findRooms(price, persons, city, hotel));

        return rezult;
    };

    List<Room> check(API api1, API api2){
        List<Room> datab = api1.getRooms();
        List<Room>  datab1 = api2.getRooms();
        List<Room> rezult = new ArrayList<>();
        for (int i = 0; i < datab.size(); i++) {
            for (int j = 0; j < datab1.size(); j++){
                if (datab.get(i).equals(datab1.get(j))) {
                    rezult.add(datab.get(i));
                    break;
                }
            }
        }

        return rezult;
    }
}
