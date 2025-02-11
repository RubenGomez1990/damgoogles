package cuentas;

/** CCuenta es una clase que representa una cuenta bancaria */
public class CCuenta {

    /** Titular de la cuenta */
    private String nombre;
    /** N.º de cuenta*/
    private String cuenta;
    /** Saldo disponible */
    private double saldo;
    /** Interés aplicado sobre el saldo */
    private double tipoInterés;

    /** Esto es un constructor vacío que no debería de estar.  */
    public CCuenta()
    {
    }

    /** CCuenta es una clase que representa una cuenta bancaria, tendrá de parámetros el nombre del titular, n.º de cuenta, saldo e interés.
     * @param nom = nombre cuenta
     * @param cue = numero cuenta
     * @param sal = saldo de la cuenta*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        /* Esto son setters que abreviarán nombre, cuenta y saldo a lo indicado entre paréntesis */
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /** Getter que devolverá un double del estado del saldo de la cuenta
     * @return saldo cuenta disponible.*/
    public double estado()
    {
        return getSaldo();
    }

    /** Metodo por el cual se ingresará dinero en la cuenta y que lanzará un exception si se introduce un número negativo
     * @param cantidad a ingresar
     * @throws Exception si el numero es negativo */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /** Metodo por el cual se retirará dinero de la cuenta
     *
     * @param cantidad que se retirará
     * @throws Exception si la cantidad es negativa o si no hay suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /** getter que devolverá el nombre, no utilizado.
     *
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /** Setter que establecerá que nombre es igual a this.nombre.
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** getter que devolverá el nombre, no utilizado.
     *
     * @return cuenta
     */
    public String getCuenta() {
        return this.cuenta;
    }

    /** setter que a través de un string el numero de cuenta
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Getter que devolverá el saldo actual
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /** setter que a través de un double establecerá un saldo
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** Getter que devolverá el saldo actual
     *
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** setter que a través de un double establecerá un tipo de interés
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
