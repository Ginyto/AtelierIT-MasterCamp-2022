import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Course {

    String name;

    private List<Cyclist> cyclistes;

    private int seqDossard = 0;



    Course() {
        this.cyclistes = new ArrayList<Cyclist>();
    }
    

    void inscription(String name) {
        Cyclist c = new Cyclist(name, this.seqDossard++);
        this.inscription(c);
    }
    

    private void inscription(Cyclist c) {
        this.cyclistes.add(c);
    }


    @Override
    public String toString(){
    String lst="";
    for (Cyclist c: cyclistes) {
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

    
    
    List <Cyclist> classement(){

        List<Cyclist> resultat = new ArrayList<Cyclist>();
        List<Cyclist> cyclisteFini = new ArrayList<Cyclist>();
        List<Cyclist> cyclisteEncours = new ArrayList<Cyclist>();
        List<Cyclist> cyclisteAbnDisc = new ArrayList<Cyclist>();
        
        for (Cyclist c : cyclistes) {

            int status = c.getStatus();
            if (status == Cyclist.FINI)
                cyclisteFini.add(c);
            if (status == Cyclist.ENCOURS)
                cyclisteEncours.add(c);
            if (status == Cyclist.DISCALIFIE || status == Cyclist.ABANDON)
                cyclisteAbnDisc.add(c);

        }
        
        cyclisteFini.sort((cycliste,t1)-> Long.compare(t1.gettemps(),cycliste.gettemps()));
        cyclisteEncours.sort((cycliste,t1)-> Long.compare(t1.gettemps(),cycliste.gettemps()));
        cyclisteAbnDisc.sort((cycliste,t1)-> Long.compare(t1.gettemps(),cycliste.gettemps()));

        for( Cyclist c : cyclisteFini){
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

        Cyclist cycliste = new Cyclist(name, lastname, dossard);

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

        return "cycliste -> " + this.cyclistes.get(index).getName() + " " + this.cyclistes.get(index).getLastname() + " " + this.cyclistes.get(index).getDossard();
    }

    /*
     * Display all cyclistes
     */
    public void displayCyclistes() {

        for (int i = 0; i < cyclistes.size(); i++) {
            System.out.println(getCycliste(i));
        }
    }

    void afficherClassement() {

        List<Cyclist> resultat = classement();

        for (Cyclist c : resultat) {
            System.out.println(c);
        }
    }
    
    void compare2cyclist() {
        System.out.println("Please enter the dossard of the first cyclist");
        int dossard1 = saisie.nextInt();
        System.out.println("Please enter the dossard of the second cyclist");
        int dossard2 = saisie.nextInt();

        Cyclist cycliste1 = this.cyclistes.get(dossard1);
        Cyclist cycliste2 = this.cyclistes.get(dossard2);

        if (cycliste1.gettemps() > cycliste2.gettemps()) {
            System.out.println("The first cyclist is faster");
        } else if (cycliste1.gettemps() < cycliste2.gettemps()) {
            System.out.println("The second cyclist is faster");
        } else {
            System.out.println("The two cyclists are equal");
        }
    }


}
