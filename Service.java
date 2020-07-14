public class Service implements Iservice {

    private int id;
    private String libelle;

    private static int nbreService;

    public Service(){

        //Initialisé ID
        nbreService++;
        this.id=nbreService;

    }

    public Service(String libelle){

        //Initialisé ID
        nbreService++;
        this.id=nbreService;
        this.libelle=libelle;
        
    }

    public int getId(){
        return this.id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle(){
        return this.libelle;
    }

    public void setLibelle(String libelle){
        this.libelle=libelle;
    }

    @Override
      public String affiche(){
         return "Id: "+id+" libelle : "+libelle;
      }

    public int compare(int id){
        return 0;
    }

    public String compare(String libelle){
        return "n";
    }
    
}