/**
 * 
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pIsabelle Classe qui représente un cllient
 */
public class Client {

	private int numero;
	private String nom;
	private String prenom;
	private List<CompteBancaire> comptes = new ArrayList<CompteBancaire>();

	@Override
	public String toString() {
		return " client " + numero  + " , nom: " + nom + " , prenom: " + prenom ;
	}

	/**
	 * constructor
	 * 
	 * @param numero
	 * @param nom
	 * @param prenom
	 */
	public Client(int numero, String nom, String prenom) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return the comptes
	 */
	public List<CompteBancaire> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<CompteBancaire> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void afficherComptes() {
		
	}

}
