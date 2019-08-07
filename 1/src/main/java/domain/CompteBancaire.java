/**
 * 
 */
package domain;

/**
 * 
 * @author pIsabelle
 *
 */
public abstract class CompteBancaire extends Object{

	protected Client titulaire;
	protected double solde;
	protected String devise;
	
	public CompteBancaire() {};
	
	public CompteBancaire(Client titulaire, double solde, String pDevise) {
		this.titulaire = titulaire;
		this.solde = solde;
		this.devise = pDevise;
	}
	
	public CompteBancaire(Client titulaire, double solde) {
		
		this.titulaire = titulaire;
		this.solde = solde;
	}

	
	protected Client getTitulaire() {
		return titulaire;
	}

	protected void setTitulaire(Client titulaire) {
		this.titulaire = titulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	/**
	 * Ajouter le montant au solde
	 * 
	 * @param montant: Le montant à ajouter au solde
	 */
	public abstract void crediter(double montant);
	
	/**
	 * Retirer un montant du compte
	 * 
	 * @param montant
	 */
	public abstract void debiter( double montant);
	
	@Override
	public String toString() {
		return "CompteBancaire [titulaire=" +  titulaire.getPrenom()
		+ " " + titulaire.getNom()	+ ", solde=" + solde + ", devise=" + devise + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((devise == null) ? 0 : devise.hashCode());
		long temp;
		temp = Double.doubleToLongBits(solde);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titulaire == null) ? 0 : titulaire.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		if (devise == null) {
			if (other.devise != null)
				return false;
		} else if (!devise.equals(other.devise))
			return false;
		if (Double.doubleToLongBits(solde) != Double.doubleToLongBits(other.solde))
			return false;
		if (titulaire == null) {
			if (other.titulaire != null)
				return false;
		} else if (!titulaire.equals(other.titulaire))
			return false;
		return true;
	}

	public abstract String afficherResultOp(CompteBancaire compte);
	
	
}