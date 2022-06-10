public class Course {

    String nom;

    Cycliste[] cyclistes;


    public Course(String nom){
        this.setNom(nom);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}