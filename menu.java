import java.util.Scanner;

public class menu {
    static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipal() {
        int goku;

        do {
            System.out.println("·········································································");
            System.out.println("                                  Menú                                   ");
            System.out.println("                                                                         ");
            System.out.println("Ejercicio 1.............................................................1");
            System.out.println("Ejercicio 2.............................................................2");
            System.out.println("Ejercicio 3.............................................................3");
            System.out.println("Ejercicio 4.............................................................4");
            System.out.println("Ejercicio 5.............................................................5");
            System.out.println("Ejercicio 6.............................................................6");
            System.out.println("Ejercicio 7.............................................................7");
            System.out.println("Ejercicio 8.............................................................8");
            System.out.println("Ejercicio 9.............................................................9");
            System.out.println("Salir .................................................................10");
            System.out.println("                                                                         ");
            System.out.println("·········································································");
            System.out.print("Elija opción: ");

            goku = scanner.nextInt();

            switch (goku) {
                case 1:
                    ejercicio.ejercicio1();
                    break;

                case 2:
                    ejercicio.ejercicio2();
                    break;

                case 3:
                    ejercicio.ejercicio3();
                    break;

                case 4:
                    ejercicio.ejercicio4();
                    break;

                case 5:
                    ejercicio.ejercicio5();
                    break;
                    
                case 6:
                    ejercicio.ejercicio6();
                    break;
                
                case 7:
                    ejercicio.ejercicio7();
                    break;

                case 8:
                    ejercicio.ejercicio8();
                    break;

                case 9:
                    ejercicio.ejercicio9();
                    break;

                case 10:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida (1-5).");
            }
        } while (goku != 10);

        scanner.close();
    }
}