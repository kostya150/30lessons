package lesson5;

import java.util.Arrays;

import static lesson5.ArraysPractice.maxElement;
import static lesson5.ArraysPractice.nCount;
import static lesson5.Bank.withdraw;
import static lesson5.SortingExercise.arraysortAscending;
import static lesson5.SortingExercise.arraysortDescending;
import static lesson5.uniqueCount.uniqueCount;

public class Demo {
    public static void main(String[] args) {
        //ArraysPractice
        int[]array1 = {100,545464,345,55,-1000,-45,0,60,10};
        System.out.println(maxElement(array1));

        int[]array2 = {0,0,0,0,0,0,0,0,0};
        System.out.println(maxElement(array2));

        int[]array3 = {-10,0,110,555,1000,-45,0,60,10};
        System.out.println(maxElement(array3));

        int[]array4 = {1,1,1,1,1,1,1,1,1};
        System.out.println(nCount(array4,0));

        int[]array5 = {15,45,-4,3,5,2,343,5,1};
        System.out.println(nCount(array5,5));

        int[]array6 = {1,2,1,1,1,1,1,1,1};
        System.out.println(nCount(array6,1));

        //Bank
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        withdraw(names,balances,"Jack",200);
        System.out.println(Arrays.toString(balances));

        withdraw(names,balances,"Ann",-300);
        System.out.println(Arrays.toString(balances));

        withdraw(names,balances,"Denis",400);
        System.out.println(Arrays.toString(balances));

        //BanksPractice
        String[] names2 = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances2 = {100, 500, 8432, -99, 12000, -54, 0};
        withdraw(names,balances,"Denis",100);
        System.out.println(Arrays.toString(balances2));

        withdraw(names,balances,"Ann",600);
        System.out.println(Arrays.toString(balances2));

        withdraw(names,balances,"Andrey",100);
        System.out.println(Arrays.toString(balances2));



        //FirstArray
        int[] firstArray = {-1,5,24,34,35};
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = {1,10,15,20,-50};
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = {0,0,0,0,0};
        System.out.println(Arrays.toString(thirdArray));

        // SortingExercise

        int[] arrayfirst = {1,2,-4,5,246,7,2,1,10,0};
        int[] arraysecond = {0,15,56,47,246,7,2,1,10,100};
        int[] arraythird = {0,0,0,0,0,0,0,0,0,0};


        System.out.println(Arrays.toString(arraysortAscending(arrayfirst)));
        System.out.println(Arrays.toString(arraysortDescending(arrayfirst)));

        System.out.println(Arrays.toString(arraysortAscending(arraysecond)));
        System.out.println(Arrays.toString(arraysortDescending(arraysecond)));

        System.out.println(Arrays.toString(arraysortAscending(arraythird)));
        System.out.println(Arrays.toString(arraysortDescending(arraythird)));

        //uniqueCount
        int[] array7 = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11,5};
        System.out.println(uniqueCount(array7));

        int[] array8 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0};
        System.out.println(uniqueCount(array8));

        int[] array9 = {-11, -12, 10, 5, 4, 44, 100, 44, 11, 10, 11,5};
        System.out.println(uniqueCount(array9));




















    }
}
