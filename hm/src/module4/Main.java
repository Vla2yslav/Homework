package module4;

import  module4.Bank;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(23344312, "Jack", 200, 4, "IT", 500, new USBank(1413413, "USA", Currency.USD, 29, 500, 23, 10000));
        User user2 = new User(4383925, "Oww", 1000, 12, "Go go", 1000, new USBank(4663119, "USA", Currency.USD, 58, 1000, 54, 100000));
        User user3 = new User(8493191, "Oliver", 5000, 36, "Quick", 600, new EUBank(937491, "Germany", Currency.EUR, 128, 570, 67, 150000));
        User user4 = new User(94109241, "Ann", 10, 11, "Boom", 400, new EUBank(97431424, "Poland", Currency.EUR, 49, 390, 51, 70000));
        User user5 = new User(93289123, "Drake", 150, 40, "Pineapple", 300, new ChinaBank(24541298, "China", Currency.EUR, 300, 290, 87, 500000));
        User user6 = new User(812312, "Sara", 300, 23, "Yang", 400, new ChinaBank(3948741, "China", Currency.USD, 500, 450, 56, 600000));


        BankSystemImpl bankSystem = new BankSystemImpl();
        bankSystem.withdrawOfUser(user1, 100);
        bankSystem.fundUser(user1, 500);
        bankSystem.transferMoney(user1, user4, 500);
        bankSystem.paySalary(user1);
        System.out.println(user1);

        bankSystem.withdrawOfUser(user2, 20);
        bankSystem.fundUser(user2, 5);
        bankSystem.transferMoney(user2, user1, 90);
        bankSystem.paySalary(user2);
        System.out.println(user2);

        bankSystem.withdrawOfUser(user3, 2330);
        bankSystem.fundUser(user3, 51);
        bankSystem.transferMoney(user3, user2, 950);
        bankSystem.paySalary(user3);
        System.out.println(user3);

        bankSystem.withdrawOfUser(user4, 500);
        bankSystem.fundUser(user4, 345);
        bankSystem.transferMoney(user4, user1, 290);
        bankSystem.paySalary(user4);
        System.out.println(user4);

        bankSystem.withdrawOfUser(user5, 220);
        bankSystem.fundUser(user5, 125);
        bankSystem.transferMoney(user5, user4, 104);
        bankSystem.paySalary(user5);
        System.out.println(user5);

        bankSystem.withdrawOfUser(user6, 208);
        bankSystem.fundUser(user6, 5);
        bankSystem.transferMoney(user6, user3, 260);
        bankSystem.paySalary(user6);
        System.out.println(user6);
    }

}