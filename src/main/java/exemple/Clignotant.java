/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author PC
 */
public class Clignotant extends Effet {

    public Clignotant(int iteration, Bandeau bandeau, String msg) {
        super(iteration, bandeau, msg);
    }

    public void afficher() {
        bandeau.setMessage(msg);
        for (int j = 0; j < this.iteration; j++) {
            for (int i = 0; i < 60; i++) {
                if (i % 2 == 0) {
                    this.bandeau.setForeground(Color.blue);
                    this.bandeau.sleep(200);
                }
                if ((i % 2) != 0) {
                    this.bandeau.setForeground(Color.green);
                    this.bandeau.sleep(200);

                }
            }
        }
    }
}
