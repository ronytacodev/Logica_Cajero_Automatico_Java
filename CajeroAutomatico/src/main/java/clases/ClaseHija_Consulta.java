
package clases;

public class ClaseHija_Consulta extends ClasePadre_Abstracta {
    
    @Override
    public void Transacciones() {
        System.out.println("-----------------------------------");
        System.out.println("  Tu saldo actual es: " + getSaldo());
        System.out.println("------------------------------------");
    }
}
