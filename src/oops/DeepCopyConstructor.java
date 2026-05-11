package oops;

/**********************************************
 Developer Name: Vikas
 Created on: 11-05-2026 15:28
 Project Name: java-learning ${
 /**********************************************/
class StudentDeepCopy {

    int roll;
    int age;
    String name;
    String gender;

    StudentDeepCopy(int roll, int age, String name, String gender) {
        this.roll = roll;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    //Deep copy Constructor
    StudentDeepCopy(StudentDeepCopy s) {
        this.roll = s.roll;
        this.age = s.age;
        this.name = new String(s.name);
        this.gender = new String(s.gender);
    }
}

public class DeepCopyConstructor {

    public static void main(String[] args) {

        StudentDeepCopy s1 = new StudentDeepCopy(101, 21, "Anshuman", "Male");
        StudentDeepCopy s2 = new StudentDeepCopy(s1);

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println("After making changes in s1");
        s1.name = "Vikas";
        System.out.println(s1.name);
        System.out.println(s2.name);

        //Checking reference Variable addresses
        System.out.println("reference Variable addresses: " + (s1 == s2));

    }
}
