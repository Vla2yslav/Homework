package module4;
import module4.User;
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfWithdrawal())
        if ((user.getBalance() - amount) >= 0)
            user.setBalance(user.getBalance() - amount - user.getBank().getCommission());
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfFunding())
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if ((fromUser.getBalance() - amount) >= 0)
        { fromUser.setBalance(fromUser.getBalance() - amount);
            fundUser(toUser,amount);}
    }

    @Override
    public void paySalary(User user) {
    user.setBalance(user.getBalance() + user.getSalary());
    }


}
