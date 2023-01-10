package pro.sky.java.course1.lesson13;

public class Homework13 {
    public static void main(String[] args) {

        Author gerbertSchildt = new Author("Herbert", "Schildt");

        Author joshuaBloch = new Author("Joshua", "Bloch");

//Первый экземпляр Book
        Book javaComplete = new Book("Java: The Complete Reference", gerbertSchildt, 2018);

        System.out.println("Название книги- " + javaComplete.getTitle());
        System.out.println("Автор книги- " + javaComplete.getAuthor().getFullName());
        System.out.println("Год публикации- " + javaComplete.getYearOfPublication());

//Второй экземпляр Book

        Book effectiveJava = new Book("Effective Java", joshuaBloch, 2017);

        System.out.println("Название  книги- " + effectiveJava.getTitle());
        System.out.println("Автор книги- " + effectiveJava.getAuthor().getFullName());
        System.out.println("Год публикации- " + effectiveJava.getYearOfPublication());

//использовал сеттер для изменения года публикации
        effectiveJava.setYearOfPublication(2018);

        System.out.println("Год публикации- " + effectiveJava.getYearOfPublication());


    }
}
