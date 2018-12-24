package lesson27;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        useList();


    }

    public static void useList(){
        Order order1 = new Order(111, 11, "MJJ","fvdfv","LLL");
        Order order2 = new Order(222, 22, "LJJ","kjfsv","KKK");
        Order order3 = new Order(333, 33, "KJJ","tghbr","MMM");
        Order order4 = new Order(444, 44, "SJJ","rgthn","HHH");
        Order order5 = new Order(555, 55, "GJJ","dhsdf","GGG");


        LinkedList<Order> list = new LinkedList<>();
        list.add(order1);
        list.add(0, order2);
        list.remove(order1);
        list.remove(1);

        LinkedList<Order> list1 = new LinkedList<>();
        list1.add(order4);
        list1.add(order5);
        list.addAll(list1);

        list.subList(0,1);
        list.set(1, order3);
        list.contains(order1);
        list.toArray();
        list.clear();

    }
}

