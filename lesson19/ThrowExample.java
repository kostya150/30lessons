package lesson19;

public class ThrowExample {
    private static String[] array = {"test", "teat1", null, "testqwd","adsasf", "sdfsdf"};

    public static void main(String[] args) {
        useOfTestMethod();

    }

    private static void test() throws Exception{
        for(String element: array){
            if(element == null)
                throw new Exception("null is detected");

        }
        System.out.println("done");
    }

    private static void useOfTestMethod(){
        try{
            //some code
            test();
            //some code
        }catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
