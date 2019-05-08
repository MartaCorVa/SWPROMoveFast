/*

 */
package cat.iespaucasesnoves.swpro.movefast.vehicle;

import cat.iespaucasesnoves.swpro.movefast.excepcions.VehicleException;

/**
 *
 * @author Marta Córcoles Valle
 */
public class Camio extends Vehicle {

    private int tara;
    private int rodes;
    private int eixos;

    public Camio(int tara, String matricula, TipusVehicle tipusVehicle, TipusCanvi tipusCanvi) throws VehicleException {
        super(matricula, tipusVehicle, tipusCanvi);
        this.setTara(tara);
        this.setEixos(eixos);        
        this.setRodes(rodes);
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        try {
            if (tara <= 31000 && tara > 1) {
                this.tara = tara;
            } else {
                throw new VehicleException(004);
            }
        } catch (VehicleException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getRodes() {
        return rodes;
    }

    public void setRodes(int rodes) {
        switch (eixos) {
            case 2:
                this.rodes = 4;
                break;
            case 3:
                this.rodes = 6;
                break;
            case 4:
                this.rodes = 8;
                break;
        }
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if (tara > 1 && tara <= 18000) {
            this.eixos = 2;
        } else if (tara > 18000 && tara <= 25000) {
            this.eixos = 3;
        } else {
            this.eixos = 4;
        }
    }

    @Override
    public String toString() {
        return "Camio{" + "tara=" + tara + ", rodes=" + rodes + ", eixos=" + eixos + '}';
    }
}
