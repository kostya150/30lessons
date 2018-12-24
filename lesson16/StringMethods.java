package lesson16;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {


        String test = "someStringExample";

        System.out.println(test.isEmpty());// пустой стринг или нет выводит тру или фолс

        System.out.println("".isEmpty());

        System.out.println(test.length());// длина

        System.out.println(test.charAt(2));// выводит символ стринга под опредённым индексом

        String res = test.replace("me", "T");
        System.out.println(res);//замена е на т

        System.out.println(test.replaceAll("me", "T"));// более обширный, можно использовать regexp
        System.out.println(test);
        System.out.println(test.contains("mes"));//содержит ли стринг символ

        System.out.println(test);
        String phrase = "Hello there guys";
        System.out.println(Arrays.toString(phrase.split( " " )));//возвращает массив стрингов делит на подстринги и удаляет символ.

        System.out.println(" test a".trim());//удаляет пробелы вначале или в конце стринга

        System.out.println(phrase.substring(5));// возвращает подстринг с начала опредеоенной позиции
        System.out.println(phrase.substring(5, 10).trim());// с 5 включительно по 8 не включительно

        System.out.println(test.toUpperCase());//все буквы большие
        System.out.println(test.toLowerCase());// все буквы маленькие







    }
}
