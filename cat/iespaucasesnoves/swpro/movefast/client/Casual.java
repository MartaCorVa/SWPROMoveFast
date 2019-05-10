/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.swpro.movefast.client;

//import cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCarnet;
//import java.util.ArrayList;



/**
 *
 * @author Esteve SC
 */
public final class Casual extends Client {

    private TipusPagament tipusPagament;
    private String numTargeta;

    public Casual(TipusPagament tipusPagament, String numTargeta, String idDni, String nom) {
        super(idDni, nom, TipusClient.CASUAL);
        this.tipusPagament = tipusPagament;
        
        
        if(this.tipusPagament == TipusPagament.METALIC){
            this.numTargeta = null;
        } else {
             this.numTargeta = numTargeta;
        }
       
    }
    
    public TipusPagament getTipusPagament() {
        return tipusPagament;
    }

     public String getNumTargeta() {
        return numTargeta;
    }  

    @Override
    public String toString() {
        return "Casual{"+ "idDni=" + idDni + ", nom=" + nom + ", tipusClient=" + tipusClient + ", tipusPagament=" + tipusPagament + ", numTargeta=" + numTargeta + '}';
    }

    
    
}
