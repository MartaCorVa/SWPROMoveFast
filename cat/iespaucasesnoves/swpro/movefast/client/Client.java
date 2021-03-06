/*

 */
package cat.iespaucasesnoves.swpro.movefast.client;

import cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCarnet;
import java.util.ArrayList;

/**
 *
 * @author Marta Córcoles Valle
 */
public abstract class Client {

    protected String idDni;
    protected String nom;
    protected ArrayList<TipusCarnet> tipusCarnets;
    public TipusClient tipusClient;

    public Client(String idDni, String nom, TipusClient tipusClient) {
        this.idDni = idDni;
        this.nom = nom;
        this.tipusCarnets = new ArrayList<>();
        this.tipusClient = tipusClient;
    }

    public TipusClient getTipusClient() {
        return tipusClient;
    }

    public String getId() {
        return idDni;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<TipusCarnet> getTipusCarnets() {
        return tipusCarnets;
    }

    public void setTipusCarnets(ArrayList<TipusCarnet> tipusCarnets) {
        this.tipusCarnets = tipusCarnets;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Client{" + "idDni=" + idDni + ", nom=" + nom + ", carnets=" + tipusCarnets + ", tipusClient=" + tipusClient + '}';
    }
    
    

}
