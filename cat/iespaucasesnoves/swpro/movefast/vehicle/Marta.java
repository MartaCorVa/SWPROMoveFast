/*

 */
package cat.iespaucasesnoves.swpro.movefast.vehicle;

import cat.iespaucasesnoves.swpro.movefast.excepcions.VehicleException;
import static cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCanvi.AUTOMATIC;
import static cat.iespaucasesnoves.swpro.movefast.vehicle.TipusVehicle.CAMIO;
import static cat.iespaucasesnoves.swpro.movefast.vehicle.TipusVehicle.COTXE;
import static cat.iespaucasesnoves.swpro.movefast.vehicle.TipusVehicle.FURGONETA;
import static cat.iespaucasesnoves.swpro.movefast.vehicle.TipusVehicle.MOTOCICLETA;

/**
 *
 * @author Marta
 */
public class Marta {

    public static void main(String[] args) throws VehicleException {
        Cotxe c = new Cotxe("1234567", COTXE, AUTOMATIC, 7);
        System.out.println(c);
        Motocicleta m = new Motocicleta(200, "1234567", MOTOCICLETA, AUTOMATIC);
        System.out.println(m);
        Furgoneta f = new Furgoneta(800, "1234567", FURGONETA, AUTOMATIC);
        System.out.println(f);
        Camio ca = new Camio(3001, "1234567", CAMIO, AUTOMATIC);
        System.out.println(ca);
    }
    
}
