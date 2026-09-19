package College.Model;

import College.Util.TextsUtils;

public class Student extends Person {

    private String name;
    private int mark;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = TextsUtils.normalizeName(name);
    }

    @Override
    public void describeRole() {
        System.out.println(name + " is a student.");
    }

    public void submitAssignment() {
        System.out.println(name + " submitted assignment.");
    }

    public void setMark(int mark) throws InvalidStudentDataException {

        if (mark < 0 || mark > 100) {
            throw new InvalidStudentDataException(
                "Mark must be between 0 and 100."
            );
        }

        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', mark=" + mark + "}";
    }
}