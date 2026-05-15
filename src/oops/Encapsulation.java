package oops;

/**********************************************
 Developer Name: Vikas
 Created on: 14-05-2026 17:24
 Project Name: java-learning ${
 /**********************************************/
class Employees {

    // Encapsulation: data members are hidden using private access modifier
    private int salary;
    private String name;
    private int employeeId;
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {

        // Only valid levels are allowed
        if (level.equals("L1") || level.equals("L2") || level.equals("L3")) {
            this.level = level;
        } else {
            System.out.println("Invalid Level");
        }
    }

    // Controlled access using getter method
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // Controlled modification using setter with validation
    public void setSalary(int salary) {
        if (!level.equals("L3")) {  // Encapsulation with role-based access control
            System.out.println("Access Denied to set Salary " + name);
            return;
        }

        if (salary < 0) {   // Validation to protect object data integrity
            System.out.println("Invalid Salary");
        } else if (salary < 10000) {
            System.out.println("Salary must be at least 10000 " + this.name);
        } else {
            this.salary = salary;
        }
    }

    // Business logic hidden inside methods
    public void increaseSalary(int percent) {
        if (!level.equals("L3")) {  // Encapsulation with role-based access control
            System.out.println("Access Denied to increase salary!!" + name);
            return;
        }

        if (salary > 10000) {
            salary = salary + (salary * percent / 100);
            System.out.println(name + " congratulations your salary is increased by " + percent + "%");
        } else {
            System.out.println("Not eligible for increment!!");
        }

    }

    // Data can only be accessed through public methods
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name + " Employee Id: " + employeeId + " Salary: " + salary + " Level: " + level);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        Employees emp1 = new Employees();

        //Employee 1
        emp1.setLevel("L2");
        emp1.setName("John");
        emp1.setSalary(9000);
        emp1.setEmployeeId(1000);

        emp1.increaseSalary(10);    //Salary increased by 10%
        emp1.displayEmployeeDetails();  //Employee details

        //Employee 2
        Employees emp2 = new Employees();
        emp2.setLevel("L3");
        emp2.setSalary(50000);
        emp2.setName("Tom");
        emp2.setEmployeeId(1001);

        emp2.increaseSalary(10);    //Salary increased by 10%
        emp2.displayEmployeeDetails();  //Employee details
        System.out.println("-------------------------------------------------------");

    }
}
