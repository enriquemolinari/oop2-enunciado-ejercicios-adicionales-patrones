package ejercicio4;

import java.time.Year;

public abstract class Empleado {
    private boolean esCasado;
    private int cantidadHijos;
    private Year anioIngreso;

    protected Empleado(boolean esCasado, int cantidadHijos, Year anioIngreso) {
        this.esCasado = esCasado;
        this.cantidadHijos = cantidadHijos;
        this.anioIngreso = anioIngreso;
    }

    public double sueldo() {
        double basico = this.sueldoBasico();
        double adicional = this.sueldoAdicional();
        return calcularNeto(basico, adicional);
    }

    private double calcularNeto(double basico, double adicional) {
        double descuento = (basico * 0.13) + (adicional * 0.05);
        return (basico + adicional) - descuento;
    }

    abstract double sueldoBasico();

    abstract double sueldoAdicional();

    boolean esCasado() {
        return this.esCasado;
    }

    int cantidadDeHijos() {
        return this.cantidadHijos;
    }

    int aniosAntiquedad() {
        return Year.now().getValue() - anioIngreso.getValue();
    }
}
