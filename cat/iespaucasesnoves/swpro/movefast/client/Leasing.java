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
public final class Leasing extends Client {

    private String compteBancari;
    private String nif;
    private String nomEmpresa;

    public Leasing(String compteBancari, String nif, String nomEmpresa, String idDni, String nom, ArrayList<TipusCarnet> carnets, TipusClient tipus) {
        super(idDni, nom, carnets, tipus);
        this.compteBancari = compteBancari;
        this.nif = nif;
        this.nomEmpresa = nomEmpresa;
    }

    public String getCompteBancari() {
        return compteBancari;
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
        return "Leasing{"+ "idDni=" + idDni + ", nom=" + nom + ", carnets=" + carnets + ", tipus=" + tipus + "compteBancari=" + compteBancari + ", nif=" + nif + ", nomEmpresa=" + nomEmpresa + '}';
    }

    
    
}
