
 /*
 * @author Erick Barrera 
 * @author Juan Arroyave
 * @date 11- 11 - 2022
 * Interfaz la cual permite ver las opciones del modo
 */
import java.util.ArrayList;

public interface modo_telefono {
    public void conexion(boolean var1);

    public void contactos(ArrayList<contacto> var1);

    public void llamar(ArrayList<contacto> var1);

    public void finalizar();

    public void audio(boolean bl);
}
