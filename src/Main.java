import com.calata.Busqueda;
import com.calata.Divisor;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.printf("El Resuktado es: %d\n",Divisor.dividirIterativo(17,8));
        int[] misNumeros = {1,2,3,4,5,6,9,10,49};
        //ArrayList misNumeros = new ArrayList<>(Arrays.asList(misNumerosAr));
        //System.out.println(misNumeros.subList(0,4));
        /*System.out.printf("El Resuktado es: %b\n", Busqueda.busquedaBinariaLista(misNumeros,0,misNumerosAr.length,-4)); //false
        System.out.printf("El Resuktado es: %b\n", Busqueda.busquedaBinariaLista(misNumeros,0,misNumerosAr.length,5)); //true
        System.out.printf("El Resuktado es: %b\n", Busqueda.busquedaBinariaLista(misNumeros,0,2,5)); //false
        System.out.printf("El Resuktado es: %b\n", Busqueda.busquedaBinariaLista(misNumeros,0,1,5)); //false
        System.out.printf("El Resuktado es: %b\n", Busqueda.busquedaBinariaLista(misNumeros,6,misNumerosAr.length,5)); //false
        System.out.printf("El Resuktado es: %b\n", Busqueda.busquedaBinariaLista(misNumeros,1,5,5)); //true
        System.out.printf("El Resuktado es: %b\n", Busqueda.busquedaBinariaLista(misNumeros,0,misNumerosAr.length,50)); //false */

        System.out.printf("El Resuktado es: %d\n", Busqueda.busquedaBinariaCalata(misNumeros,0,misNumeros.length,-4)); //false
        System.out.printf("El Resuktado es: %d\n", Busqueda.busquedaBinariaCalata(misNumeros,0,misNumeros.length,5)); //true
        System.out.printf("El Resuktado es: %d\n", Busqueda.busquedaBinariaCalata(misNumeros,0,2,5)); //false
        System.out.printf("El Resuktado es: %d\n", Busqueda.busquedaBinariaCalata(misNumeros,0,1,5)); //false
        System.out.printf("El Resuktado es: %d\n", Busqueda.busquedaBinariaCalata(misNumeros,6,misNumeros.length,5)); //false
        System.out.printf("El Resuktado es: %d\n", Busqueda.busquedaBinariaCalata(misNumeros,1,5,5)); //true
        System.out.printf("El Resuktado es: %d\n", Busqueda.busquedaBinariaCalata(misNumeros,0,misNumeros.length,50)); //false

    }
}
