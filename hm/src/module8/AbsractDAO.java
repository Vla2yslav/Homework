package module8;

import java.util.List;

public interface AbsractDAO <T>{

    T  save(T t);
    void delete(T b);
    void deleteAll(List<T> list);
    void saveAll(List<T> list);
    List<T> getList();

}
