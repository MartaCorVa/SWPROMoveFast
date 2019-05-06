/*

 */
package cat.iespaucasesnoves.swpro.movefast.vehicle;

/**
 *
 * @author Marta Córcoles Valle
 */
public class Motocicleta extends Vehicle {

    private int cilindrada;

    public Motocicleta(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Motocicleta(int cilindrada, String matricula, TipusVehicle tipus, TipusCarnet carnet, double preu) {
        super(matricula, tipus, carnet, preu);
        this.cilindrada = cilindrada;
    }   

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "cilindrada=" + cilindrada + '}';
    }
    
}
