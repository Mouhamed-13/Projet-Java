
public class Fonctionnalite {


    //Taille Reservation :nbre Cellule du Tableau
    final int TAILLE=10;
    //Taille Réélle :nbre element du Tableau
      private int nbreService=0;//nbre Classe dans le tableau ,
                               //mais aussi la position d'insertion
      private int nbreEmploye=0;
    //Declaration des Tableaux
    private Service tabservice[];
    private Employe [] tabEmploye;

    public Fonctionnalite(){
        //Creation du Tableau
        tabservice=new Service[TAILLE];
        tabEmploye=new Employe[TAILLE];

    }

    public void ajoutService(int id,String libelle){
        if(nbreService<TAILLE){
            Service serv=new Service();
            //Generer ID de la Classe
            serv.setId(id);
            serv.setLibelle(libelle);
            tabservice[nbreService]=serv;
            nbreService++;
        }else{
            System.out.println("Tableau Rempli");
        }
        
    }


    public void listerService(){
        for(int i=0;i<nbreService;i++){
            System.out.println(tabservice[i].affiche());
        }
        
    }

    //Inscription Etudiant 
    //Affectation professeur
    public void  ajouterEmploye(Employe emp){
        boolean isExist=false;
        //Extend
        if(emp instanceof Journalier){
            isExist=employeIsExist(emp);
        }
        //isExist==false
        if (!isExist) {
            tabEmploye[nbreEmploye]=emp;
            nbreEmploye++;
        }


          

    }

    public void listerEmbParService(Service service){
        for(int i=0;i<nbreEmploye;i++){
            if(tabEmploye[i] instanceof Embauche)
                //Convertion d'une Personne en un Etudiant=> downCasting
                //((Etudiant)tabPersonne[i]) possible car Etudiant herite de Personne
                   if(((Embauche)tabEmploye[i]).getService().getId()==service.getId()){
                       System.out.println(tabEmploye[i].affiche());
                   }
            }
           
        }
        
    }

    public void listerJournalier(){
        for(int i=0;i<nbreEmploye;i++){
            if(tabEmploye[i] instanceof Journalier){
                
                       System.out.println(tabEmploye[i].affiche());
                   
            }
           
        }
        
    }

    //Uc 

    private boolean employeIsExist(Employe emp){

        for(Employe p : tabEmploye){
            //La cellule du tableau contient une personne
            
            if(p!=null){
                String s1=p.getNomComplet();
                String s2= emp.getNomComplet();
                if(s1.equalsIgnoreCase(s2)) {
                    return true;
                }

            }

        }

        return false;

    }

    
}