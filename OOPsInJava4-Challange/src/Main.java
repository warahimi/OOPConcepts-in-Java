import com.cougar.oopchallange.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a patient
        Patient patient = new Patient("Brad", 28,
                new Eye("Left Eye", "Short Sighted", "blue", true),
                new Eye("Right Eye", "Normal","Black",false),
                new Heart("Heart", "Normal",66),
                new Stomach("Stomach", "PUD", false),
                new Skin("Skin", "Burned","White", 14));

        // Application logic
        System.out.println("Name: "+ patient.getNanme());
        System.out.println("Age: "+ patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shallFinish = false;

        while (! shallFinish)
        {
            System.out.println("Choose an organ:"+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3 Heart" +
                    "\n\t4. Stomch" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpened())
                    {
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1)
                        {
                            patient.getLeftEye().close();
                        }
                        else
                        {
                            continue;
                        }
                    }
                    else
                    {
                        System.out.println("\t\t1. Open Eye");
                        if(scanner.nextInt() == 1)
                            patient.getLeftEye().open();
                        else
                            continue;
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpened())
                    {
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1)
                        {
                            patient.getRightEye().close();
                        }
                        else
                        {
                            continue;
                        }
                    }
                    else
                    {
                        System.out.println("\t\t1. Open Eye");
                        if(scanner.nextInt() == 1)
                            patient.getRightEye().open();
                        else
                            continue;
                    }
                    break;

                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if(scanner.nextInt() ==  1)
                    {
                        System.out.println("Enter a new Heart rate");
                        patient.getHeart().setRate(scanner.nextInt());
                        System.out.println("Heart rate changed to: "+ patient.getHeart().getRate());
                    }
                    else
                    {
                        continue;
                    }
                    break;

                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt() == 1)
                    {
                        patient.getStomach().digest();
                    }
                    else
                        continue;
                    break;
                case  5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shallFinish = true;
            }
        }

    }
}