package domaine;

public class Employe {								

	// Propriétés
	private String nom ;         
	private String prenom ;       

	// Constructeur
	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	// Getters / Setters
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
	
	// Méthode toString
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
	}

}