package lesson18.HW;
import static java.lang.Character.isDigit;
public class Solution {
    public static void main(String[] args) {
        String text = "word 5 hello 1 5 6";


    }
    public static int[] findNumbers(String text){
        String[] words = text.split(" ");
        int[]arr = new int[words.length];

        for(int i = 0; i < arr.length;i++){
            if(isDigit(i)){
                arr[i] = i;
            }else
            System.out.println("not a number");

        }
        return arr;
    }

    public static int[] findNumber(String text){
        String[] words = text.split(" ");
        int[]arr = new int[words.length];
        try{
            for(int i = 0; i < arr.length;i++){
                if(isDigit(i)){
                    arr[i] = i;
                }
            }
            return arr;
        }catch (Exception e){
            System.out.println("not a number");
            return null;
        }
    }

}

