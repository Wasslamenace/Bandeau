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
public abstract class Effet {

    public Bandeau bandeau;
    protected int iteration;
    protected String msg;

    public Effet(int iteration, Bandeau bandeau, String msg) {
        this.iteration = iteration;
        this.bandeau = bandeau;
        this.msg = msg;

    }
    
    public abstract void afficher();

}
