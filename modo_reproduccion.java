 /*
 * @author Erick Barrera 
 * @author Juan Arroyave
 * @date 11- 11 - 2022
 * Interfaz la cual permite ver las funciones del modo reproduccion
 */

import java.util.ArrayList;

public interface modo_reproduccion {
    public void seleccionar(ArrayList<cancion> var1);

    public void cambiar_c(Boolean var1, ArrayList<cancion> var2);

    public void escuchar(ArrayList<cancion> var1);
    
}
