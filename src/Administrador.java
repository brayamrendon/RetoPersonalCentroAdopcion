import java.util.Scanner;

public class Administrador {
    public void menuAdministrador(Scanner scanner) {
        RegistroAnimales registro = new RegistroAnimales();

        System.out.println("Bienvenido, Administrador.");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar Animal");
        System.out.println("2. Registrar Empleado");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada

        if (opcion == 1) {
            // Registro de Animal
            Animal animal = Animal.crearAnimal(scanner);
            registro.agregarAnimal(animal);
            System.out.println("Animal registrado con éxito.");
        } else if (opcion == 2) {
            // Registro de Empleado
            Empleado empleado = Empleado.crearEmpleado(scanner);
            registro.agregarEmpleado(empleado);
            System.out.println("Empleado registrado con éxito.");
        } else {
            System.out.println("Opción no válida.");
        }

        // Mostrar lista de animales y empleados En caso de ser necesario
    }
}
