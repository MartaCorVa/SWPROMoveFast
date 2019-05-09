/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.swpro.movefast.client;

import cat.iespaucasesnoves.swpro.movefast.vehicle.TipusCarnet;
import com.sun.tools.javac.Main;
import java.util.ArrayList;

/**
 *
 * @author Esteve SC
 */
public class Esteve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<TipusCarnet> carnets = new ArrayList<>();
        System.out.println(carnets.isEmpty());
        carnets.add(TipusCarnet.A2);
        carnets.add(TipusCarnet.B);
        carnets.add(TipusCarnet.C);
        carnets.add(TipusCarnet.C1);
        System.out.println(carnets.isEmpty());
        System.out.println(carnets.size());

        //lo mes normal es fer el ArrayList que llisti els carnets que te aquella persona. - Així sebra quin tipus de vehicles podrà alquilar.
        //a casual si el tipusPagament es Metalic aunque li posis algo al camp numTargeta, sempre serà null.
        Casual prova1 = new Casual(TipusPagament.METALIC, "1819", "78218593L", "Esteve Seguí Casas", carnets, TipusClient.CASUAL);
        Casual prova2 = new Casual(TipusPagament.TARGETA, "4485715860868875", "89647252J", "M.Antonia Olivares Cornella", carnets, TipusClient.CASUAL);
        Leasing prova3 = new Leasing("ES6621000418401234567891", "85558233G", "PALMAPICTURES", "14256598P", "David Bowie C.", carnets, TipusClient.CASUAL);
        
        System.out.println(prova1);
        System.out.println(prova2);
        System.out.println(prova3);
    }

}
