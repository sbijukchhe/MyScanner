import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args){

        String firstInitial, lastName, houseNumber, streetName, streetType, city;

        System.out.println("Please enter a statement");
        Scanner input = new Scanner(System.in);

        firstInitial = input.next();
        lastName = input.next();
        houseNumber = input.next();
        streetName = input.next();
        streetType = input.next();
        city = input.next();


        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
