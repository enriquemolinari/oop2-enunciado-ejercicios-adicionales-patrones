package ejercicio4;

import java.time.Year;

public class Planta extends Empleado {

    public Planta(boolean esCasado, int cantidadHijos, Year anioIngreso) {
        super(esCasado, cantidadHijos, anioIngreso);
    }

    @Override
    double sueldoBasico() {
        // $50.000
        return 50000;
    }

    @Override
    double sueldoAdicional() {
        //$5.000 si está casado + $2.000 por cada hijo + $2.000 por cada año de antigüedad
        var adicional = 0d;
        if (esCasado()) {
            adicional += 5000;
        }
        adicional += 2000 * cantidadDeHijos();
        return adicional + (20000 * aniosAntiquedad());
    }
}
