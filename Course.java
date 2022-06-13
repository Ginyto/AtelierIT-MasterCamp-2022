import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Course {
    String name;
    private List<Cycliste> cyclistes;
    private int seqDossard=0;

    Course(){
        this.cyclistes = new ArrayList<Cycliste>();
    }
    
    
 
    void inscription(String name){
        Cycliste c = new Cycliste(name, this.seqDossard++);
        this.inscription(c);
    }

    private void inscription(Cycliste c) {
        this.cyclistes.add(c);
    }



    @Override
    public String toString(){
    String lst="";
    for (Cycliste c: cyclistes) {
        lst += "-" + c.toString() +"\n";
        }
    return lst;
    }

    void demarrerCycliste(int dossard){
        this.cyclistes.get(dossard).demarrerCourse();
        
    }

    void finCycliste(int dossard){
        this.cyclistes.get(dossard).arriveeCourse();
        
    }

    void abandonCycliste(int dossard){
        this.cyclistes.get(dossard).abandon();
    }

    void discalifierCycliste(int dossard){
        this.cyclistes.get(dossard).discalifie();
    }



    
    
    Scanner saisie = new Scanner(System.in);

    public Course(String name) {
        this.setNom(name);
    }

    public String getNom() {
        return this.name;
    }

    public void setNom(String name) {
        this.name = name;
    }

    
    
  List <Cycliste> classement(){

        List<Cycliste> resultat=new ArrayList<Cycliste>();
        List<Cycliste> cyclisteFini = new ArrayList<Cycliste>();
        List<Cycliste> cyclisteEncours = new ArrayList<Cycliste>();
        List<Cycliste> cyclisteAbnDisc = new ArrayList<Cycliste>();
        
        for (Cycliste c: cyclistes){

            int status = c.getStatus();
            if (status == Cycliste.FINI) cyclisteFini.add(c);
            if (status == Cycliste.ENCOURS) cyclisteEncours.add(c);
            if (status == Cycliste.DISCALIFIE||status == Cycliste.ABANDON) cyclisteAbnDisc.add(c);
        
        }
        cyclisteFini.sort((cycliste,t1)-> Long.compare(t1,cycliste.gettemps()));
        cyclisteEncours.sort((cycliste,t1)-> Long.compare(t1,cycliste.gettemps()));
        cyclisteAbnDisc.sort((cycliste,t1)-> Long.compare(t1,cycliste.gettemps()));

        for( Cycliste c : cyclisteFini){
            System.out.println(c);
        }

        resultat.addAll(cyclisteFini);
        resultat.addAll(cyclisteEncours);
        resultat.addAll(cyclisteAbnDisc);

        return resultat;

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

        return "cycliste -> " + Cycliste.get(index).name + " " + cyclistes.get(index).lastname + " " + cyclistes.get(index).dossard;
    }

    /*
     * Display all cyclistes
     */
    public void displayCyclistes() {

        for (int i = 0; i < cyclistes.size(); i++) {
            System.out.println(getCycliste(i));
        }
    }
    void afficherClassement(){
        List<Cycliste> resultat = classement();
        for ( Cycliste c:  cyclisteFini ){
            System.out.println(c);
        }
    }
    
    

}
