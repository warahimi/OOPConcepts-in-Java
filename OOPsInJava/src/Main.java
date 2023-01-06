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
        System.out.println("the random number is: "+ num);

        String[] name = {"Wahid"};
        String str1 = "Wahid";
        String str2 = "Wahid";
        String str3 = new String("Wahid");
        if(str1 ==  str2)
        {
            System.out.println("str1 and stt2 are equal");
        }
        if(str1 ==  name[0])
        {
            System.out.println("str1 and name[0] are equal");
        }
        if(str1 ==  str3)
        {
            System.out.println("str1 and str3 are equal");
        }
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//        System.out.println(name[0].hashCode());
//        System.out.println(str3.hashCode());

        String input = scanner.next();
        if(str1 == input) // when we use == to check 2 string we check the equality of the reference they hold, objects reference inside the RAM
        {
            System.out.println("str1 is equal to input");
        }
        //System.out.println(input.hashCode());

        System.out.println();
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(name[0]));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(input));

        //Therefore, it is not a good idea to compare 2 strings using the ==
        // instead we can use the equals method

        if(str1.equals(input) && str1.equals(str2))
        {
            System.out.println("They are equal");
        }


    }

}