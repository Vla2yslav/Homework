package module4;
import module4.User;
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBalance() > user.getBalance() - amount)
            user.setBalance(user.getBalance() - amount);
    }

    @Override
    public void fundUser(User user, int amount) {
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBalance() > fromUser.getBalance() - amount)
        { fromUser.setBalance(fromUser.getBalance() - amount);
            fundUser(toUser,amount);}
    }

    @Override
    public void paySalary(User user) {
    user.setBalance(user.getBalance() + user.getSalary());
    }


}
