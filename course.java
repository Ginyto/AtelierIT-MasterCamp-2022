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
    void classement(){
        List<Cycliste> cyclisteFin = new arrrayList<Cycliste>()
        List<Cycliste> cyclisteEncours = new arrrayList<Cycliste>()
        List<Cycliste> cyclisteAbnDisc = new arrrayList<Cycliste>()
        for (Cycliste c: cycliste){
            int status=c.getstatus();
            if (status ==cycliste.FINI) cyclisteFini.add(c)
            if (status ==cycliste.ENCOURS) cyclisteEncours.add(c)
            if (status ==cycliste.DISCALIFIE||status ==cycliste.ABANDON) cyclisteAbnDisc.add(c)
            
               
            }

        }
        
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