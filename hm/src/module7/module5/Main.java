package module7.module5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Controller contrl = new Controller();
        contrl.requstRooms(150, 2, "Praha", "Hilton");
        contrl.requstRooms(500, 5, "Berlin", "Garden");
        contrl.requstRooms(250, 1, "Kiev", "Sunrise");

        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();


        contrl.check(api1, api2);
        contrl.check(api1, api3);
        contrl.check(api2, api3);

        Room room23 = new Room(856, 370, 2, new Date(), "Cool hotel", "Kiev");
        Room room24 = new Room(735, 290, 3, new Date(2016, 10, 20), "Mountain", "Praha");
        Room room25 = new Room(5, 640, 4, new Date(2016, 10, 19), "Harold", "Berlin");
        Room room26 = new Room(790, 505, 2, new Date(2016, 10, 17), "Apler", "Paris");
        Room room27 = new Room(5, 527, 2, new Date(2016, 10, 18), "Sungarden", "Kiev");
        Room room28 = new Room(351, 370, 2, new Date(), "Spa hotel", "Kiev");

        DAOImpl oper = new DAOImpl();

        oper.save(room23);
        oper.save(room24);
        oper.delete(room24);
        oper.save(room25);
        oper.update(room27);
        //oper.findById(856);
        oper.findById(5);
        //oper.update(room27);

        oper.getAll();
    }
}
