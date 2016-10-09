package module8;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbsractDAO<T>{
   List<T> db = new ArrayList<>();

    @Override
    public T save(T t) {
        db.add(t);
        System.out.println("Obj was saved.");
        return t;
    }

    @Override
    public void delete(T o) {
        if (db.contains(o)){
            db.remove(o);
            System.out.println("Obj was deleted.");}
        else System.out.println("Obj not found.");
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
