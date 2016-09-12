package module5;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room + " was saved.");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room + " was deleted.");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room + " was updated.");
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println(id + " was found.");
        return null;
    }
}
