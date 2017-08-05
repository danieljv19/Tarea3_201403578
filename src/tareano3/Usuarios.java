package tareano3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Usuarios {

public static String []usuarios = new String[5];

    public Usuarios() {

        int menu = 0;
        Scanner sc = new Scanner(System.in);
         

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

        while (salir) {
            switch (menu) {

                case 1: {

                    for (int i = 0; i < usuarios.length; i++) {

                        usuarios[i] = JOptionPane.showInputDialog(null, "Ingresa un usuario: ");

                    }
                    
                }
                break;

                case 2: {

                   int cont=1;
                   for(int j=0; j<usuarios.length;j++){
                      
                       System.out.println(cont+". "+usuarios[j]);
                       cont++;
                   }
                }
                break;

                case 3: {

                    for(int k=0;k<usuarios.length;k++){
                    JOptionPane.showInputDialog("Ingresa un nombre");
                    
            }
                }
                break;
                case 4: {

                }
                break;
                case 5: {

                    salir = false;
                }
                break;
            }

        }
    }

}
