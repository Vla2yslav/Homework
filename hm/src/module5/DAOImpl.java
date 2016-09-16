package module5;



public class DAOImpl implements DAO {
    Room [] db = new Room [10];
    @Override
    public Room save(Room room) {
        for (int i = 0; i < db.length; i++) {
            if (db[i] == null) {
                System.out.println(room + " was saved.");
                return db[i];
            }
        }
        System.out.println("Data Base is full.");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        for (int i = 0; i<db.length;i++) {
            if (room == db[i]) {
                db[i] = null;
                System.out.println(room + " was deleted.");
                return true;
            }
        }
        System.out.println(room + " was not found.");
        return false;
    }

    @Override
    public Room update(Room room) {
        int i =0;
        for (i = 0; i < db.length; i++) {
            if (room.getId() == db[i].getId()) {
                db[i] = room;
                System.out.println(room + " was updated.");
                return db[i];
            }
        }
        System.out.println(room + " was not found.");
        return null;
    }

    @Override
    public Room findById(long id) {
        for (int i = 0; i < db.length; i++) {
            if (db[i].getId() == id ) {
                System.out.println(db[i] + " is found.");
                return db[i];
            }
        }
        System.out.println("Id was not found.");
        return null;
    }

    @Override
    public Room[] getAll() {
        int count = 0;
        for (int p = 0; p < db.length; p++) {
            if (db[p] != null)
                count++ ;}
        Room [] allRoom = new Room [count];
        int j = 0;
        for (int p = 0; p < count; p++) {
            if (db[p] != null){
                allRoom [j] = db[p];
            j++;}}
        return allRoom;
    }
}
