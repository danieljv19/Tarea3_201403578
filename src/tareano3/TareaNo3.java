package tareano3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TareaNo3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int opcion = 0;
        boolean salir = true;

        while (salir) {
            System.out.println("            Tarea No. 3        ");
            System.out.println("            201403578        ");

            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palíndromas");
            System.out.println("3. Salir");
            System.out.println("Escoge un opción: ");
            opcion = s.nextInt();

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

                case 3: {
                    salir = false;
                    JOptionPane.showMessageDialog(null, "Que tengas un feliz días!!");
                }
                break;

                default:
                    System.out.println("Esa opción no existe");
            }

        }
    }

}
