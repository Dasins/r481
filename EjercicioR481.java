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
        if(numeros.size() > 0) { 
            ArrayList<Integer> copiaNumeros = new ArrayList<>(numeros);
            boolean detector = true; // Detecta si se ejecuta el if.
            while(detector) {
                detector = false;
                for(int i = 0; i < copiaNumeros.size() - 1; i++) {
                    if(copiaNumeros.get(i) < copiaNumeros.get(i + 1)) {
                        int temp = copiaNumeros.get(i);
                        copiaNumeros.set(i, copiaNumeros.get(i + 1));
                        copiaNumeros.set(i + 1, temp);
                        detector = true;
                    } 
                }
            }
            for(Integer numero : copiaNumeros){
                cadenaADevolver += numero + ", ";
            }
        }
        if(cadenaADevolver.length() > 0) {
            cadenaADevolver = cadenaADevolver.substring(0,cadenaADevolver.length() - 2);
        }
        return cadenaADevolver;
    }
}
