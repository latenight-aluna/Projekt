import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

        System.out.println(cars);
        System.out.println("Enter your favorit car");
        int n = input.nextInt();

        System.out.println("You choose " + cars.get(n));
        //We can see here the index is the number we choose
    }
}

