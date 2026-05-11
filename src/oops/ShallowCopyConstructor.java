package oops;

/**********************************************
 Developer Name: Vikas
 Created on: 11-05-2026 15:04
 Project Name: java-learning ${
 /**********************************************/

public class ShallowCopyConstructor {

    int roll;
    int age;
    String name;
    String gender;



    // Normal Constructor
    public ShallowCopyConstructor(int roll, int age, String name, String gender) {

        this.roll = roll;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public static void main(String[] args) {

        ShallowCopyConstructor s1 = new ShallowCopyConstructor(101, 21, "Anshuman", "Male");

        // shallow copy : two reference variables point to same object
        ShallowCopyConstructor s2 = s1;

        System.out.println(s1 == s2);
    }
}
