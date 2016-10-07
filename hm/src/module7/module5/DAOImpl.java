package module7.module5;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DAOImpl implements DAO {
    List<Room> db = new ArrayList<>();
    @Override
    public List<Room> save(Room room) {
        db.add(room);
        System.out.println(room + " was saved.");
        return db;
    }

    @Override
    public boolean delete(Room room) {
        Iterator<Room> it = db.iterator();
        while (it.hasNext()) {
            if (it.next() == room) {
                it.remove();
                System.out.println(room + " was deleted.");
                return true;
            }
        }
        System.out.println(room + " was not found.");
            return false;

    }

    @Override
    public List <Room> update(Room room) {
        for (int i = 0;i< db.size(); i++ ) {
            if (db.get(i).getId() == room.getId()){
                db.set(i, room);
            System.out.println(room + " was updated.");
            return db;}
        }
        System.out.println(room + " not found.");
        return null;
    }

    @Override
    public List<Room> findById(long id) {
        for (int i = 0;i< db.size(); i++ ) {
            if (db.get(i).getId() == id){
                System.out.println(db.get(i) + " is found.");
                return db;
            }
        }
        System.out.println("Id was not found.");
        return null;
    }

    @Override
    public List<Room> getAll() {
        System.out.println(db);
        return db;
    }
}
