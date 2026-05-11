package oops;

/**********************************************
 Developer Name: Vikas
 Created on: 11-05-2026 19:34
 Project Name: java-learning ${
 /**********************************************/

class Student_ConstructorChaining {
    String name;
    int id;
    int age;
    int roll;

    //Constructor 1
    public Student_ConstructorChaining(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //constructor 2
    public Student_ConstructorChaining(String name, int id, int age) {
//        this.name = name;
//        this.id = id;
        this(name, id);
        this.age = age;
    }

    //constructor 3
    public Student_ConstructorChaining(String name, int id, int age, int roll) {
//        this.name = name;
//        this.id = id;
//        this.age = age;
        this(name, id, age);
        this.roll = roll;
    }

    void print(){
        System.out.println(this.name + " "+ this.id + " " + this.age + " " + this.roll);
    }
}

public class ConstructorChaining {
    public static void main(String[] args){
        Student_ConstructorChaining s1 = new Student_ConstructorChaining("vikas", 101, 21, 3692);
        s1.print();

    }
}


//why not constructor Overloading because :-

/*          Constructor Overloading               |        Constructor Chaining
          --------------------------------------- | -------------------------------------
          Multiple constructors                   | Constructor calls another constructor
          Different parameter lists               | Uses `this()`
          Provides multiple ways to create object | Reuses constructor code
          Focus = flexibility                     | Focus = code reuse                    */
