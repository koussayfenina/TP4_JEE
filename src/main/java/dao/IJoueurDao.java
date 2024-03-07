package dao;

import java.util.List;

import metier.entities.Joueur;
public interface IJoueurDao {
public Joueur save(Joueur p);
public List<Joueur> JoueurParMC(String mc);
public Joueur getJoueur(Long id);
public Joueur updateJoueur(Joueur p);
public void deleteJoueur(Long id);
}

