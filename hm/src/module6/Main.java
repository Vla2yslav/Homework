package module6;

public class Main {


    public static void main(String[] args) {
        User user1 = new User(32423, "Vlad", "Len", 300, 100);
        User user2 = new User(986, "Diego", "Campos", 200, 500);
        User user3 = new User(467, "Jack", "White", 500, 10);
        User user4 = new User(467, "Jack", "White", 500, 10);
        User user5 = new User(76, "Naoko", "Oonishi", 200, 500);


        User [] users = new User [6];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[5] = user5;

        UserUtils util = new UserUtils();

        System.out.println(users);

        util.uniqueUsers(util.deleteEmptyUsers(users));
        util.usersWithConditionalBalance(users, 100);
        util.deleteEmptyUsers(users);
        UserUtils.paySalaryToUsers(util.deleteEmptyUsers(users));
        UserUtils.getUsersId(util.deleteEmptyUsers(users));

        System.out.println(users);

    }
}
