import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        System.out.print("Please Enter Your Name: ");
        String name = scanner.next();
        System.out.printf("Please Enter Your Age: ");
        int age = scanner.nextInt();

        System.out.printf("Hello "+ name + " You are "+ age + " Years Old.");*/


        // Generate Rando number in Java

        Random random = new Random();

        int num = random.nextInt(20); // 0 - 19
        System.out.printf("the random number is: "+ num);
    }

}