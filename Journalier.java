public class Journalier extends Employe {

    private int duree;
    private int forfait;

    public Journalier(){

    }

    public Journalier(int duree,int forfait,String nomComplet){
        super(nomComplet);
        this.duree=duree;
        this.forfait=forfait;
        
    }

    
    public int getForfait() {
        return forfait;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setForfait(int forfait) {
        this.forfait = forfait;
    }

    
    public int getDuree() {
        return duree;
    }

    @Override
      public String affiche(){
          
         return super.affiche()+ "duree "+duree+" forfait : "+forfait;
      }
    
}