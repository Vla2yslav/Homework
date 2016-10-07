package module7.module5;

import java.util.List;

public interface DAO {

    List<Room> save(Room room);
    boolean delete(Room room);
    List<Room> update(Room room);
    List<Room> findById(long id);
    List<Room> getAll();
}
