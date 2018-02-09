import java.util.ArrayList;
import java.util.Iterator;

/**
 * R481 - Usando clases wrapper para ordenar numeros de mayor a menor.
 *
 * @author D4s1ns
 * @version 2018/02/09
 */
class EjercicioR481 {
    public String devolverEnOrden(ArrayList<Integer> numeros) {
        String cadenaADevolver = "";
        ArrayList<Integer> copiaNumeros = new ArrayList<>(numeros);
        while(copiaNumeros.size() > 0) {
            Integer mayorNumero = copiaNumeros.get(0);
            for(int i = 1; i < copiaNumeros.size(); i++) {
                Integer numeroActual = copiaNumeros.get(i);
                if(numeroActual > mayorNumero) {
                    mayorNumero = numeroActual;
                }
            }
            cadenaADevolver += mayorNumero + ", ";
            copiaNumeros.remove(mayorNumero);
        }
        if(cadenaADevolver.length() > 0) {
            cadenaADevolver = cadenaADevolver.substring(0,cadenaADevolver.length() - 2);
        }
        return cadenaADevolver;
    }
}
