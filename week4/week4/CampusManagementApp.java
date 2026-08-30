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
System.out.println("ROLE IS = "+ getRole()) ;
 System.out.println("Subject  IS = "+ getSubject()) ;               
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

        System.out.println("\n--- Campus Registry ---");

        for (int i = 0; i < size; i++) {

            System.out.println(people[i]);

            System.out.println("Role: " + people[i].getRole());
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


    // Operation 2: Count people by runtime type
    int countStudents() {

        int count = 0;

        for (int i = 0; i < size; i++) {

            if (people[i] instanceof Student) {
                count++;
            }
        }

        return count;
    }


    // Student summary using int[] data
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


    // Safe instanceof + downcast
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

        CampusRegistry registry = new CampusRegistry(10);


        Student s1 = new Student(
                "Aman",
                "S101",
                new int[]{80, 75, 90}
        );

        Student s2 = new Student(
                "Riya",
                "S102",
                new int[]{88, 92, 84}
        );

        Student s3 = new Student(
                "Karan",
                "S103",
                new int[]{70, 65, 75}
        );

        Instructor i1 = new Instructor(
                "Dr Sharma",
                "I101",
                "Java"
        );

        Instructor i2 = new Instructor(
                "Dr Singh",
                "I102",
                "Database"
        );


        
        registry.addPerson(s1);
        registry.addPerson(s2);
        registry.addPerson(s3);
        registry.addPerson(i1);
        registry.addPerson(i2);


        registry.displayAll();


        
        System.out.println("\n--- Search Result ---");

        Person found = registry.searchByName("Riya");

        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Person not found.");
        }


      
        System.out.println(
                "\nNumber of students: "
                + registry.countStudents()
        );


        
        System.out.println(
                "Overall Student Average: "
                + registry.calculateStudentAverage()
        );


        registry.showStudentDetails();
    }
}
