public class Cycliste{
    
    String name;
    String lastname;
    int dossard;
    int datedebut= 0;
    int datefin;   



    public Cycliste(String name, String lastname, int dossard) {
        this.name = name;
        this.lastname = lastname;
        this.dossard = dossard;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDossard() {
        return this.dossard;
    }

    public void setDossard(int dossard) {
        this.dossard= dossard;
    }

    

    public int getDatefin() {
        return this.datefin;
    }

    public void setDatefin(int datefin) {
        this.datefin = datefin;
    }

    void abandonner(){
        this.datefin= 0;
    }
    
    int gettemps(){
        return datefin-datedebut;        
    }
}

