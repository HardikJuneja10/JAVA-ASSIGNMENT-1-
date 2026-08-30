interface Payable {

    double calculatePayment();
}


abstract class Employee implements Payable {

    private String employeeId;
    private String name;

    Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    String getEmployeeId() {
        return employeeId;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId
                + ", Name: " + name;
    }
}


class SalariedEmployee extends Employee {

    private double monthlySalary;

    SalariedEmployee(String employeeId, String name,
                     double monthlySalary) {

        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePayment() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Type: Salaried Employee"
                + ", Payment: " + calculatePayment();
    }
}


class HourlyEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    HourlyEmployee(String employeeId, String name,
                   double hourlyRate, int hoursWorked) {

        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Type: Hourly Employee"
                + ", Payment: " + calculatePayment();
    }
}


class Invoice implements Payable {

    private String invoiceId;
    private double amount;

    Invoice(String invoiceId, double amount) {

        this.invoiceId = invoiceId;
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice ID: " + invoiceId
                + ", Payment: " + calculatePayment();
    }
}


class PayrollProcessor {

    private Payable[] payments;
    private int size;

    PayrollProcessor(int capacity) {

        payments = new Payable[capacity];
        size = 0;
    }


    void addPayable(Payable payable) {

        if (size < payments.length) {

            payments[size] = payable;
            size++;

        } else {

            System.out.println("Payroll is full.");
        }
    }


    double calculateTotalPayment() {

        double total = 0;

        for (int i = 0; i < size; i++) {

            total = total + payments[i].calculatePayment();
        }

        return total;
    }


    Payable findLargestPayment() {

        if (size == 0) {
            return null;
        }

        Payable largest = payments[0];

        for (int i = 1; i < size; i++) {

            if (payments[i].calculatePayment()
                    > largest.calculatePayment()) {

                largest = payments[i];
            }
        }

        return largest;
    }


    void countPaymentTypes() {

        int employeeCount = 0;
        int nonEmployeeCount = 0;

        for (int i = 0; i < size; i++) {

            if (payments[i] instanceof Employee) {

                employeeCount++;

            } else {

                nonEmployeeCount++;
            }
        }

        System.out.println(
                "Employee payments: " + employeeCount
        );

        System.out.println(
                "Non-Employee payments: " + nonEmployeeCount
        );
    }


    void displayAllPayments() {

        for (int i = 0; i < size; i++) {

            System.out.println(payments[i]);
        }
    }
}