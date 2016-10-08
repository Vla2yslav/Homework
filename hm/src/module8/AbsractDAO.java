package module8;

import java.util.List;

public interface AbsractDAO <T, B>{

    <T> void save(User t);
    B delete(B b);
    <T> void deleteAll(List<T> list);
    <T> void saveAll(List<T> list);
    List<T> getList();

}
