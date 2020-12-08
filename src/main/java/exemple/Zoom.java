/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author PC
 */
public class Zoom extends Effet {

    public Zoom(int iteration, Bandeau bandeau, String msg) {
        super(iteration, bandeau, msg);

    }

    public void afficher() {
        bandeau.setMessage(msg);
        for (int j = 0; j < this.iteration; j++) {
            for (int i = 5; i < 60; i += 5) {
                this.bandeau.setFont(new Font("Dialog", Font.ITALIC, 5 + i));
                this.bandeau.sleep(200);

            }
        }
    }
}
