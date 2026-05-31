package ejercicio2;

public class Main {
    static void main() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Juan Perez", "jperez@bla.com", "123"));
        biblioteca.agregarSocio(new Socio("Maria Gomez", "mgomez@bla.com", "432"));
        System.out.println(biblioteca.exportarSocios());
    }
}
