import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("\nHello there\nPlease enter the name of the race\nRace : ");

        Scanner saisie = new Scanner(System.in);

        Course course = new Course(saisie.nextLine());

        System.out.println("This is the name of the course");
        System.out.println(course.getNom());

        System.out.println("Now we will add some cyclistes\nHow many cyclistes do you want to add ?");

        course.inscriptions(saisie.nextInt());

        course.displayCyclistes();

    }
}