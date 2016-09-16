package module5;



public class DAOImpl implements DAO {
    Room [] db = new Room [10];
    @Override
    public Room save(Room room) {
        int i =0;
        int count = 0;
        for (int p = 0; p < db.length; p++) {
            if (db[p] != null)
               count++ ;}
               if (count == db.length)
                   System.out.println("Data Base is full.");
        else for (i = 0; i < db.length; i++) {
            if (db[i] == null) {
                db[i] = room;
                System.out.println(room + " was saved.");
                return db[i];
                    }
                }

        return db[i];
    }

    @Override
    public boolean delete(Room room) {
        for (int i = 0; i<db.length;i++){
            if (room == db[i]){
                db[i] = null;
                break;}}
        System.out.println(room + " was deleted.");
        return true;
    }

    @Override
    public Room update(Room room) {
        int i =0;
        for (i = 0; i < db.length;i++){
            if (room.getId() == db[i].getId()){
                db[i] = room;
                System.out.println(room + " was updated.");
                break;}}

        return db[i];
    }

    @Override
    public Room findById(long id) {
        int i;
       for ( i = 0; i < db.length; i++){
            if (db[i].getId() == id ){
                System.out.println(db[i]+" is found.");
            return db[i];}
        }
        return db[i];
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
