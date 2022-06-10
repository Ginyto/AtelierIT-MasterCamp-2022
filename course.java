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


    /**
     * Inscription of cyclistes in an arraylist
     */
    public void inscription(int dossard) {
        

        System.out.println("Please enter the name of the cyclist number " + dossard);

        String name = saisie.nextLine();

        System.out.println("Please enter the lastname of the cyclist" + dossard);

        String lastname = saisie.nextLine();

        Cycliste cycliste = new Cycliste(name, lastname, dossard);

        cyclistes.add(cycliste);

    }

    /*
     * Inscription of cyclistes in an arraylist
     */
    public void inscriptions(int howmany) {

        for (int i = 0; i < howmany; i++) {
            this.inscription(i+1);
        }
    }

    public String getCycliste(int index) {

        return "cycliste -> " + cyclistes.get(index).name + " " + cyclistes.get(index).lastname + " " + cyclistes.get(index).dossard;
    }

    /*
     * Display all cyclistes
     */
    public void displayCyclistes() {

        for (int i = 0; i < cyclistes.size(); i++) {
            System.out.println(getCycliste(i));
        }
    }

}