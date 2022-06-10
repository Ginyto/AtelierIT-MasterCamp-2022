import java.util.Date;

public class Cycliste{
   

    private String name;
    private String lastname;
    private int dossard;
    private int datedebut;
    private int datefin ; 

    static final int PASENCOREDEMARRE=0;
    static final int ENCOURS=1;
    static final int FINI=2;
    static final int DISCALIFIE=3;
    static final int ABANDON=4;


    /**
     * Constructor
     * @param name
     * @param lastname
     * @param dossard
     */
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

    boolean start(){
        if (this.datedebut==null){
            return false
        }
        return true
    }

    boolean finish(){
        if (this.datefin==null){
            return false
        }
        return true
    }

    
    long gettemps(){
        if (start() == true && finish() == true){
            return (datefin-datedebut);
        }

        return -1;       
    }
    void arriver(){
        if(start()==true && finish()== false){
            this.datefin= new Date()
        }

        
    }

    void debutcourse(){
        if(start()== false && finish()== false){
            this.datedebut= new java.util.Date().getTime()
        }


    }
    void abandon(){
        setstatus()
        this.datefin= new Date();

    }
    
    
}

