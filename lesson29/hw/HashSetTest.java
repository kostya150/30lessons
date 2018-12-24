package lesson29.hw;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    private static Order useHashSet(){
        Set<Order> orders = new HashSet<>();
        Order order1 = new Order(12345, 234,"USD" ,"TV","Rztk");
        Order order2 = new Order(12346, 231,"EUR" ,"Microwave","Mfer");
        Order order3 = new Order(12347, 232,"USD" ,"iron","Citrus");
        Order order4 = new Order(12348, 233,"EUR" ,"fridge","Hotline");
        Order order5 = new Order(12349, 235,"USD" ,"phone","Ali");

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);

        orders.toArray();

        orders.size();

        Set<Order> orders1 = new HashSet<>();
        orders1.add(order4);
        orders1.add(order5);
        orders1.add(order3);
        orders.retainAll(orders1);





        System.out.println(orders);
        return null;

    }
}
