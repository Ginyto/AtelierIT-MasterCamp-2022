import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Hello there\nPlease enter the name of the race\nRace : ");

        Scanner saisie = new Scanner(System.in);

        Course course = new Course(saisie.nextLine());

        Cycliste c1 = new Cycliste("Jean", "Leroux", 55, 3000);

        System.out.println("This is the name of the course");
        System.out.print(course.getNom());

    }
}