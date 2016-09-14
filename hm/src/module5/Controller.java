package module5;

public class Controller {
    API apis[] = new API[3];

    Room[] requstRooms(int price, int persons, String city, String hotel){
      Room [] DB;
        Room [] DB1;
        Room [] DB2;
        Room [] Rezult;
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
        DB = apis[0].findRooms(price, persons, city, hotel);
        DB1 =  apis[1].findRooms(price, persons, city, hotel);
        DB2  = apis[2].findRooms(price, persons, city, hotel);
        int i = DB.length + DB1.length + DB2.length;
        Rezult = new Room[i];
        for (int j = 0; j < DB.length; j++){
            Rezult[j] = DB[j];
        }
        for (int j = DB.length, k = 0; k < DB1.length; j++, k++) {
            Rezult[j] = DB1[k];
        }
        for (int j = DB1.length, k = 0; k < DB2.length; j++, k++) {
            Rezult[j] = DB2[k];
        }

        return Rezult;
    };

    Room [] check(API api1, API api2){
       Room [] DB;
        Room [] DB1;
        Room [] DB2;
        DB = api1.getRooms();
        DB1 = api2.getRooms();
        int l= 0;
        /*if (DB.length < DB1.length)
            l = DB.length;
        else l = DB1.length;*/
        DB2 = new Room [l];
        for (int i = 0; i < DB.length; i++) {
            if (DB[i].equals(DB1[i]))
                DB2[i] = DB[i];
            for (int j = 1; j < DB1.length; j++){
                if (DB[i].equals(DB1[j]))
                    DB2[j] = DB[j];}
        }
        return DB2;
    };
}
/*
Room[] requstRooms(int price, int persons, String city, String hotel)
which finds all the rooms with requested params. Method use all apis available to make search.
Found rooms create to DB

Room[] check(API api1, API api2)
Check how many the same rooms two different apis return
 */