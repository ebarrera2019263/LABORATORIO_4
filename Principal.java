import java.util.ArrayList;
import java.util.Scanner;

public class principal {

    
    /*
 * @author Erick Barrera 
 * @author Juan Arroyave
 * @date 11- 11 - 2022
 * Clase principal para poder interactuar con la radio
 */
    public static void main(String[] stringArray) {
        int n = 0;
        radio radio2 = new radio();
        boolean bl = false;
        ArrayList<Double> arrayList = new ArrayList<Double>();
        ArrayList<cancion> arrayList2 = new ArrayList<cancion>();
        ArrayList<cancion> arrayList3 = new ArrayList<cancion>();
        ArrayList<cancion> arrayList4 = new ArrayList<cancion>();
        arrayList2.add(new cancion("Bonito", "3:00", "Jarabe de Palo", "Pop"));
        arrayList2.add(new cancion("Flip", "3:43", "Glass Animals", "Pop"));
        arrayList2.add(new cancion("Cabinet Man", "4:23", "Lemon Demon", "Synth Pop"));
        arrayList3.add(new cancion("Is This What You Can Not Do", "4:46", "Gold Celeste", "Alternativo"));
        arrayList3.add(new cancion("Pink Showers", "2:33", "Deeper", "Alternativo"));
        arrayList3.add(new cancion("Dirty Mouth", "2:54", "Alice Phoebe Lou", "Alternativo"));
        arrayList4.add(new cancion("The Pyre", "3:40", "Kronowski", "Heavy Metal"));
        arrayList4.add(new cancion("White Flag", "3:40", "Fall of Envy", "Heavy Metal"));
        arrayList4.add(new cancion("The River Flows", "4:20", "Everture", "Rock Alternativo"));
        ArrayList<contacto> arrayList5 = new ArrayList<contacto>();
        arrayList5.add(new contacto("Jose", "12345678"));
        arrayList5.add(new contacto("Pedro", "23145678"));
        arrayList5.add(new contacto("Melisa", "34567812"));
        arrayList5.add(new contacto("Karen", "1234567"));
        arrayList5.add(new contacto("Fernando", "32456788"));
      
     
        Scanner scanner = new Scanner(System.in);
        String string = "------ Menu de selecci\u00f3n ------ \n \u00bfQu\u00e9 desea hacer el d\u00eda de hoy? \n-------------------------------- \n1. Encender/Apagar el radio \n2. Cambiar volumen \n3. Programar modo radio \n4. Programar modo reproduccion \n5. Programar modo telefono \n6. Programar modo productividad \n7. Salir \nIngrese el n\u00famero de la opcion que desea";
        System.out.println(string);
        n = scanner.nextInt();
        scanner.nextLine();
        while (n < 7 && n >= 1) {
            switch (n) {
                case 1: {
                    System.out.println("\u00bfDeseas encender o apagar la radio? 1. Encender 2. Apagar");
                    int n2 = scanner.nextInt();
                    scanner.nextLine();
                    bl = n2 == 1;
                    radio2.estado(bl);
                    break;
                }
                case 2: {
                    int n3;
                    if (bl) {
                        System.out.println("\u00bfDeseas subir o bajar el volumen? 1. Subir 2. Bajar");
                        int n4 = scanner.nextInt();
                        scanner.nextLine();
                        n3 = 0;
                        n3 = n4 == 1 ? 1 : 0;
                        radio2.volumen(n3 != 0);
                        break;
                    }
                    System.out.println("La Radio est\u00e1 apagada no puede realizar esta acci\u00f3n \n");
                    break;
                }
                case 3: {
                    int n3;
                    if (bl) {
                        String string2 = "--Menu de selecci\u00f3n-- \n--------------------- \n1. Cambiar de emisora radial FM/AM \n2. Cambiar de emisora \n3. Guardar emisora \n4. Cargar emisora \n5. Salir \nIngrese el numero de la opcion que desea";
                        System.out.println(string2);
                        n3 = scanner.nextInt();
                        scanner.nextLine();
                        while (n3 < 5 && n >= 1) {
                            boolean bl2;
                            int n5;
                            if (n3 == 1) {
                                System.out.println("\u00bfDeseas cambiar a FM o AM? 1. FM 2. AM");
                                n5 = scanner.nextInt();
                                scanner.nextLine();
                                bl2 = false;
                                bl2 = n5 == 1;
                                radio2.cambiar(bl2);
                            }
                            if (n3 == 2) {
                                System.out.println("\u00bfDeseas cambiar emisora hacia arriba o abajo? 1. Arriba 2. Abajo");
                                n5 = scanner.nextInt();
                                scanner.nextLine();
                                bl2 = false;
                                bl2 = n5 == 1;
                                radio2.cambiar_e(bl2);
                            }
                            if (n3 == 3) {
                                System.out.println("\u00bfQu\u00e9 emisora deseas guardar? Ingresala ");
                                double d = scanner.nextDouble();
                                radio2.guardar(arrayList, d);
                            }
                            if (n3 == 4) {
                                radio2.cargar(arrayList);
                            }
                            System.out.println(string2);
                            n3 = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;
                    }
                    System.out.println("La Radio est\u00e1 apagada no puede realizar esta acci\u00f3n \n");
                    break;
                }
                case 4: {
                    int n3;
                    if (bl) {
                        String string3 = "--Menu de selecci\u00f3n-- \n--------------------- \n1. Seleccionar una lista de reproducci\u00f3n \n2. Cambiar Canci\u00f3n \n3. Escuchar canci\u00f3n \n4. Salir \nIngrese el numero de la opcion que desea";
                        System.out.println(string3);
                        n3 = scanner.nextInt();
                        scanner.nextLine();
                        ArrayList<cancion> arrayList6 = new ArrayList<cancion>();
                        arrayList6 = null;
                        while (n3 < 4 && n3 >= 1) {
                            if (n3 == 1) {
                                System.out.println("\u00bfQu\u00e9 Playlist deseas escuchar? 1. Pop 2. Alternativo 3. Rock ");
                                double d = scanner.nextDouble();
                                if (d == 1.0) {
                                    arrayList6 = arrayList2;
                                    radio2.seleccionar(arrayList6);
                                }
                                if (d == 2.0) {
                                    arrayList6 = arrayList3;
                                    radio2.seleccionar(arrayList6);
                                }
                                if (d == 3.0) {
                                    arrayList6 = arrayList4;
                                    radio2.seleccionar(arrayList6);
                                }
                            }
                            if (n3 == 2) {
                                System.out.println("\u00bfDeseas cambiar hacia adelante o hacia atr\u00e1s? 1. Adelante 2. Atr\u00e1s");
                                int n6 = scanner.nextInt();
                                scanner.nextLine();
                                boolean bl3 = false;
                                bl3 = n6 == 1;
                                radio2.cambiar_c(bl3, arrayList6);
                            }
                            if (n3 == 3) {
                                radio2.escuchar(arrayList6);
                            }
                            System.out.println(string3);
                            n3 = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;
                    }
                    System.out.println("La Radio est\u00e1 apagada no puede realizar esta acci\u00f3n \n");
                    break;
                }
                case 5: {
                    int n3;
                    if (bl) {
                        String string4 = "--Menu de selecci\u00f3n-- \n--------------------- \n1. Conectar/Desconectar t\u00e9lefono \n2. Mostrar Ccntactos \n3. Llamar \n4. Finalizar llamada \n5. Llamar al ultimo contacto que se hablo \n6. Salir \n Ingrese el numero de la opcion que desea";
                        System.out.println(string4);
                        n3 = scanner.nextInt();
                        scanner.nextLine();
                        while (n3 < 6 && n3 >= 1) {
                            boolean bl4;
                            int n7;
                            if (n3 == 1) {
                                System.out.println("\u00bfDeseas conectar o desconectar tu t\u00e9lefono? 1. Conectar 2. Desconectar");
                                n7 = scanner.nextInt();
                                scanner.nextLine();
                                bl4 = false;
                                bl4 = n7 == 1;
                                radio2.conexion(bl4);
                            }
                            if (n3 == 2) {
                                radio2.contactos(arrayList5);
                            }
                            if (n3 == 3) {
                                radio2.llamar(arrayList5);
                            }
                            if (n3 == 4) {
                                radio2.finalizar();
                            }
                            if (n3 == 5) {
                                System.out.println("\u00bfDeseas realizar la llamada ? 1. si 2. no");
                                n7 = scanner.nextInt();
                                scanner.nextLine();
                                bl4 = false;
                                bl4 = n7 == 1;
                                radio2.audio(bl4);
                            }
                            System.out.println(string4);
                            n3 = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;
                    }
                    System.out.println("La Radio est\u00e1 apagada no puede realizar esta acci\u00f3n \n");
                    break;
                }
                case 6: {
                    if (bl) {
                        System.out.println("desea ver tarjetas de presentacion escriba  si o  no");
                        String string5 = scanner.nextLine();
                        System.out.println(radio2.viajes(string5));
                        break;
                    }
                    System.out.println("La Radio est\u00e1 apagada no puede realizar esta acci\u00f3n \n");
                }
            }
            System.out.println(string);
            n = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
