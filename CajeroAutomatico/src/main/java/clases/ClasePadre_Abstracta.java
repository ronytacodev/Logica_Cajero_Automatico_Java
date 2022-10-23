package clases;

import java.util.Scanner;

/**
 *
 * @author Rony Taco
 */
public class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Porfavor seleccione una opción:");
                System.out.println("    1.Consulta de saldo.");
                System.out.println("    2.Retiro de efectivo.");
                System.out.println("    3.Depósito de efectivo.");
                System.out.println("    4.Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("-------------------------------------------------");
                }

            } while (bandera == 0);
            
            if(seleccion == 1) {
                
            } else if (seleccion == 2) {
                
            } else if (seleccion == 3) {
                
            } else if (seleccion == 4) {
                System.out.println("--------------------------");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("--------------------------");
                bandera = 2;
            }
            
        } while (bandera != 2);

    }
}
