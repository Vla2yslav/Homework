package module8;

public class UserDAO extends AbstractDAOImpl<User>{
    @Override
    public void deleteById(long id) {
        for (int i =0; i < db.size(); i++){
            if (db.get(i).getId() == id){
                db.remove(i);
                System.out.println("Obj was deleted.");}
        }
    }

    @Override
    public User get(long id) {
        for (int i =0; i < db.size(); i++){
            if (db.get(i).getId() == id)
            return db.get(i);}
        return null;
    }

}
