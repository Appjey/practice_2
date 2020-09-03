package example_1;

import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author d1 = new Author("Mike", "Mike@mail.ru", 'f');
        Author d2 = new Author("Helen", "Helen@yandex.ru", 'm');
        Author d3 = new Author("Bob","Bob@rambler.ru");
        System.out.println(d1);
        d1.out();
        d2.out();
        d3.out();
        System.out.println();
    }
}