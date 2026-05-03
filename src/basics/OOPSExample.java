package basics;

/**********************************************
 Developer Name: Vikas
 Created on: 03-05-2026 20:11
 Project Name: java-learning ${
 /**********************************************/

//Class
class Car {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

//Main Class
public class OOPSExample {
    public static void main(String[] args) {

        // Object creation
        Car c1 = new Car();

        c1.brand = "BMW";
        c1.speed = 200;

        c1.display();
    }
}
