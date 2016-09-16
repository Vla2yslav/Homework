package module6;

public class UserUtils {
    User[] uniqueUsers(User[] users){
        for (int i = 0, k = 1; i < users.length; i++, k++){
           if (k == users.length)
               break;
            if (users[i] == null)
                deleteEmptyUsers(users);
            if (k == deleteEmptyUsers(users).length)
                break;
            if (users[i].equals(users[k]))
                users[k] = null;}
    return users;
    }

    User[] usersWithConditionalBalance(User[] users, int balance){
        User [] arrayUser = new User[1];
        for (int i = 0; i < users.length; i++)
            if (users[i].getBalance() == balance){
                arrayUser[0] = users[i];
                break;}
       return arrayUser;
    }

   static User[] paySalaryToUsers(User[] users){
        for (int i = 0; i < users.length; i++)
        {
          users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }

        return users;
    }

   static long[] getUsersId(User[] users){
        long arrayId [];
        arrayId = new long [users.length];
        for (int i = 0; i < users.length; i++)
           arrayId[i] = users[i].getId();

        return arrayId;
    }

    User[] deleteEmptyUsers(User[] users){
        int count = 0;
        int p = 0;
        for (int i = 0; i < users.length; i++){
            if (users[i] != null)
                count ++;}
        User [] alluser = new User[count];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null){
            alluser[p] = users[i];
            p++;}
        }
        return alluser;
    }

}
