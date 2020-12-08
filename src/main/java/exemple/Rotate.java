/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author PC
 */
public class Rotate extends Effet {

    public Rotate(int iteration, Bandeau bandeau, String msg) {
        super(iteration, bandeau, msg);
    }

    public void afficher() {
        bandeau.setMessage(msg);
        for (int j = 0; j < this.iteration; j++) {
            for (int i = 0; i <= 100; i++) {
                this.bandeau.setRotation(2 * Math.PI * i / 100);
                this.bandeau.sleep(200);
            }
        }

    }
}