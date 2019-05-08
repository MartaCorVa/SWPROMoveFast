/*

 */
package cat.iespaucasesnoves.swpro.movefast.vehicle;

import cat.iespaucasesnoves.swpro.movefast.excepcions.VehicleException;

/**
 *
 * @author Marta Córcoles Valle
 */
public class Cotxe extends Vehicle {

    private int numPortes;
    private int numPassatgers;

    public Cotxe(String matricula, TipusVehicle tipusVehicle, TipusCanvi tipusCanvi, int numPassatgers) throws VehicleException {
        super(matricula, tipusVehicle, tipusCanvi);
        this.setNumPortes(numPassatgers);
        this.setNumPassatgers(numPassatgers);
    }

    public void setNumPassatgers(int numPassatgers) {
        try {
            if (numPassatgers >= 1 && numPassatgers <= 7) {
                this.numPassatgers = numPassatgers;
            } else {
                throw new VehicleException(002);
            }
        } catch (VehicleException e) {
            System.out.println(e.getMessage());
        }
    }
       
    public void setNumPortes(int numPassatgers) {
        switch (numPassatgers) {
            case 1:
            case 2:
                this.numPortes = 3;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                this.numPortes = 5;
                break;
        }        
    }
    
    @Override
    public String toString() {
        return "Cotxe{" + "numPortes=" + numPortes + ", carnet=" + carnet + ", numPassatgers=" + numPassatgers + '}';
    }
}
