package cuentas;

/**
 * Representa una cuenta bancaria con un titular, un numero de cuenta, un saldo y un tipo de interes.
 */
public class CCuenta {

    /**
     * Nombre del titular.
     */
    private String nombre;

    /**
     * Numero identificador de la cuenta.
     */
    private String cuenta;

     /**
      * Saldo actual.
      */
    private double saldo;

     /**
      * Tipo de interes de la cuenta.
      */
    private double tipoInteres;

     /**
      * Constructor sin parametros.
      */
    public CCuenta()
    {
    }

    /**
     * Constructor con parametros para crear una cuenta bancaria.
     *
     * @param nom nombre del titular de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo inicial de la cuenta
     * @param tipo tipo de interes de la cuenta
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Obtiene el nombre del titular.
     *
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del titular.
     *
     * @param nombre nuevo nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el numero de cuenta.
     *
     * @return numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica el numero de cuenta.
     *
     * @param cuenta nuevo numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual.
     *
     * @return saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo de la cuenta.
     *
     * @param saldo nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interes.
     *
     * @return tipo de interes de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Modifica el tipo de interes.
     *
     * @param tipoInteres nuevo tipo de interes
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return saldo actual
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad cantidad que se desea ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad cantidad que se desea retirar
     * @throws Exception si la cantidad es negativa o si no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
