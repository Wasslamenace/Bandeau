package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;


// Ce TP a été très difficile à mettre en oeuvre. Dans un premier temps je ne sais pas pourquoi mais Netbeans affinche "La syntaxe est inccorecte" je n'arrive pas à faire fonctionner le programme meme s'il n'y a aucune erreur.
// Second point, je n'ai pas réussi à ouvrir le mdzip, MagicDraw me demande une licence, malgré le fait que j'ai dl la version d'essai, j'ai desinstaller réinstaller sans aucun succès. 



public class ExempleDUtilisation {
    
public static void main(String[] args) {

        Bandeau bandeau_test = new Bandeau();

        Scenario scenar = new Scenario(bandeau_test);

        scenar.ajouterEffet(new Zoom(4, bandeau_test, "Zoom In"));
        scenar.ajouterEffet(new Rotate(3, bandeau_test, "Rotate "));
        scenar.ajouterEffet(new Clignotant(5, bandeau_test, "Flash"));

        scenar.afficherScenario();

    }
}  

