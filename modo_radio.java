 /*
 * @author Erick Barrera 
 * @author Juan Arroyave
 * @date 11- 11 - 2022
 * Interfaz la cual permite ver las fuciones del modo radio
 */
import java.util.ArrayList;

public interface modo_radio {
    public void cambiar(Boolean var1);

    public void cambiar_e(Boolean var1);

    public void guardar(ArrayList<Double> var1, Double var2);

    public void audio(ArrayList<Double> var1);
}
