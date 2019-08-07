/**
 * 
 */
package domain;

/**
 * @author simplonip
 *
 */
public class CompteEpargne extends CompteBancaire {

	private Double txInteret;

	public CompteEpargne(Client titulaire, Double solde, String devise, Double txInteret) {
		super(titulaire, solde, devise);
		this.setTxInteret(txInteret);
	}

	public Double getTxInteret() {
		return txInteret;
	}

	public void setTxInteret(Double txInteret) {
		this.txInteret = txInteret;
	}
	
	//other methods
	public void ajouternteret() {
		double interets= solde * txInteret;
		solde += interets;
		
	}

	
	
	
}
