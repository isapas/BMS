package presentation;

import java.util.Scanner;

import domain.CompteBancaire;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //creation de comptes bancaires
    	CompteBancaire cpte1 = new CompteBancaire("desart", 257.68, "€");
    	CompteBancaire cpte2 = new CompteBancaire("sabor", 2579.18, "€");
    	System.out.println("Etat des comptes avant opération:  ");
    	System.out.println(cpte1);
    	System.out.println(cpte2);
    	
    	//effectuer une opération:
    	
    	cpte1.crediter(687.50);
    	cpte2.debiter(364.80);
    	System.out.println("Etat des comptes apprès opération:  ");
    	System.out.println(cpte1);
    	System.out.println(cpte2);
    	
//    	effectuer un transfert
    	Scanner sc = new Scanner(System.in);
    	System.out.println("sur quel compte voulez vous effectuer un virement? tapez 1/2");
    	int cpteACrediter = sc.nextInt();
    	System.out.println("Quel Montant voulez vous crediter sur ce compte?");
    	double montant = sc.nextDouble();
    	if (cpteACrediter == 1)
    	{

        	cpte1.crediter(montant);
        	cpte2.debiter(montant);
    	}
    	else {
    		cpte2.crediter(montant);
    		cpte1.debiter(montant);
    	}
    	System.out.println("Etat des comptes apres le virement");
    	System.out.println(cpte1.afficherResultOp(cpte1));
    	System.out.println(cpte1.afficherResultOp(cpte2));
    }
}
