package pro.sky.java.course1.lesson13;

public class Author {
    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        String fullName = (this.firstName + " " + this.lastName);
        return fullName;
    }

}
