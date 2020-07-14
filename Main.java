import java.time.LocalDate;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String choix;
     Scanner clavier=new Scanner(System.in);
     Fonctionnalite fonction =new Fonctionnalite();
    do {
        
        
        System.out.println("1-Ajouter un service");
        System.out.println("2-Lister les services ");
        System.out.println("3-Ajouter un employe ");
        System.out.println("4-Lister les journaliers ");
        System.out.println("5-Lister les embauchés d'un service ");
        System.out.println("6-Quitter");
        System.out.println("Faites votre choix");
        choix=clavier.nextLine();
        
        switch(choix){
            case "1":
            System.out.println("Entrer le libelle de la Classe");
               String libelle =clavier.nextLine();
               Service servi=new Service();
               fonction.ajoutService(servi.getId(), libelle);
            break;

            case "2":

            fonction.listerService();
            break;

            case "3":
            System.out.println("Entrer le Nom Complet");
            String nomComplet =clavier.nextLine();
            System.out.println("Entrer l'annee d'embauche'");
            LocalDate dateEmb= LocalDate.now();
            System.out.println("Entrer le Salaire");
            int salaire =clavier.nextInt();
            System.out.println("Entrer la duree");
            int duree =clavier.nextInt();
            System.out.println("Entrer la forfait");
            int forfait =clavier.nextInt();
            System.out.println("Saisir l'ID de la Classe");
            fonction.listerService();
            int idClasse=clavier.nextInt();
            Service classeEtu=new Service();
            classeEtu.setId(idClasse);

            Embauche em =new Embauche(salaire, dateEmb, nomComplet);
                   em.setService(classeEtu);
                   fonction.ajouterPersonne(em);

            break;

            case "4":
            fonction.listerJournalier();
            break;

            case "5":

            System.out.println("Saisir l'ID de la Classe");
            fonction.listerService();
            int id=clavier.nextInt();
            Service service=new Service();
            service.setId(id);
            fonction.listerEmbParService(service);
            break;


        }
        
    } while ( ! choix.equalsIgnoreCase("6"));

    System.out.println("Au revoir");
    }
}