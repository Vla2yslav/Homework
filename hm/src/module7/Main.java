package module7;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User(234432, "Vlad", "Len", "Kiev", 200));
        users.add(new User(297532, "Den", "Naizer", "Praha", 100));
        users.add(new User(2332, "Dima", "Kirk", "Moscow", 20));
        users.add(new User(98032, "Bob", "Wendel", "Berlin", 150));
        users.add(new User(4432, "Dave", "Sore", "NY", 2000));
        users.add(new User(56432, "Shon", "Tompks", "Vashington", 2200));
        users.add(new User(98432, "Dilan", "Nale", "Odessa", 2));
        users.add(new User(24354432, "Angel", "Li", "Minsk", 890));
        users.add(new User(23440932, "Izek", "L", "Kiev", 654));
        users.add(new User(2122, "Dona", "Gale", "Munchen", 34));


        List<Order> orders = new ArrayList<>();
       // orders.add(new Order(3525, 50,Currency.UAH, "Wheel", "BobShop", new User(234432, "Vlad", "Len", "Kiev", 200)));
       // orders.add(new Order(35213, 250,Currency.UAH, "car", "Dilan", new User(297532, "Den", "Naizer", "Praha", 100)));
      //  orders.add(new Order(5465, 540,Currency.USD, "bus", "AppleShop", new User(2332, "Dima", "Kirk", "Moscow", 20)));
      //  orders.add(new Order(3523235, 10,Currency.USD, "apple", "OrangeShop", new User(98032, "Bob", "Wendel", "Berlin", 150)));
       // orders.add(new Order(467, 40,Currency.USD, "glass", "BusShop", new User(98032, "Bob", "Wendel", "Berlin", 150)));
       // orders.add(new Order(6895, 890,Currency.EUR, "t-shirt", "CarShop", new User(4432, "Dave", "Sore", "NY", 2000)));
        orders.add(new Order(875, 546,Currency.EUR, "jacket", "BikeShop", new User(56432, "Shon", "Tompks", "Vashington", 2200)));
        orders.add(new Order(34575, 32,Currency.EUR, "bike", "ClothesShop", new User(98432, "Dilan", "Nale", "Odessa", 2)));
        orders.add(new Order(33625, 12,Currency.USD, "watch", "WatchShop", new User(2122, "Dona", "Gale", "Munchen", 34)));
        orders.add(new Order(33625, 12,Currency.USD, "watch", "WatchShop", new User(2122, "Dona", "Gale", "Munchen", 34)));

        //System.out.println(users);
        //System.out.println(orders);

        //orders.sort(new Compare());
        //System.out.println(orders);

        //orders.sort(new comparecity());
        //System.out.println(orders);

       // orders.sort(new compare3());
        //System.out.println(orders);

        Set<Order> set = new HashSet<>(orders);
        System.out.println(set);
       // List<Order> list = new ArrayList<>(set);

        //System.out.println(list);
    }
}
