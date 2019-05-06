/*

 */
package cat.iespaucasesnoves.swpro.movefast.client;

import cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCarnet;
import java.util.ArrayList;

/**
 *
 * @author Marta Córcoles Valle
 */
public class Client {

    protected String id;
    protected String nom;
    protected ArrayList<TipusCarnet> carnets;
    protected TipusClient tipus;

    public Client(String id, String nom, ArrayList<TipusCarnet> carnets, TipusClient tipus) {
        this.id = id;
        this.nom = nom;
        this.carnets = carnets;
        this.tipus = tipus;
    }
    
    public TipusClient getTipus() {
        return tipus;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    
    
    
    
    

    

}
