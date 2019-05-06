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
public class Leasing extends Client {

    private String compteBancari;
    private String nif;
    private String nomEmpresa;
    

    public Leasing(String id, String nom, ArrayList<TipusCarnet> carnets, TipusClient tipus ) {
        super(id, nom, carnets, tipus);
        this.nif = nif;
        this.nomEmpresa = nomEmpresa;
    }

    public String getCompteBancari() {
        return compteBancari;
    }

    @Override
    public String toString() {
        return "Leasing{" + "compteBancari=" + compteBancari + ", nif=" + nif + ", nomEmpresa=" + nomEmpresa + '}';
    }

    
    
}
