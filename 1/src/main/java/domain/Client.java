/**
 * 
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pIsabelle Classe qui représente un client
 */
public class Client {

	private Integer numero;
	private String nom;
	private String prenom;
	private List<CompteBancaire> comptes = new ArrayList<CompteBancaire>();
	//constructeurs
		public Client() {}
		public Client(Integer numero, String nom, String prenom) {
			super();
			this.numero = numero;
			this.nom = nom;
			this.prenom = prenom;
		}

		public Client(Integer numero, String nom) {
			super();
			this.numero = numero;
			this.nom = nom;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(Integer numero) {
			this.numero = numero;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public List<CompteBancaire> getComptes() {
			return comptes;
		}
		public void setComptes(List<CompteBancaire> comptes) {
			this.comptes = comptes;
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		Integer result = 1;
		result = prime * result + ((comptes == null) ? 0 : comptes.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
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
		Client other = (Client) obj;
		if (comptes == null) {
			if (other.comptes != null)
				return false;
		} else if (!comptes.equals(other.comptes))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Client numero " + numero + " " + nom + " , " + prenom + ", comptes: " + comptes + " ";
	}

}
