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

//    public Leasing(String compteBancari, String nif, String nomEmpresa, String idDni, String nom, ArrayList<TipusCarnet> tipusCarnets) {
//        super(idDni, nom, tipusCarnets, tipusClient=TipusClient.LEASING);
//        this.compteBancari = compteBancari;
//        this.nif = nif;
//        this.nomEmpresa = nomEmpresa;
//    }

    public Leasing(String compteBancari, String nif, String nomEmpresa, String idDni, String nom) {
        super(idDni, nom, TipusClient.LEASING);
        this.compteBancari = compteBancari;
        this.nif = nif;
        this.nomEmpresa = nomEmpresa;
    }

    public String getCompteBancari() {
        return compteBancari;
    }

    public String getNif() {
        return nif;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    

    @Override
    public String toString() {
        return "Leasing{"+ "idDni=" + idDni + ", nom=" + nom + ", tipusClient=" + tipusClient + ", compteBancari=" + compteBancari + ", nif=" + nif + ", nomEmpresa=" + nomEmpresa + '}';
    }

   
    
}
