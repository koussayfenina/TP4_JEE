package web;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.IJoueurDao;
import dao.JoueurDaoImpl;
import metier.entities.Joueur;
@WebServlet (name="cs",urlPatterns= {"/controleur","*.do"})
public class ControleurServlet extends HttpServlet {
IJoueurDao metier;
@Override
public void init() throws ServletException {
metier = new JoueurDaoImpl();
}
@Override
protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
String path=request.getServletPath();
if (path.equals("/index.do"))
{
request.getRequestDispatcher("joueurs.jsp").forward(request,response);
}
else if (path.equals("/chercher.do"))
{
String motCle=request.getParameter("motCle");
JoueurModele model= new JoueurModele();
model.setMotCle(motCle);
List<Joueur> prods = metier.JoueurParMC(motCle);
model.setJoueurs(prods);
request.setAttribute("model", model);
request.getRequestDispatcher("joueurs.jsp").forward(request,response);
}
}
}