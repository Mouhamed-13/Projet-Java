public abstract class Employe implements Iservice{
    private int id;
    private String nomComplet;

    private static int nbreEmploye;

    public Employe(){

        //Initialisé ID
        nbreEmploye++;
        this.id=nbreEmploye;

    }

    public Employe(String nomComplet){
        this.nomComplet=nomComplet;
        nbreEmploye++;
        this.id=nbreEmploye;
        
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public int getId(){
        return this.id;
     }
  
     public String getNomComplet(){
        return this.nomComplet;
     }
  
  
  
     //redefinition de la methode affiche()
  
      @Override
      public String affiche(){
         return "Id: "+id+" Nom et Prenom : "+nomComplet;
      }
    

}