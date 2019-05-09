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
public final class Casual extends Client {

    private TipusPagament tipusPagament;
    private String numTargeta;

    public Casual(TipusPagament tipusPagament, String numTargeta, String idDni, String nom, ArrayList<TipusCarnet> carnets, TipusClient tipus) {
        super(idDni, nom, carnets, tipus);
        this.tipusPagament = tipusPagament;
        this.numTargeta = numTargeta;
        if(this.tipusPagament == TipusPagament.METALIC){
            this.numTargeta = null;
        }
    }

    

    public TipusPagament getTipusPagament() {
        return tipusPagament;
    }

    @Override
    public String getId() {
        return idDni;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public ArrayList<TipusCarnet> getCarnets() {
        return carnets;
    }

    @Override
    public TipusClient getTipus() {
        return tipus;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setCarnets(ArrayList<TipusCarnet> carnets) {
        this.carnets = carnets;
    }

    public void setTipus(TipusClient tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Casual{"+ "idDni=" + idDni + ", nom=" + nom + ", carnets=" + carnets + ", tipus=" + tipus + ", tipusPagament=" + tipusPagament + ", numTargeta=" + numTargeta + '}';
    }

    
    
}
