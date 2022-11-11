 /*
 * @author Erick Barrera 
 * @author Juan Arroyave
 * @date 11- 11 - 2022
 * Clase radio la cual tiene todos sus atributos
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class radio
implements modo_radio,
modo_estado,
modo_productividad,
modo_reproduccion,
modo_telefono,
modo_volumen {
    private Double emisora = 94.5;
    private String tipoEmisora = "FM";
    private String mood = "Apagado";
    private int volumen = 5;
    private int posicion = 1;
    private boolean conectar = false;
    private String audio = "Speaker";
    Scanner scan = new Scanner(System.in);

    @Override
    public void estado(Boolean bl) {
        if (!bl.booleanValue()) {
            this.mood = "Apagada";
        } else if (bl.booleanValue()) {
            this.mood = "Encendida";
        }
        System.out.println("La radio est\u00e1 " + this.mood + "\n");
    }

    @Override
    public void volumen(Boolean bl) {
        if (bl.booleanValue()) {
            ++this.volumen;
        } else if (!bl.booleanValue()) {
            --this.volumen;
        }
        System.out.println("El nuevo volumen est\u00e1 en " + this.volumen);
    }

    @Override
    public String viajes(String string) {
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        int n2 = random.nextInt(10) + 1;
        return  string + " desea ver tarjetas de presentaci\u00f3n " + n + " ingrese al la siguente web " + n2 + "https://www.google.com/search?q=tarjeta+de+presentación+de+viajes&client=opera-gx&hs=BXg&sxsrf=ALiCzsaLt3J81HiMNiqapTwO08SbXDgxrA:1668205553192&source=lnms&tbm=isch&sa=X&ved=2ahUKEwi_5qP7laf7AhUMSDABHfY8DNEQ_AUoAXoECAIQAw&biw=1325&bih=627&dpr=1";
    }

    @Override
    public void cambiar(Boolean bl) {
        if (bl.booleanValue()) {
            this.tipoEmisora = "FM";
            System.out.println("La emisora de radio est\u00e1 en " + this.tipoEmisora + "\n");
        } else if (!bl.booleanValue()) {
            this.tipoEmisora = "AM";
            System.out.println("La emisora de radio est\u00e1 en " + this.tipoEmisora + "\n");
        }
    }

    @Override
    public void cambiar_e(Boolean bl) {
        if (bl.booleanValue()) {
            this.emisora = this.emisora + 0.5;
            System.out.println("La emisora que est\u00e1 escuchando es " + this.emisora + "\n");
        } else if (!bl.booleanValue()) {
            this.emisora = this.emisora - 0.5;
            System.out.println("La emisora que est\u00e1 escuchando es " + this.emisora + "\n");
        }
    }

    @Override
    public void guardar(ArrayList<Double> arrayList, Double d) {
        if (arrayList.size() <= 50) {
            arrayList.add(d);
            System.out.println("La emisora " + d + " fue guardada");
        } else {
            System.out.println("Error la lista esta llena");
        }
    }

    @Override
    public void cargar(ArrayList<Double> arrayList) {
        System.out.println("Ingrese la emisora que desee");
        Double d = this.scan.nextDouble();
        this.scan.nextLine();
        System.out.println("Esta escuchando la emisora " + d + " en la emisora radial " + this.tipoEmisora);
    }

    @Override
    public void seleccionar(ArrayList<cancion> arrayList) {
        int n = 1;
        for (cancion cancion2 : arrayList) {
            System.out.println("-" + n + ". " + cancion2.getNombre() + ", artista: " + cancion2.getAutor() + "(" + cancion2.getGenero() + ")");
        }
    }

    @Override
    public void cambiar_c(Boolean bl, ArrayList<cancion> arrayList) {
        if (bl.booleanValue()) {
            ++this.posicion;
            if (this.posicion == arrayList.size()) {
                this.posicion = 0;
                System.out.println("Se seleccion\u00f3 la canci\u00f3n " + arrayList.get(this.posicion).getNombre());
            }
        } else if (this.posicion == 0) {
            this.posicion = arrayList.size() - 1;
            System.out.println("Se seleccion\u00f3 la canci\u00f3n " + arrayList.get(this.posicion).getNombre());
        } else {
            --this.posicion;
            System.out.println("Se seleccion\u00f3 la canci\u00f3n " + arrayList.get(this.posicion).getNombre());
        }
    }

    @Override
    public void escuchar(ArrayList<cancion> arrayList) {
        System.out.println("Reproduciendo " + arrayList.get(this.posicion).mostrar());
    }

    @Override
    public void conexion(boolean bl) {
        String string = "";
        string = bl ? "El telefono esta conectado" : "El telefono esta desconectado";
        this.conectar = bl;
        System.out.println(string);
    }

    @Override
    public void contactos(ArrayList<contacto> arrayList) {
        int n = 1;
        for (contacto contacto2 : arrayList) {
            System.out.println(n + ". " + contacto2.toString());
            ++n;
        }
    }

    @Override
    public void llamar(ArrayList<contacto> arrayList) {
        int n = 1;
        for (contacto contacto2 : arrayList) {
            System.out.println(n + ". " + contacto2.toString());
            ++n;
        }
        System.out.println("Escoja un contacto a llamar");
        int n2 = this.scan.nextInt() - 1;
        this.scan.nextLine();
        System.out.println("Llamando a " + arrayList.get(n2).getNombre() + " al numero " + arrayList.get(n2).getNumero());
    }

    @Override
    public void finalizar() {
        System.out.println("La llamada se finaliz\u00f3");
    }

    @Override
    public void audio(boolean bl) {
        this.audio = bl == true ? "Lammando " : " no se pudo llamar";
        System.out.println("En modo: " + this.audio);
    }
}
