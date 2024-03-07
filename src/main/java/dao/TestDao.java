package dao;
import java.util.List;
import metier.entities.Joueur;
public class TestDao {
public static void main(String[] args) {
JoueurDaoImpl pdao= new JoueurDaoImpl();
Joueur j= pdao.save(new Joueur("rashford",2800));
System.out.println(j);
List<Joueur> prods =pdao.JoueurParMC("rashford");
for (Joueur p : prods)
System.out.println(p);
}
}
