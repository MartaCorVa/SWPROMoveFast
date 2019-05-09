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
    protected ArrayList<TipusCarnet> carnets;
    protected TipusClient tipus;

    public Client(String idDni, String nom, ArrayList<TipusCarnet> carnets, TipusClient tipus) {
        this.idDni = idDni;
        this.nom = nom;
        this.carnets = carnets;
        this.tipus = tipus;
    }

    public TipusClient getTipus() {
        return tipus;
    }

    public String getId() {
        return idDni;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<TipusCarnet> getCarnets() {
        return carnets;
    }

    public void setCarnets(ArrayList<TipusCarnet> carnets) {
        this.carnets = carnets;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Client{" + "idDni=" + idDni + ", nom=" + nom + ", carnets=" + carnets + ", tipus=" + tipus + '}';
    }
    
    

}
