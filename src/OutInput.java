import java.util.Scanner;


public class OutInput {

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter First Initial");
        String firstInitial = keyboard.next();

        System.out.println("Enter Last Name");
        String lastName = keyboard.next();

        System.out.println("Enter House Number");
        int houseNumber = keyboard.nextInt();

        System.out.println("Enter Street Name");
        String streetName = keyboard.next();

        System.out.println("Enter Street Type");
        String streetType = keyboard.next();

        System.out.println("Enter City");
        String city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);


    }

}


