package College.Model;

public class Instructor extends Person {

    @Override
    public void describeRole() {
        System.out.println("I am an instructor.");
    }

    public void conductClass() {
        System.out.println("Instructor is conducting class.");
    }
}