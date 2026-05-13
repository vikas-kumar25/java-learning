package oops;

/**********************************************
 Developer Name: Vikas
 Created on: 13-05-2026 02:57
 Project Name: java-learning ${
 /**********************************************/

class Person {
    String name;
    int age;

     Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void print(){
        System.out.println("I am a Person!");
    }
}

class Employee extends Person {
    int empId;

    Employee(String name, int age, int empId) {
        super(name, age);
        this.empId = empId;
    }

    @Override void print(){
        System.out.println("name: " + name + " Age: " + age + " EmpId: "+ empId);
    }

}

class Doctor extends Person {
    String degree;

    public Doctor(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    @Override void print(){
        System.out.println("name: " + name + " Age: " + age  + " Degree: "+ degree);
    }
}

public class InheritanceOverriding1 {
    public static void main(String[] args) {
        Person[] people = {
                new Employee("A", 21, 100),
                new Doctor("C", 40, "MbbS"),
                new Employee("B", 25, 101),
                new Doctor("D", 45, "MD")
        };

        for (Person p : people) {
            p.print();
        }

        //-------- WITHOUT Array + WITHOUT Upcasting ---------------
//        Doctor d1 = new Doctor("C", 40, "MbbS");
//        Employee e1 = new Employee("A", 21, 100);
//
//        Employee e2 = new Employee("B", 25, 101);
//        Doctor d2 = new Doctor("D", 45, "MD");
//
//        e1.print();
//        d1.print();
//
//        e2.print();
//        d2.print();

        //------- WITH Array + WITHOUT Upcasting ----------
//        Employee[] employees = {
//                new Employee("A", 21, 100),
//                new Employee("B", 25, 101)
//        };
//
//        Doctor[] doctors = {
//                new Doctor("C", 40, "MbbS"),
//                new Doctor("D", 45, "MD")
//        };
//
//        for(Employee e : employees) {
//            e.print();
//        }
//
//        for(Doctor d : doctors) {
//            d.print();
//        }

    }
}
