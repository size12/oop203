import java.lang.String;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

public class Reader {
    String name;
    String secondName;
    String surname;

    int ticketNumber;
    String faculty;
    Date birthday;
    int phoneNumber;

    public Reader(String name, String secondName, String surname){
        this.name=name;
        this.secondName = secondName;
        this.surname=surname;
    }

    public void takeBook() {}

    public void returnBook() {}

    public void takeBook(int value) {
        System.out.println(name + " " + secondName + " " + surname + " взял " + value + " книг(и/у)");
        System.out.println(" ");
    }

    public void takeBook(String... bookNames) {
        System.out.println(name + " " + secondName + " " + surname + " взял книги: ");
        System.out.println(Arrays.stream(bookNames).collect(Collectors.joining(", ")));
    }

    public void takeBook(Book... books) {
        System.out.println(name + " " + secondName + " " + surname + " взял книги: ");
        System.out.println(Arrays.stream(books).map(Book::toString).collect(Collectors.joining(", ")));
    }

    public void returnBook(int value) {
        System.out.println(name + " " + secondName + " " + surname + " вернул " + value + "книг(и/у)");
    }

    public void returnBook(String... bookNames) {
        System.out.println(name + " " + secondName + " " + surname + " вернул книги:");
        System.out.println(Arrays.stream(bookNames).collect(Collectors.joining(", ")));
    }

    public void returnBook(Book... books) {
        System.out.println(name + " " + secondName + " " + surname + " вернул книги:");
        System.out.println(Arrays.stream(books).map(Book::toString).collect(Collectors.joining(", ")));
    }

    public static void main(String[] args) {
        Reader[] readers=new Reader[5];

        readers[0]=new Reader("Василий","Иванов","Иванович");
        readers[1]=new Reader("Елена","Елизарова","Анатольевна");
        readers[2]=new Reader("Илья","Волков","Дмитриевич");
        readers[3]=new Reader("Женя","Иванова","Сергеевна");
        readers[4]=new Reader("Петр","Кочугаев","Николаевич") ;

        Book booking=new Book("Легенда о Золотом драконе","А.С. Пушкин");
        Book booking1=new Book("Легенды","В.С. Тютчев");
        Book booking2=new Book("Реверс-Инжиниринг","Клод Моне");

        readers[0].returnBook(booking);
        readers[1].returnBook(2);
        readers[2].takeBook(5);
        readers[3].takeBook("Наноэлектроника");
        readers[4].takeBook(booking,booking1,booking2);
    }

}
