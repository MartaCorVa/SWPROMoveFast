/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.swpro.movefast.lloguer;

import cat.iespaucasesnoves.swpro.movefast.client.*;
import cat.iespaucasesnoves.swpro.movefast.vehicle.*;
import java.time.LocalDate;
import java.util.HashSet;

/**
 *
 * @author Miquel
 */
public class Lloguer {

    private LocalDate inici;
    private LocalDate fi;
    private HashSet<Vehicle> vehicles;
    private HashSet<Client> clients;

    public Lloguer(LocalDate inici, LocalDate fi) {
        this.inici = inici;
        this.fi = fi;
        vehicles = new HashSet<>();
        clients = new HashSet<>();
    }

    public HashSet<Vehicle> getVehicles() {
        HashSet<Vehicle> copiaVehicle = new HashSet<>();

        for (Vehicle copia : vehicles) {
            copiaVehicle.add(copia);
        }
        return copiaVehicle;
    }

    public HashSet<Client> getClients() {

        HashSet<Client> copiaClient = new HashSet<>();
        for (Client copia : clients) {
            copiaClient.add(copia);
        }
        return copiaClient;
    }

    public LocalDate getInici() {
        return inici;
    }

    public LocalDate getFi() {
        return fi;
    }

    public void setInici(LocalDate inici) {
        this.inici = inici;
    }

    public void setFi(LocalDate fi) {
        this.fi = fi;
    }

    public double calculaPreu() {
        double preu = ;
        if (Client.getTipus() == TipusClient.LEASING) {
            preu = preu * (10 / 100);
        }
        return preu;

    }

    public int compareTo(Lloguer lloguer) {

        return 0;

    }

    @Override
    public String toString() {
        return "Lloguer{" + "inici=" + inici + ", fi=" + fi + ", vehicles=" + vehicles + ", clients=" + clients + '}';
    }
}

//    public Vehicle vehiclesDisponibles(LocalDate dataConcreta) {
//        
//        for (Vehicle disponible : getVehicles()) {
//            if (inici == dataConcreta) {
//                if (Vehicle.disponible == true) {
//                    return disponible;
//                }                
//            }
//            
//        }
//        return null;
//        
//    }

