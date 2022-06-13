import java.util.Date;


public class Cycliste {
   
    private String name;
    private String lastname;
    private int dossard;
    private Date datedebut;
    private Date datefin ; 
    private int status;

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


    public Cycliste(String name, int dossard) {
        this.name = name;
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
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    


    
    long gettemps(){
        if (getStatus() == Cycliste.FINI){
            return (this.datefin.getTime() - this.datefin.getTime())/1000;
        }

        return -1;       
    }
    void arriver(){
        if(demarrerCourse()==true && arriveeCourse()== false){
            this.datefin= new Date();
        }

        
    }

    void debutcourse(){
        if(demarrerCourse()== false && arriveeCourse()== false){
            this.datedebut= new Date();
        }
    


    }
    void abandon(){
        setStatus(ABANDON);
        this.datefin= new Date();

    }
    void pasencoredemarre(){
        setStatus(PASENCOREDEMARRE);
        this.datefin= new Date();
    }
    void encours(){
        setStatus(ENCOURS);
        this.datefin= new Date();
    }
    void fini(){
        setStatus(FINI);
        this.datefin= new Date();
    }

    void discalifie(){
        setStatus(DISCALIFIE);
        this.datefin= new Date();
    }


    public boolean demarrerCourse() {
        if (this.datedebut==null){
            return true;
        }
        return false;
    }
    
    public boolean arriveeCourse() {
        if (this.datefin==null){
            return true;
        }
        return false;
    }


  


   
 
    
  

    
}

