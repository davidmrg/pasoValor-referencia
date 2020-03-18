/*
Este código es educacional para demostrar el paso de parámetros por referencia y por valor
El paso de un parámetro por referencia: Significa que cuando un argumento se pasa a un método, este recibe la posición de memoria del valor original y no una copia del valor.
Si el método modifica al parámetro, el valor original en la copia del código que llamó a la función, cambia.
Sin embargo en Java, esto no aplica a ciertos tipos de datos (Por ejemplo, los primitivos). 
El paso de un parámetro por valor: Significa que la función recibe una copia del dato y aunque se realicen modificaciones, el dato queda intacto. 
*/

package pasoxvaloryref;

import java.util.ArrayList;
import java.util.List;

public class PasoXvaloryRef {
 
    public static void main(String[] args) {
        int a=0;
        System.out.println("el int a antes de enviarlo a la función: " + a);
        funcion_int(a);
        System.out.println("el int a después de enviarlo a la función: " + a); 
        //el método no modifica por que es un apuntador. (Paso de parámetros por referencia)
        
        List<Integer> Numeros;
        Numeros = new ArrayList<>();
        //agregamos 3 elementos a la lista:
        Numeros.add(1);
        Numeros.add(30);
        Numeros.add(20);
        System.out.println("la lista antes de enviar a la función: " + Numeros);
        funcion_list(Numeros);
        System.out.println("la lista después de enviar a la función: " + Numeros);
        //la lista se modifica por que en este tipo de datos ocurre un paso de parámetros por valor. (Es decir, se hace una copia del parámetro y no un puntero).
    }
    
    public static void funcion_int(int a){
    a=1;
    }
    
    public static void funcion_list(List<Integer> Numeros){
    Numeros.addAll(Numeros);
    //el método addAll agrega nuevamente todos los elementos. Se modifica la lista.
    }
}
