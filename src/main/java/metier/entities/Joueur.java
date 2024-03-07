package metier.entities;

import java.io.Serializable;
public class Joueur implements Serializable{
	private Long idJoueur;
	private String nomJoueur;
	private double prix;
public Joueur() {
super();
}
public Joueur(String nomJoueur, double prix) {
super();
this.nomJoueur = nomJoueur;
this.prix = prix;
}
public Long getIdJoueur() {
return idJoueur;
}
public void setIdJoueur(Long idJoueur) {
this.idJoueur = idJoueur;
}
public String getNomJoueur() {
return nomJoueur;
}
public void setNomJoueur(String nomJoueur) {
this.nomJoueur = nomJoueur;
}
public double getPrix() {
return prix;
}

public void setPrix(double prix) {
this.prix = prix;
}
@Override
public String toString() {
	return "Joueur [idJoueur=" + idJoueur + ", nomJoueur=" + nomJoueur + ", prix=" + prix + "]";
}
}
