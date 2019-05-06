/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.swpro.movefast.client;

import cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCarnet;
import java.util.ArrayList;



/**
 *
 * @author Esteve SC
 */
public class Casuals extends Client {

    private String numTargeta;

    public Casuals(String numTargeta, String id, String nom, ArrayList<TipusCarnet> carnets, TipusClient tipus) {
        super(id, nom, carnets, tipus);
        this.numTargeta = numTargeta;
    }

    public String getNumTargeta() {
        return numTargeta;
    }

    @Override
    public String toString() {
        return "Casuals{" + "numTargeta=" + numTargeta + '}';
    }
    
}
