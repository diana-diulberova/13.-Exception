package Homework_1;

/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
 */

 public class Task_1 {
    public static void main(String[] args) {
        String[] Array = {"first string", null, "third string"};
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        division(10, 0);
        printValueByIndex(array,10);
        printStringArray(Array);

    }
    // деление на ноль
    public static void division(double firstNumber, double secondNumber){
        if(secondNumber ==  0) throw new ArithmeticException("На ноль делить нельзя! Предложите другой делитель.");
        double result = firstNumber/secondNumber;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNumber, secondNumber, result);
    }
    // выход индекса за границы массива
    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Указанный индекс находится за пределами массива");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    // Исключение нулевого указателя
    public static void printStringArray(String[] Array){
        for (String item: Array){
            if(item == null) throw new NullPointerException("Указанный элемент отсутствует!!!");
            System.out.println(item);
        }
    }
}