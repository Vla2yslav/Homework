package module9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static List<List<Order>> separateCity(List<Order> orders) {
        Set<Order> set = new HashSet<>(orders);

        Function<Order, List<Order>> f = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {
                return set.stream()
                        .filter(o -> o.getUser().getCity().equals(order.getUser().getCity()))
                        .collect(Collectors.toList());
            }
        };

        List<List<Order>> res =  orders.stream()
                .map(f)
                .collect(Collectors.toList());
        return res;
    }

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
        orders.add(new Order(3525, 50, Currency.UAH, "Wheel", "BobShop", new User(234432, "Vlad", "Len", "Kiev", 200)));
        orders.add(new Order(35213, 250, Currency.UAH, "car", "Dilan", new User(297532, "Den", "Naizer", "Praha", 100)));
        orders.add(new Order(6895, 890, Currency.EUR, "t-shirt", "CarShop", new User(4432, "Dave", "Sore", "NY", 2000)));
        //  orders.add(new Order(3523235, 10,Currency.USD, "apple", "OrangeShop", new User(98032, "Bob", "Wendel", "Berlin", 150)));
        orders.add(new Order(467, 40,Currency.USD, "glass", "BusShop", new User(98032, "Bob", "Wendel", "Berlin", 150)));
        orders.add(new Order(6895, 890, Currency.EUR, "t-shirt", "CarShop", new User(4432, "Dave", "Sore", "NY", 2000)));
        orders.add(new Order(875, 1600, Currency.EUR, "jacket", "BikeShop", new User(56432, "Shon", "Tompks", "Vashington", 2200)));
        orders.add(new Order(34575, 32, Currency.EUR, "bike", "ClothesShop", new User(98432, "Dilan", "Nale", "Odessa", 2)));
        orders.add(new Order(33625, 12, Currency.USD, "watch", "WatchShop", new User(2122, "Dona", "Gale", "Munchen", 34)));
        orders.add(new Order(33625, 12, Currency.USD, "watch", "WatchShop", new User(2122, "Dona", "Gale", "Munchen", 34)));


        orders.stream().sorted((o1, o2) -> o2.getPrice() - o1.getPrice());
        orders.stream().sorted((o1, o2) -> {
            if (o1.getPrice() != o2.getPrice())
                return o1.getPrice() - o2.getPrice();
            else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
        orders.stream().sorted((o1, o2) -> {
            if (!o1.getItemName().equals(o2.getItemName()))
                return o1.getItemName().compareTo(o2.getItemName());
            else if (!o1.getShopIdentificator().equals(o2.getShopIdentificator()))
                return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });

        Predicate<Order> price = p -> p.getPrice() > 1500;
        Predicate<Order> surname = s -> s.getUser().getLastName().equalsIgnoreCase("Petrov");
        Predicate<Order> currency = c -> !c.getCurrency().equals(Currency.USD);

       // orders.stream().filter(price).forEach(System.out::println);

        orders.stream().anyMatch(surname);

        orders.stream().filter(currency);

      //  orders.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);


       // System.out.println(separateCity(orders));

        Function<Order, List<Order>> f = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {
                return orders.stream()
                        .filter(o -> o.getCurrency().equals(Currency.UAH))
                        .collect(Collectors.toList());
            }
        };

orders.stream().map(f).forEach(System.out::println);
    }
}
