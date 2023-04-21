package Homework_1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        int[] first_Array = getFilledArray(10);
        int[] second_Array = getFilledArray(9);

        int[] div_Array = div_Array(first_Array, second_Array);
    }

    public static int[] div_Array(int[] first_Array, int[] second_Array) {
        if(first_Array.length != second_Array.length) 
        throw new RuntimeException("Внимание! Длины массивов не равны!");
        int[] resultArr = new int[first_Array.length];
        for (int i = 0; i < resultArr.length; i++) {
            div_Array(null, null)[i] = first_Array[i] - second_Array[i];
        }
        return div_Array(null, null);
    }

    public static int[] getFilledArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(11);
        }
        return array;
    }
}