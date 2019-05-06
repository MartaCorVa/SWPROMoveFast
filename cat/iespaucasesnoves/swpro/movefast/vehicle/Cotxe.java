/*

 */
package cat.iespaucasesnoves.swpro.movefast.vehicle;

/**
 *
 * @author Marta Córcoles Valle
 */
public class Cotxe extends Vehicle {

    private int numPortes;
    private int numPassagers;
    
    public Cotxe(int numPortes, int numPassagers, double preu, String matricula, TipusVehicle tipus, TipusCarnet carnet) {
        super(matricula, tipus, carnet, preu);
        this.numPortes = numPortes;
        this.numPassagers = numPassagers;
    }

    public Cotxe(int numPassagers) {
        this.numPassagers = numPassagers;
        setNumPortes();
    }
       
    public int setNumPortes() {
        switch (numPassagers) {
            case 1:
            case 2:
                numPortes = 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                numPortes = 5;
        }        
        return numPortes;
    }
    
    @Override
    public String toString() {
        return "Cotxe{" + "numPortes=" + numPortes + ", carnet=" + carnet + '}';
    }
}
