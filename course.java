import java.util.ArrayList;
import java.util.Scanner;


public class Course {

    String nom;

    ArrayList<Cycliste> cyclistes = new ArrayList<Cycliste>();

    Scanner saisie = new Scanner(System.in);

    public Course(String nom) {
        this.setNom(nom);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void inscription (){
        int dossard = 0;

        System.out.println("Please enter the name of the cyclist");

        String name = saisie.nextLine();

        System.out.println("Please enter the lastname of the cyclist");

        String lastname = saisie.nextLine();

        Cycliste cycliste = new Cycliste(name, lastname, dossard);

        dossard += 1;
    }

}