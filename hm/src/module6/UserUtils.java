package module6;

public class UserUtils {
    User[] uniqueUsers(User[] users){

        for (int i = 0; i < users.length; i++) {
          users = deleteEmptyUsers(users);
            for (int j = 0; j < users.length; j++){
                if (users[i] == null)
                    deleteEmptyUsers(users);
                if (users[i].equals(users[j]) && j != i) {
                    users[j] = null;}
            }
        }
    return users;

    }

    User[] usersWithConditionalBalance(User[] users, int balance){
        int count = 0;
        int p = 0;
        for (int i = 0; i < users.length; i++)
            if (users[i].getBalance() == balance){
            count++;
            }
        User [] arrayUser = new User[count];
        for (int i = 0; i < users.length; i++)
            if (users[i].getBalance() == balance){
                arrayUser[p] = users[i];
                p++;}
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
