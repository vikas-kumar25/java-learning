package oops;

/**********************************************
 Developer Name: Vikas
 Created on: 12-05-2026 17:57
 Project Name: java-learning ${
 /**********************************************/
class Parent{
    int a;
    int count;
    int b;
     Parent() {
         System.out.println("Inside parent");
         this.count = 0;
         this.b = 5;
    }
    void run(){
        System.out.println("Parent run");
    }
}
class Child extends Parent{
    int count;
    int b;

     Child() {
         System.out.println("Inside Child");
         this.a = 10;
         this.count = 5;    //count of child
         super.b = 20;
         super.count = 500; //count of parent
    }
    void printParentCount(){
        System.out.println("Parent count value:" + super.count);
    }

}

public class Inheritance1 {
    public static void main(String[] args){
        Child c = new Child();
        System.out.println(c.a +", " + c.count + ", " + c.b);
        c.run(); //parent run will execute at runtime
        c.printParentCount();

    }
}
