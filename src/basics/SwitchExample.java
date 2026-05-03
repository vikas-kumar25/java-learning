package basics;

/**********************************************
 Developer Name: Vikas
 Created on: 03-05-2026 20:03
 Project Name: java-learning ${
 /**********************************************/
public class SwitchExample {
    public static void main(String[] args) {

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
