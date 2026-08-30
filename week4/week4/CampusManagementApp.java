abstract class Person {

    private String name;
    private String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return name;
    }

    String getId() {
        return id;
    }

    abstract String getRole();

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

class Student extends Person {

    private int[] marks;

    Student(String name, String id, int[] marks) {
        super(name, id);
        this.marks = marks;
    }

    @Override
    String getRole() {
        return "Student";
    }

    double getAverage() {
        if (marks.length == 0) {
            return 0;
        }

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return (double) total / marks.length;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Role: " + getRole()
                + ", Average: " + getAverage();
    }
}

class Instructor extends Person {

    private String subject;

    Instructor(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    String getRole() {
        return "Instructor";
    }

    String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Role: " + getRole()
                + ", Subject: " + getSubject();
    }
}

class CampusRegistry {

    private Person[] people;
    private int size;

    CampusRegistry(int capacity) {
        people = new Person[capacity];
        size = 0;
    }

    void addPerson(Person person) {
        if (size < people.length) {
            people[size] = person;
            size++;
        } else {
            System.out.println("Registry is full.");
        }
    }

    void displayAll() {
        System.out.println("\nCampus Registry");

        for (int i = 0; i < size; i++) {
            System.out.println(people[i]);
        }
    }

    Person searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return people[i];
            }
        }

        return null;
    }

    int countStudents() {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Student) {
                count++;
            }
        }

        return count;
    }

    double calculateStudentAverage() {
        double total = 0;
        int studentCount = 0;

        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Student) {
                Student student = (Student) people[i];

                total += student.getAverage();
                studentCount++;
            }
        }

        if (studentCount == 0) {
            return 0;
        }

        return total / studentCount;
    }

    void showStudentDetails() {
        System.out.println("\n--- Student Details ---");

        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Student) {
                Student student = (Student) people[i];

                System.out.println(
                        student.getName()
                        + " Average: "
                        + student.getAverage()
                );
            }
        }
    }
}

public class CampusManagementApp {

    public static void main(String[] args) {

        CampusRegistry registry = new CampusRegistry(5);

        Student student1 = new Student(
                "Hardik",
                "S101",
                new int[]{80, 90, 85}
        );

        Student student2 = new Student(
                "Rahul",
                "S102",
                new int[]{70, 75, 80}
        );

        Instructor instructor1 = new Instructor(
                "Mr. Sharma",
                "I101",
                "Java"
        );

        Instructor instructor2 = new Instructor(
                "Ms. Neha",
                "I102",
                "Database"
        );

        registry.addPerson(student1);
        registry.addPerson(student2);
        registry.addPerson(instructor1);
        registry.addPerson(instructor2);

        registry.displayAll();

        System.out.println("\n--- Search Result ---");

        Person found = registry.searchByName("Hardik");

        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Person not found.");
        }

        System.out.println("\nNumber of Students: "
                + registry.countStudents());

        System.out.println("Average of All Students: "
                + registry.calculateStudentAverage());

        registry.showStudentDetails();
    }
}
```
