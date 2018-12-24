package lesson19.add;

public class Solutions {
    public static void main(String[] args)  {
        int[] array = {1,2,3};
        System.out.println(arrayElementsSum(array));
    }
    public static int arrayElementsSum(int[] array){

        int res = 0;
        for(int i : array){
            res = res + i;

        }
        return res;

    }

}
