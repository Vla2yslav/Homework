package module5;

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
    }
}
