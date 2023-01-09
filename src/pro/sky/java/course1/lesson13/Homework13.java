package pro.sky.java.course1.lesson13;

public class Homework13 {
    public static void main(String[] args) {

        Author gerbertSchildt = new Author("Herbert", "Schildt");
        System.out.println(gerbertSchildt.getFirstName() + " " + gerbertSchildt.getLastName());

        Author joshuaBloch = new Author("Joshua", "Bloch");
        System.out.println(joshuaBloch.getFirstName() + " " + joshuaBloch.getLastName());

//Первый экземпляр Book
        Book javaComplete = new Book("Java: The Complete Reference", gerbertSchildt, 2018);

        System.out.println("Название книги- " + javaComplete.getTitle());
        System.out.println("Автор книги- " + gerbertSchildt.getFirstName() + " " + gerbertSchildt.getLastName());
        System.out.println("Год публикации- " + javaComplete.getYearOfPublication());

//Второй экземпляр Book

        Book effectiveJava = new Book("Effective Java", joshuaBloch, 2017);
        System.out.println("Название книги- " + effectiveJava.getTitle());
        System.out.println("Автор книги- " + joshuaBloch.getFirstName() + " " + joshuaBloch.getLastName());
        System.out.println("Год публикации- " + effectiveJava.getYearOfPublication());
        effectiveJava.setYearOfPublication(2018); //использовал сеттер для изменения года публикации
        System.out.println("Год публикации- " + effectiveJava.getYearOfPublication());

    }
}
