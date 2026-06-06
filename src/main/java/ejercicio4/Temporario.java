package ejercicio4;

import java.time.Year;

public class Temporario extends Empleado {
    private final int horasTrabajadas;

    public Temporario(boolean esCasado, int cantidadHijos, Year anioIngreso, int horasTrabajadas) {
        super(esCasado, cantidadHijos, anioIngreso);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    double sueldoBasico() {
        //$20.000 + (horas trabajadas * $300)
        return 20000 + (horasTrabajadas * 300);
    }

    @Override
    double sueldoAdicional() {
        //$5.000 si está casado + $2.000 por cada hijo
        var adicional = 0d;
        if (esCasado()) {
            adicional += 5000;
        }
        return adicional + 2000 * cantidadDeHijos();
    }
}
