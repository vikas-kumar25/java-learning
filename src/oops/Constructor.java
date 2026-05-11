package oops;

/**********************************************
 Developer Name: Vikas
 Created on: 11-05-2026 11:28
 Project Name: java-learning ${
 /**********************************************/
//Constructor containing variable of all types of scopes!!

// First Class
class Student {

    // public variable
    public String name;

    // private variable
    private int age;

    // protected variable
    protected String course;

    // final variable
    final int rollNo;

    // Constructor
    public Student(String name, int age, String course, int rollNo) {

        this.name = name;
        this.age = age;
        this.course = course;
        this.rollNo = rollNo;
    }

    // Method to access private variable
    public void showAge() {
        System.out.println("Age : " + age);
    }
}


// Second Class
public class Constructor {

    public static void main(String[] args) {

        Student s1 = new Student(
                "Anshuman",
                21,
                "Java Backend",
                101
        );


        // PUBLIC variable
        System.out.println("Name : " + s1.name);


        // PRIVATE variable
        // System.out.println(s1.age); // ERROR

        s1.showAge();


        // PROTECTED variable
        System.out.println("Course : " + s1.course);


        // FINAL variable
        System.out.println("Roll No : " + s1.rollNo);


        // FINAL cannot be changed
        // s1.rollNo = 200; // ERROR
    }
}

