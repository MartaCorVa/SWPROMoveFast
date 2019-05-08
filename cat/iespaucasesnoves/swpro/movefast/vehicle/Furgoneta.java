/*

 */

package cat.iespaucasesnoves.swpro.movefast.vehicle;

import cat.iespaucasesnoves.swpro.movefast.excepcions.VehicleException;

/**
 *
 * @author Marta Córcoles Valle
 */
public class Furgoneta extends Vehicle{

    private int carrega;

    public Furgoneta(int carrega, String matricula, TipusVehicle tipusVehicle, TipusCanvi tipusCanvi) throws VehicleException {
        super(matricula, tipusVehicle, tipusCanvi);
        this.setCarrega(carrega);
    }

    public int getCarrega() {
        return carrega;
    }

    public void setCarrega(int carrega) {
        try {
            if (carrega <= 7500 && carrega > 1) {
                this.carrega = carrega;
            } else {
                throw new VehicleException(003);
            }
        } catch (VehicleException e) {
            System.out.println(e.getMessage());
        }       
    }

    @Override
    public String toString() {
        return "Furgoneta{" + "carrega=" + carrega + '}';
    }
}
