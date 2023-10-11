
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RegistroAnimales registro = new RegistroAnimales();

        // Llama a initLogger para configurar el logger
        Animal.initLogger();

        System.out.println("Seleccione una opción:");
        System.out.println("1. Eres Administrador");
        System.out.println("2. Eres Empleado");
        System.out.println("3. Eres Adoptante");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            Administrador administrador = new Administrador();
            administrador.menuAdministrador(scanner);
        } else if (opcion == 2) {
            Empleado empleado = new Empleado();
            empleado.menuEmpleado(scanner);
        } else if (opcion == 3) {
            Adoptante adoptante = new Adoptante();
            adoptante.menuAdoptante(scanner);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}