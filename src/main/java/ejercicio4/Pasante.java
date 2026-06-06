package ejercicio4;

import java.time.Year;

public class Pasante extends Empleado {
    private int cantidadExamenesRendidos;

    public Pasante(boolean esCasado, int cantidadHijos, Year anioIngreso, int cantidadExamenesRendidos) {
        super(esCasado, cantidadHijos, anioIngreso);
        this.cantidadExamenesRendidos = cantidadExamenesRendidos;
    }

    @Override
    double sueldoBasico() {
        // $20.000
        return 20000;
    }

    @Override
    double sueldoAdicional() {
        //$2.000 por examen rendido
        return 2000 * cantidadExamenesRendidos;
    }
}
