/**
 * 
 */
package domain;

/**
 * @author simplonip
 *
 */
public class CompteEpargne extends CompteBancaire{
	private double tauxInteret;
	
	public CompteEpargne(Client pTitulaire, double pSolde, String pDevise,
			double pTauxInteret) {
		super(pTitulaire, pSolde, pDevise);
		this.tauxInteret = pTauxInteret;
	}
	
	

	/**
	 * Calculer et ajouter les internet au solde du compte
	 */
	public void ajouterInteret() {
		this.setSolde(getSolde() + this. getSolde() * this.tauxInteret); 
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ". Avec un taux d'interet de: " + this.tauxInteret;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(tauxInteret);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteEpargne other = (CompteEpargne) obj;
		if (Double.doubleToLongBits(tauxInteret) != Double.doubleToLongBits(other.tauxInteret))
			return false;
		return true;
	}

	/**
	 * On ne peut retirer en une seule fois plus de la moitié 
	 * du solde d'un compte épargne.
	 */
	@Override
	public void debiter(double montant) {
		if (montant <= this.getSolde() / 2) {
			this.setSolde(this.getSolde() - montant);
		}
	}

	@Override
	public void crediter(double montant) {
		solde = solde + montant;
		
	}


	@Override
	public String afficherResultOp(CompteBancaire compte) {
		Double montant = null;
		String resultOp = "Vous avez effectué un virement de " + montant + " sur le compte "
		+ compte + " , votre nouveau solde est de " + solde + " " + devise;
		return resultOp;

	}
}