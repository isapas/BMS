package presentation;

import java.util.ArrayList;
import java.util.List;

import domain.Client;
import domain.CompteBancaire;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       //creation de comptes bancaires
//    	CompteBancaire cpte1 = new CompteBancaire("desart", 257.68, "€");
//    	CompteBancaire cpte2 = new CompteBancaire("sabor", 2579.18, "€");
//    	System.out.println("Etat des comptes avant opération:  ");
//    	System.out.println(cpte1);
//    	System.out.println(cpte2);
//    	
//    	//effectuer une opération:
//    	
//    	cpte1.crediter(687.50);
//    	cpte2.debiter(364.80);
//    	System.out.println("Etat des comptes apprès opération:  ");
//    	System.out.println(cpte1);
//    	System.out.println(cpte2);
//    	
////    	effectuer un transfert
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("sur quel compte voulez vous effectuer un virement? tapez 1/2");
//    	int cpteACrediter = sc.nextInt();
//    	System.out.println("Quel Montant voulez vous crediter sur ce compte?");
//    	double montant = sc.nextDouble();
//    	if (cpteACrediter == 1)
//    	{
//
//        	cpte1.crediter(montant);
//        	cpte2.debiter(montant);
//    	}
//    	else {
//    		cpte2.crediter(montant);
//    		cpte1.debiter(montant);
//    	}
//    	System.out.println("Etat des comptes apres le virement");
//    	System.out.println(cpte1.afficherResultOp(cpte1));
//    	
//    	System.out.println(cpte2.afficherResultOp(cpte2));
    	
    	//manipulations de clients
    	Client cl1 = new Client(0, "Ochon","Paul");
    	Client cl2 = new Client(1, "Kiroul","Pierre");
    	Client cl3 = new Client(2, "Pamous","Anas");
    	
    	//creation de comptes reliés aux clients
    	
    	CompteBancaire  cpt0 = new CompteBancaire(cl1, 3400.00, "€");
    	CompteBancaire  cpt1 = new CompteBancaire(cl2, 6587.05, "€");
    	CompteBancaire  cpt2 = new CompteBancaire(cl3, 6780.90, "€");
    	//afficher clients individuellement
    	System.out.println(cl1);
    	System.out.println(cl2);
    	System.out.println(cl3);
    	//afficher comptes individuellement
    	System.out.println(cpt0);
    	System.out.println(cpt1);
    	System.out.println(cpt2);
    	
    	//ajout des comptes dans la liste
    	List<CompteBancaire> comptes = new ArrayList<CompteBancaire>();
    	comptes.add(cpt0);
    	comptes.add(cpt1);
    	comptes.add(cpt2);
    	//affiche les informations de chaque compte bancaire de la liste
    	for (CompteBancaire  compte: comptes) {
    		System.out.println(compte.afficherResultOp(compte));
			
		}
    	
    }
}
