public class Cycliste{
    
    private String name;
    private String lastname;
    private int dossard;
    private Date datedebut;
    private Date datefin;   



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

    

    void abandonner(){
        this.datefin= 0;
    }
    
    int gettemps(){
        if (start()==True && finish== True){
            return datefin-datedebut; 
        }
        return -1;       
    }
    void arriver(){
        if(start()==True && finish()== False){
            this.datefin= new Date()
        }

        
    }

    void debutcourse(){
        if(start()==False && finish()== False){
            this.datedebut= new Date()
        }


    }
}

