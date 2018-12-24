package lesson10.HW;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Олег","Львов","Мужской");
        Customer customer1 = new Customer("Анна","Харьков","Женский");
        ElectronicsOrder electronicsOrder = new ElectronicsOrder("iphoneX", null,
                "Харьков", "Львов",100, customer, 12);

        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("TVset",null,
                "Киев", "Одесса", 200,customer1, 12);


    Customer customer2 = new Customer("Виктор","Одесса","Мужской");
    Customer customer3 = new Customer("Татьяна","Днепр","Женский");
    FurnitureOrder furnitureOrder = new FurnitureOrder("Table", null,
                "Киев", "Одесса",100, customer2, "bergerrths124");
    FurnitureOrder furnitureOrder1 = new FurnitureOrder("Chair", null,
                "Одесса", "Днепр",100, customer3, "bergerrths1243252");
    }
}
