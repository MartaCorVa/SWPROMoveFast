/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.swpro.movefast.empresa;

import cat.iespaucasesnoves.swpro.movefast.client.Client;
import cat.iespaucasesnoves.swpro.movefast.client.Leasing;
import cat.iespaucasesnoves.swpro.movefast.client.TipusClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author Miquel
 */
public class Empresa {
    
    private String nom;
    private String id;
    private String adreça;
    private HashMap<String, Leasing> leasings;

    public Empresa(String nom, String id, String adreça) {
        this.nom = nom;
        this.id = id;
        this.adreça = adreça;
        leasings = new HashMap();
    }

    public String getNom() {
        return nom;
    }

    public String getId() {
        return id;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public String toString() {
        return "Empresa{" + "nom=" + nom + ", id=" + id + ", adre\u00e7a=" + adreça + ", leasings=" + leasings + '}';
    }

    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nom);
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.adreça);
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.adreça, other.adreça);
    }

    public HashMap<String, Leasing> getLeasings() {
        return leasings;
    }

    public void afegirLeasing(Leasing leasing) {
        if (this.tipus == TipusClient.LEASING) {

        }
    }
   
}
