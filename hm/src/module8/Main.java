package module8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User user = new User("Vlad", 23434321);
        User user1 = new User("Dale", 23421);
        User user2 = new User("Vova", 2971);
        User user3 = new User("Jack", 1);

        List<User> addusers = new ArrayList<>();
        addusers.add(user2);
        addusers.add(user3);


        userDAO.save(user);
        userDAO.delete(user1);
        userDAO.saveAll(addusers);
        userDAO.deleteAll(addusers);
        userDAO.save(user3);
        userDAO.getList();
        userDAO.deleteById(1);
        userDAO.getList();

    }
}
