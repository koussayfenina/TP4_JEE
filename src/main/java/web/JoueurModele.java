 package web;
import java.util.ArrayList;
import java.util.List;
import metier.entities.Joueur;
public class JoueurModele {
private String motCle;
List<Joueur> j = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Joueur> getProduits() {
return j;
}
public void setJoueurs(List<Joueur> j) {
this.j = j;
}
}