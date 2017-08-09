package tareano3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Usuarios {

    public static String[] usuarios = new String[4];
    public static Scanner sc = new Scanner(System.in);
    public static int opcion = 0;

    public Usuarios() {

    }

    public void Menu() {

        int menu = 0;
        boolean salir = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú de Usuarios");
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar todos los usuarios");
        System.out.println("3. Mostrar un usuario personalizado");
        System.out.println("4. Menú Principal");
        System.out.println("5. Salir");
        System.out.println("Escoge un opción: ");
        menu = sc.nextInt();

        switch (menu) {

            case 1: {

                for (int i = 0; i < usuarios.length; i++) {

                    usuarios[i] = JOptionPane.showInputDialog(null, "Ingresa un usuario: ");

                }

                System.out.println("Menú de Usuarios");
                System.out.println("1. Ingresar Usuarios");
                System.out.println("2. Mostrar todos los usuarios");
                System.out.println("3. Mostrar un usuario personalizado");
                System.out.println("4. Menú Principal");
                System.out.println("5. Salir");
                System.out.println("Escoge un opción: ");
                menu = sc.nextInt();

                switch (menu) {

                    case 2: {
                        for (int i = 0; i < usuarios.length; i++) {
                            System.out.println(usuarios[i]);
                        }
                    }
                    break;

                    default: {
                        System.out.println("Esa opción no existe");
                    }
                }
                System.out.println("Menú de Usuarios");
                System.out.println("1. Ingresar Usuarios");
                System.out.println("2. Mostrar todos los usuarios");
                System.out.println("3. Mostrar un usuario personalizado");
                System.out.println("4. Menú Principal");
                System.out.println("5. Salir");
                System.out.println("Escoge un opción: ");
                menu = sc.nextInt();

                switch (menu) {

                    case 3: {

                        for (int i = 0; i < usuarios.length; i++) {

                            if (JOptionPane.showInputDialog("Buscar nombre: ").equals(usuarios[i])) {
                                JOptionPane.showMessageDialog(null, usuarios[i]);
                            } else {
                                JOptionPane.showInternalMessageDialog(null, "ERROR!! No existe ningún usuario con esa coincidencia");
                            }
                        }
                    }
                    break;

                    case 2: {
                        System.out.println("Tienes que elegir la opción 1");

                    }
                    break;
                }

            }
            break;
            case 4: {
                //MENÚ PRINCIPAL PENDIENTE

                System.out.println("            Tarea No. 3        ");
                System.out.println("            201403578        ");

                System.out.println("1. Usuarios");
                System.out.println("2. Palabras Palíndromas");
                System.out.println("3. Salir");
                System.out.println("Escoge un opción: ");
                opcion = sc.nextInt();

                switch (opcion) {

                    case 1: {

                        Usuarios usuario = new Usuarios();
                        usuario.Menu();
                    }
                    break;
                    case 2: {

                        String palabra = JOptionPane.showInputDialog("Escribe una palabra: ");

                        int cont = 1;
                        for (int i = 0; i < palabra.length(); i++) {

                            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                                cont = 0;
                                break;
                            }
                        }
                        System.out.println(cont == 1 ? "La palabra es palídroma " : "La palabra no es palíndroma");

                    }
                    break;

                    default:
                        System.out.println("Esa opción no existe");
                }
            }
                break;

                case 5: {

                salir = false;
            }
            break;
        }

    }

}

