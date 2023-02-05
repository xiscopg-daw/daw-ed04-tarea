/**
 * Proyecto Cuentas, al que se ha asignado al paquete cuentas y dispone de
 * dos clases, la principial (main) y una secundaria que realiza las operaciones
 * en las cuentas llamada (CCuenta).
 */
package cuentas;

public class Main {
    /** 
     * Constructor de la clase principal del proyecto
     * @param args Array de parámetros string como parámetro
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_Cuenta(cuenta1, 0);
    }
    /**
     * Método para realizar las operativas de las cuentas sobre la clase CCuenta
     * @param cuenta1 Clase cuenta sobre la que operará el método
     * @param cantidad Importe de la operación, actualmente no se usa por que 
     *                 solo se tenía que refactorizar y añadir el parámetro, 
     *                 ya que los importes son fijos
     */
    private static void operativa_Cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
