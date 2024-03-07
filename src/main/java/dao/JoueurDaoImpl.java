package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.entities.SingletonConnection;
import metier.entities.Joueur;
public class JoueurDaoImpl implements IJoueurDao {
@Override
public Joueur save(Joueur p) {
Connection conn=SingletonConnection.getConnection();
 try {
PreparedStatement ps= conn.prepareStatement("INSERT INTO joueurs(NOM_joueur,PRIX) VALUES(?,?)");
ps.setString(1, p.getNomJoueur());
ps.setDouble(2, p.getPrix());
ps.executeUpdate();
PreparedStatement ps2= conn.prepareStatement("SELECT MAX(ID_joueur) as MAX_ID FROM joueurs");
ResultSet rs =ps2.executeQuery();
if (rs.next()) {
p.setIdJoueur(rs.getLong("MAX_ID"));
}
ps.close();
ps2.close();
} catch (SQLException e) {
e.printStackTrace();
}
return p;
}
@Override
public List<Joueur> JoueurParMC(String mc) {
 List<Joueur> prods= new ArrayList<Joueur>();
 Connection conn=SingletonConnection.getConnection();
 try {
PreparedStatement ps= conn.prepareStatement("select * from joueurs where NOM_joueur LIKE ?");
ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
	Joueur p = new Joueur();
p.setIdJoueur(rs.getLong("ID_joueur"));
p.setNomJoueur(rs.getString("NOM_joueur"));
p.setPrix(rs.getDouble("PRIX"));
prods.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return prods;
}
@Override
public Joueur getJoueur(Long id) {
// TODO Auto-generated method stub
return null;
}
@Override
public Joueur updateJoueur(Joueur p) {
// TODO Auto-generated method stub
return null;
}
@Override
public void deleteJoueur(Long id) {
// TODO Auto-generated method stub
}
}