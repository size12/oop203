import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Main {

    public static List<Integer> getEvenNumbersPro(List<Integer> list) {
        return list.stream().filter(value -> value % 2 == 0).toList();
    }

    public static List<String> namesToUpper(List<String> names) {
        return names.stream().map(name -> name.toUpperCase()).toList();
    }

    public static long namesStartsWith(char letter, List<String> names) {
        return names.stream().filter(Predicate.not(String::isEmpty)).filter(name -> name.charAt(0) == letter).count();
    }

    public static void main(String[] args) throws Exception {

        //Блок 1.

        System.out.println("Блок 1\nЗадание 1.");
        int[] numbers = new Random().ints(10, 0, 100).toArray();
        Arrays.stream(numbers).forEach(a -> System.out.print(a + " "));

        System.out.println();

        long evenCount = Arrays.stream(numbers).filter(value -> value % 2 == 0).count();
        System.out.println(evenCount);

        System.out.println("Блок 1\nЗадание 2.");
        String[] employees = new String[] {"Jackson", "Smith", "Jayne", "Ivanov"};

        Arrays.stream(employees).filter(name -> name.length() > 0 && name.charAt(0) == 'J').forEach(a -> System.out.print(a + " "));
        System.out.println();

        System.out.println("Блок 1\nЗадание 3.");
        employees = new String[] {"Jackson", "Smith", "Jayne", "Ivanov"};
        Arrays.stream(employees).sorted().forEach(a -> System.out.print(a + " "));


        //Блок 2.
        System.out.println("Блок 2\nЗадание 1.");
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list);
        System.out.println(getEvenNumbersPro(list));

        System.out.println("Блок 2\nЗадание 2.");
        List<String> names = List.of("Egor", "Max", "Ivan", "Peter", "Patric", "");
        System.out.println(names);
        System.out.println(namesToUpper(names));
        System.out.println(namesStartsWith('P', names));

    }
}
