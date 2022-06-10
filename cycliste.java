public class Cycliste{
    
    String name;
    String lastname;
    int dossart;
    int datedebut= 0;
    int datefin;   



    public Cycliste(String name, String lastname, int dossart, int datedebut, int datefin) {
        this.name = name;
        this.lastname = lastname;
        this.dossart = dossart;
        this.datedebut = datedebut;
        this.datefin = datefin;
    }
    
    public Cycliste(){
        
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

    public int getDossart() {
        return this.dossart;
    }

    public void setDossart(int dossart) {
        this.dossart = dossart;
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

