package lesson19;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        //arithmetic exception
        arithmeticexception(2);
        try{
            arithmeticexception(0);
        }catch(ArithmeticException e){
            System.out.println("Something wrong");
        }

        npe(new Object());
        npe(null);

    }
    public static void arithmeticexception(int a){
        System.out.println(10 / a);
    }

    public static void npe(Object object){
        if(object != null){
        System.out.println(object.hashCode());
        }
    }

}
