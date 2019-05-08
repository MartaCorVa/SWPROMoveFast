/*

 */
package cat.iespaucasesnoves.swpro.movefast.vehicle;

import cat.iespaucasesnoves.swpro.movefast.excepcions.VehicleException;

/**
 *
 * @author Marta Córcoles Valle
 */
public class Motocicleta extends Vehicle {

    private int cilindrada;

    public Motocicleta(int cilindrada, String matricula, TipusVehicle tipusVehicle, TipusCanvi tipusCanvi) throws VehicleException {
        super(matricula, tipusVehicle, tipusCanvi);
        this.setCilindrada(cilindrada);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        try {
            if (cilindrada > 49) {
                this.cilindrada = cilindrada;
            } else {
                throw new VehicleException(005);
            }
        } catch (VehicleException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "cilindrada=" + cilindrada + '}';
    }
    
}
