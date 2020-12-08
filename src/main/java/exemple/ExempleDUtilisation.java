package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    
public static void main(String[] args) {

        Bandeau monBandeau = new Bandeau();

        Scenario scenario1 = new Scenario(monBandeau);

        scenario1.ajouterEffet(new Zoom(4, monBandeau, "Zoom In"));
        scenario1.ajouterEffet(new Rotate(3, monBandeau, "Rotate "));
        scenario1.ajouterEffet(new Clignotant(5, monBandeau, "Flash"));

        scenario1.afficherScenario();

    }
}  

