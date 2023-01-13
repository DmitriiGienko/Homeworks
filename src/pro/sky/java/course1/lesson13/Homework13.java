package pro.sky.java.course1.lesson13;

public class Homework13 {
    public static void main(String[] args) {

        Author gerbertSchildt = new Author("Herbert", "Schildt");
        Author joshuaBloch = new Author("Joshua", "Bloch");

//Первый экземпляр Book
        Book javaComplete = new Book("Java: The Complete Reference", gerbertSchildt, 2018);

//Второй экземпляр Book
        Book effectiveJava = new Book("Effective Java", joshuaBloch, 2017);

//использовал сеттер для изменения года публикации
        effectiveJava.setYearOfPublication(2018);


        System.out.println(javaComplete.toString());
        System.out.println(effectiveJava.toString() + "\n");

        System.out.println("Книги одинаковые? - " + (javaComplete.equals(effectiveJava) ? "Да" : "Нет") + "\n");
        System.out.println("hashCode книги 'Java: The Complete Reference' = " + javaComplete.hashCode());
        System.out.println("hashCode книги 'Effective Java' = " + effectiveJava.hashCode() + "\n");

        System.out.println("Авторы книг разные? - " + (gerbertSchildt.equals(joshuaBloch) ? "Нет" : "Да") + "\n");
        System.out.println("hashCode автора книги 'Java: The Complete Reference' = " + gerbertSchildt.hashCode());
        System.out.println("hashCode автора книги 'Effective Java' = " + joshuaBloch.hashCode());

    }
}
