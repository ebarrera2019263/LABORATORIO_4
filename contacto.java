 /*
 * @author Erick Barrera 
 * @author Juan Arroyave
 * @date 11- 11 - 2022
 * Clase contacto para crear contactos en un arraylist
 */


public class contacto {
    private String nombre;
    private String numero;


    public contacto() {
        this.nombre = "";
        this.numero = "";     
    }
    public contacto(String string, String string2) {
        this.nombre = string;
        this.numero = string2;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String string) {
        this.nombre = string;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String string) {
        this.numero = string;
    }

    public String toString() {
        return "Nombre:" + this.getNombre() + "\nN\u00famero: " + this.getNumero() + "\n";
    }


    
}
