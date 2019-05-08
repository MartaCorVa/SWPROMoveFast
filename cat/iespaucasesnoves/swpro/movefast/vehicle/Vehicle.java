/*

 */

package cat.iespaucasesnoves.swpro.movefast.vehicle;

/**
 *
 * @author Marta Córcoles Valle
 */
public class Vehicle {

    protected String matricula;
    protected TipusVehicle tipus;
    protected TipusCarnet carnet;
    protected double preu;

    public Vehicle() {
    }  

    public Vehicle(String matricula, TipusVehicle tipus, TipusCarnet carnet, double preu) {
        this.matricula = matricula;
        this.tipus = tipus;
        this.carnet = carnet;
        this.preu = preu;
    }      

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipusVehicle getTipus() {
        return tipus;
    }
    
    public TipusCarnet getCarnet() {
        if (tipus == TipusVehicle.MOTOCICLETA) {
            
        }
        return carnet;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "matricula=" + matricula + ", tipus=" + tipus + ", carnet=" + carnet + ", preu=" + preu + '}';
    }
   
    
}
