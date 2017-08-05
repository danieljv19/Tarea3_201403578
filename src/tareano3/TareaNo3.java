package tareano3;

import java.util.Scanner;

public class TareaNo3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int opcion = 0;

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
        }

    }

}
