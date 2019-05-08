/*

 */

package cat.iespaucasesnoves.swpro.movefast.vehicle;

import cat.iespaucasesnoves.swpro.movefast.excepcions.VehicleException;
import static cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCarnet.A2;
import static cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCarnet.B;
import static cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCarnet.C;
import static cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCarnet.C1;
import java.util.Objects;

/**
 *
 * @author Marta Córcoles Valle
 */
public class Vehicle {

    private String matricula;
    private TipusVehicle tipusVehicle;
    protected TipusCarnet carnet;
    protected TipusCanvi tipusCanvi;
    protected double preu;
    
    public Vehicle(String matricula, TipusVehicle tipusVehicle, TipusCanvi tipusCanvi) throws VehicleException {
        this.setMatricula(matricula);
        this.tipusVehicle = tipusVehicle;
        this.tipusCanvi = tipusCanvi;
        this.setCarnet(carnet);
        this.setPreu(preu);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) throws VehicleException {
        try {
            if (matricula.length() == 7) {
                this.matricula = matricula;
            } else {
                throw new VehicleException(001);
            }
        } catch (VehicleException e) {
            System.out.println(e.getMessage());
        }
    }

    public TipusVehicle getTipusVehicle() {
        return tipusVehicle;
    }

    public TipusCanvi getTipusCanvi() {
        return tipusCanvi;
    }

    public void setTipusCanvi(TipusCanvi tipusCanvi) {
        this.tipusCanvi = tipusCanvi;
    }
    
    public TipusCarnet getCarnet() {
        return carnet;
    }

    public TipusCarnet setCarnet(TipusCarnet carnet) {
        switch(tipusVehicle) {
            case COTXE:
                this.carnet = B;
                break;
            case MOTOCICLETA:
                this.carnet = A2;
                break;
            case FURGONETA:
                this.carnet = C;
                break;
            case CAMIO:
                this.carnet = C1;
                break;
        }
        return carnet;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        switch(tipusVehicle) {
            case COTXE:
                this.preu = 30;
                break;
            case MOTOCICLETA:
                this.preu = 40;
                break;
            case FURGONETA:
                this.preu = 60;
                break;
            case CAMIO:
                this.preu = 120;
                break;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.matricula);
        hash = 23 * hash + Objects.hashCode(this.tipusVehicle);
        hash = 23 * hash + Objects.hashCode(this.carnet);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.preu) ^ (Double.doubleToLongBits(this.preu) >>> 32));
        return hash;
    }

    @Override
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
        final Vehicle other = (Vehicle) obj;
        if (Double.doubleToLongBits(this.preu) != Double.doubleToLongBits(other.preu)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (this.tipusVehicle != other.tipusVehicle) {
            return false;
        }
        if (this.carnet != other.carnet) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Vehicle{" + "matricula=" + matricula + ", tipusVehicle=" + tipusVehicle + ", carnet=" + carnet + ", preu=" + preu + '}';
    }
   
    
}
