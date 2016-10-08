package module8;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl implements AbsractDAO{
   List<User> db = new ArrayList<>();

    @Override
    public void save(User t) {
        db.add(t);
        System.out.println("Obj was saved.");
    }

    @Override
    public Object delete(Object o) {
        if (db.contains(o)){
            db.remove(o);
            System.out.println("Obj was deleted.");}
        else System.out.println("Obj not found.");
        return db;
    }

    @Override
    public void deleteAll(List list) {
        if (db.containsAll(list)){
        db.removeAll(list);
            System.out.println("All obj was deleted.");}
        else System.out.println("Obj not found.");
    }

    @Override
    public void saveAll(List list) {
        db.addAll(list);
        System.out.println("All obj was saved.");
    }

    @Override
    public List getList() {
        System.out.println(db);
        return db;
    }
}
