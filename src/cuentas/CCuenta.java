/**
 * Comentario JavaDoc para indicar que CCuenta es una clase para realizar 
 * pruebas de la Tarea ED04 y que también se usó para de ED03.
 */
package cuentas;

/**
 * Clase de cuentas para realizar ingresos y retiradas
 * <p>
 * Esta clase será utilizar por el main para realizar pruebas de la tarea de ED04.
 * Se han realizado cambios y refactorización
 * <p>
 * Las lineas de aquí son para tener más explicación
 * y separan del html por saltos de párrafos.
 * 
 * @author Xisco Pérez
 * @version 1.1
 * @since   1.0
 */
public class CCuenta {

   /** 
    * Variables pricadas de la clase que serán utilizados como atributos mediante su setter y getter
    */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Constructor por defecto de la clase CCuenta, no usar por que no se 
     * implementa. Mejor usar {@link #CCuenta(java.lang.String, java.lang.String, double, double)} ·
     *  
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta
     * @param nom Nombre del propietario de la cuenta
     * @param cue Número de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de Interés
     */
        public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
   /**
    * Método para obtener el saldo.
    * @return Devuelve el saldo de la cuenta
    */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Método para realizar los ingresos en la cuenta
     * @param cantidad  Importe con la cantidad a ingresar
     * @throws Exception Lanza una excepción si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
   /**
    * Método para realizar las retiradas de la cuenta.
    * @param cantidad  Importe con la cantidad a retirar
    * @throws Exception Lanza una excepción si el importe es negativo.
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método getter para obtener el nombre del propietario de la cuenta
     * @return El nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del propietario de la cuenta
     * @param nombre Nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener el número de la cuenta
     * @return El número de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setter para establecer el número de la cuenta
     * @param cuenta Número de cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getter para obtener el saldo actual
     * @return El saldoo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setter para establece el saldo de la cuenta
     * @param saldo Importe para establecer como saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getter para obtener el tipo de interés.
     * @return El tipo de interés actual
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setter para establece el tipo de interés de la cuenta
     * @param tipoInterés El tipo de interés para establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
