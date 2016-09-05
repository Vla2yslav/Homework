package module4;
import module4.User;
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.balance > user.balance - amount)
            user.balance -= amount;
    }

    @Override
    public void fundUser(User user, int amount) {
        user.balance += amount;
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        withdrawOfUser(fromUser, amount);
        fundUser(toUser,amount);
    }

    @Override
    public void paySalary(User user) {
    user.balance += user.salary;
    }


}
