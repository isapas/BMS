/**
 * 
 */
package domain;

/**
 * 
 * @author pIsabelle
 *
 */
public class CompteBancaire {

	private Client titulaire;
	private Double solde;
	private String devise;

	/**
	 * constructor
	 * 
	 * @param titulaire
	 * @param solde
	 * @param devise
	 */
	public CompteBancaire(Client titulaire, Double solde, String devise) {
		super();
		this.titulaire = titulaire;
		this.solde = solde;
		this.devise = devise;
	}

	
	public CompteBancaire(Client titulaire, Double solde) {
		super();
		this.titulaire = titulaire;
		this.solde = solde;
	}

	
	//constructor par défaut
	public CompteBancaire() {
			
	}

	public CompteBancaire(String string, double solde2, String devise2) {
	}


	// setters and getters//
	public Client getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(Client titulaire) {
		this.titulaire = titulaire;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	@Override
	public String toString() {
		return "CompteBancaire [titulaire=" + titulaire + ", solde=" + solde + ", devise=" + devise + "]";
	}

	// class methods

	public void crediter(Double montant) {
		solde = solde + montant;

	}

	public void debiter(Double montant) {
		solde = solde - montant;

	}
	
	public String afficherResultOp(CompteBancaire cpteToDisplay) {
		 String result = "le solde du compte " + cpteToDisplay + " est de  " + cpteToDisplay.solde + " " + cpteToDisplay.devise;
		return result;
		
	}

}
