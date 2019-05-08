/*

 */
package cat.iespaucasesnoves.swpro.movefast.excepcions;

/**
 *
 * @author Marta
 */
public class VehicleException extends Exception {

    private int codi;

    public VehicleException(int codi) {
        super();
        this.codi = codi;
    }

    @Override
    public String getMessage() {

        String miss = "";

        switch(codi) {
            case 001:
                System.out.println("Error 001 Matrícula incorrecta");
                break;
            case 002:
                System.out.println("Error 002 Nombre de passagers incorrecte");
                break;
            case 003:
                System.out.println("Error 003 Càrrega incorrecta");
                break;
            case 004:
                System.out.println("Error 004 Tara incorrecta");
                break;
            case 005:
                System.out.println("Error 005 Cilindrada incorrecta");
        }
        
        return miss;
    }
}
