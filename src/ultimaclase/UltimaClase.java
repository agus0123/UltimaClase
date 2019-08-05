/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimaclase;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Punto Digital
 */
public class UltimaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean esMayorDeEdad;
        int edad = 20;
        ArrayList<String> lista = new ArrayList<>();
        esMayorDeEdad = (edad > 18) ? true : false;
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        lista.add("cinco");
        lista.add("seis");

        Iterator i = lista.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        /*  if(edad>18){
        esMayorDeEdad= true;
        }
        else {
            esMayorDeEdad= false;
        }
         */
    }

}
