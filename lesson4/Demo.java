package lesson4;

import static lesson4.CompareSums.compareSums;
import static lesson4.ConcatExercise.concat;
import static lesson4.CountExercise.findDivCount;
import static lesson4.MethodExample.increaser;
import static lesson4.MethodExample.min;
import static lesson4.PracticeExample.average;
import static lesson4.PracticeExample.count;
import static lesson4.PracticeExample.min;



public class Demo {
    public static void main(String[] args) {
        //CompareSums : промежуток [1,5] и [1,10]сравниваем суммы промежутка 1 и промежутка 2

        System.out.println(compareSums(-2,5,1,10));
        System.out.println(compareSums(1,5,-1,10));
        System.out.println(compareSums(-11,-5,1,-10));

        //ConcatExercise
        System.out.println(concat("First", "Second","Third"));
        System.out.println(concat("111", "bbb","aaa"));
        System.out.println(concat("444", "./.;;.;.,;","T444"));


        //CountExercise
        System.out.println(findDivCount((short)500, (short)30,-5));// n отрицательное
        System.out.println(findDivCount((short)600, (short)-20,0)); //n = 0
        System.out.println(findDivCount((short)32768, (short)20,5));// тип данных short лимит 32767 (!)

        //MethodExample
        System.out.println(increaser(454, 500));
        System.out.println(min(increaser(10, 5), 10));// а и b одинаковые числа
        System.out.println(min(increaser(0, 0), 0));

        //PracticeExample

        System.out.println(min(7, -5, 10));
        System.out.println(min(2, -1454634446, 0));
        System.out.println(min(4546, 0, 0));


        System.out.println(average(-5));
        System.out.println(average(0));
        System.out.println(average(2));

        System.out.println(average(2, 5));
        System.out.println(average(5, 2));
        System.out.println(average(0, 0));

        System.out.println(count(6, 100, 6));
        System.out.println(count(1, 99, -5));
        System.out.println(count(1, -100, 0));

        //StringExample



















    }

}
