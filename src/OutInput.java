import java.util.Scanner;


public class OutInput {

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter First Initial");
        String firstInitial = keyboard.next();

        System.out.println("Please Enter Last Name");
        String lastName = keyboard.next();

        System.out.println("Please Enter House Number");
        int houseNumber = keyboard.nextInt();

        System.out.println("Please Enter Street Name");
        String streetName = keyboard.next();

        System.out.println("Please Enter Street Type");
        String streetType = keyboard.next();

        System.out.println("Please Enter City");
        String city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);


    }

}


