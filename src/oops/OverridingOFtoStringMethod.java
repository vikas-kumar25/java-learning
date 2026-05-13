package oops;

/**********************************************
 Developer Name: Vikas
 Created on: 14-05-2026 05:10
 Project Name: java-learning ${
 /**********************************************/

class InheritanceOverriding {
    int rollno;
    String name;
    int age;

    public InheritanceOverriding(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override public String toString() {
        return "Rollno: " + rollno + " Name: " + name + " Age: " + age;
    }
}
public class OverridingOFtoStringMethod {
    public static void main(String[] args) {
        InheritanceOverriding i1 = new InheritanceOverriding(101, "ABC", 13);
        InheritanceOverriding i2 = new InheritanceOverriding(102, "DEF", 13);

        System.out.println(i1);     //internally calls toString() method when System.out.println() runs and override.
        System.out.println(i2);     //internally calls toString() method when System.out.println() runs and override.
    }
}
