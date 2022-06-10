import java.util.ArrayList;


public class Course {

    String nom;

    ArrayList<Cycliste> cyclistes = new ArrayList<Cycliste>();

    public Course(String nom) {
        this.setNom(nom);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}