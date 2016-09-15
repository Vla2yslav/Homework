package module5;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class DAOImpl implements DAO {
    Room [] db = new Room [10];
int i;
    @Override
    public Room save(Room room) {
        for (int i = 0; i < db.length; i++){
            if (db[i] == null)
               db[i] = room;
        break;}

        System.out.println(room + " was saved.");
        return db[i];
    }

    @Override
    public boolean delete(Room room) {
        for (i = 0; i<db.length;i++){
            if (room == db[i])
                db[i] = null;
        break;}
        System.out.println(room + " was deleted.");
        return true;
    }

    @Override
    public Room update(Room room) {
        db[9] = room;
        System.out.println(room + " was updated.");
        return db[9];
    }

    @Override
    public Room findById(long id) {
        Room [] findRoomId = new Room[10];
        for (i = 0; i < db.length; i++){
        if (id == db[i].getId())
            findRoomId[i] = db[i];
        break;}
        if (findRoomId[i] == null)
             System.out.println("ID doesn't exist.");
        else System.out.println(findRoomId[i] + " was found.");
        return findRoomId[i];
    }

    @Override
    public Room[] getAll() {
        return db;
    }
}
