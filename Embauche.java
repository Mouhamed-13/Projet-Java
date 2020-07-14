import java.time.LocalDate;
public class Embauche extends Employe{

    private int salaire;
    private LocalDate dateEmb;

    private Service  embService;


    public Embauche(){

    }

    public Embauche(int salaire,LocalDate dateEmb,String nomComplet){
        super(nomComplet);
        this.salaire=salaire;
        this.dateEmb=dateEmb;
        
    }

    public int getSalaire(){
        return this.salaire;
    }

    public LocalDate getDateEmbauche(){
        return this.dateEmb;
    }

    public Service getService(){
        return this.embService;
     }

    public void setSalaire(int salaire){
        this.salaire=salaire;
    }



    @Override
      public String affiche(){
          
         return super.affiche()+ "salaire "+salaire+" date d'embauche : "+dateEmb;
      }
    
}