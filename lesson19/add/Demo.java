package lesson19.add;

public class Demo {
    public static void main(String[] args) {
        Phone phone = new Phone(123, "iphone X", 1299.5, "China");
        printFields(phone);
    }

    public static void printFields(Phone phone){
        System.out.println(phone.getId());
        System.out.println(phone.getCountryMade());
        System.out.println(phone.getModel());
        System.out.println(phone.getPrice());
    }
}
