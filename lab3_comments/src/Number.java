import java.io.IOException;
/**
 * <b> Сложение двух чисел </b>
 * Класс Number реализует приложение, которое
 * складывает два заданных целых числа и выводит
 * результат на экран.
 *
 * <b>Примечание</b> Здесь может быть ваше примечание.
 *
 * @author Bantorin Alexey
 * @version 1.0
 * @since 2023-10-09
 * */
public class Number {


    /**
     * Метод используется для сложения двух целых чисел. Это
     * простейшая форма метода класса, просто чтобы
     * показать использование различных тегов javadoc.
     * @param numberFirst - первый параметр метода sum
     * @param numberSecond - второй параметр метода sum
     * @return int - тип возвроащаемого значения суммы numberFirst и numberSecond.
     * */


    public int sum(int numberFirst, int numberSecond)
    {return numberFirst+numberSecond;}

    /**
     * Это основной метод, использующий метод sum.
     * @param args Не используется.
     * @exception IOException При ошибке ввода.
     * @see IOException
     */

    public static void main(String args[]) throws IOException{
        Number number= new Number();
        int sum=number.sum(30, 40);
        System.out.println("Суммой 30 и 40 является :"+sum);

    }



}
