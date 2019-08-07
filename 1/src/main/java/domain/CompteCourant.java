/**
 * 
 */
package domain;

/**
 * @author simplonip
 *
 */
public class CompteCourant extends CompteBancaire {

	private String numeroCB;
	private double decouvertMaxi;
	
	
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CompteCourant(Client pTitulaire, double pSolde, String pDevise,
			String pNumeroCB, double pDecouvertMaxi) {
		super(pTitulaire, pSolde, pDevise);
		this.setNumeroCB(pNumeroCB);
		this.decouvertMaxi = pDecouvertMaxi;
	}


	public CompteCourant(Client titulaire, double solde, 
			String pNumeroCB, double pDecouvertMaxi) {
		super(titulaire, solde);
		this.setNumeroCB(pNumeroCB);
		this.decouvertMaxi = pDecouvertMaxi;
	}

	@Override
	public void debiter(double montant) {
		if (montant - this.getSolde() < Math.abs(this.decouvertMaxi) ) {
			this.setSolde(this.getSolde() - montant);
		}
	}

	@Override
	public void crediter(double montant) {
		solde = solde + montant;
		
	}

	public String getNumeroCB() {
		return numeroCB;
	}


	public void setNumeroCB(String numeroCB) {
		this.numeroCB = numeroCB;
	}


	@Override
	public String afficherResultOp(CompteBancaire compte) {
		
		String resultOp = "Vous avez effectué un virement  sur le compte "
		+ compte + " , votre nouveau solde est de " + solde + " " + devise;
		return resultOp;
	}




}
