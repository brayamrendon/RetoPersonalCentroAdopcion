import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Empleado {
    private String name;
    private String rol;
    private LocalDate dateOfHire;

    public Empleado() {
        this.name = name;
        this.rol = rol;
        this.dateOfHire = dateOfHire;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre del Empleado: " + name);
        System.out.println("Rol: " + rol);
        System.out.println("Fecha de Contratación: " + dateOfHire.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    public static Empleado crearEmpleado(Scanner scanner) {
        System.out.print("Nombre del Empleado: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Rol del Empleado: ");
        String rolEmpleado = scanner.nextLine();

        System.out.print("Fecha de Contratación (yyyy-MM-dd): ");
        String fechaContratacion = scanner.nextLine();
        LocalDate dateOfHire = LocalDate.parse(fechaContratacion, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        return new Empleado();
    }

    public void menuEmpleado(Scanner scanner) {
        RegistroEmpleados registro = new RegistroEmpleados();

        System.out.println("Bienvenido, Empleado.");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar Empleado (solo para administradores)");
        System.out.println("2. Realizar tareas de empleado");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada

        if (opcion == 1) {
            System.out.println("Lo siento, los empleados no tienen permiso para registrar empleados.");
        } else if (opcion == 2) {
            // Realizar tareas de empleado
            // Agregar aquí la lógica específica para las tareas de empleado
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public void menuAdoptante(Scanner scanner) {
        RegistroAdoptantes registro = new RegistroAdoptantes();

        System.out.println("Bienvenido, Adoptante.");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Ver lista de animales disponibles para adopción");
        System.out.println("2. Realizar solicitud de adopción");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada

        if (opcion == 1) {
            // Mostrar lista de animales disponibles para adopción
            // Agregar aquí la lógica para mostrar la lista de animales disponibles
        } else if (opcion == 2) {
            // Realizar solicitud de adopción
            // Agregar aquí la lógica para solicitar la adopción
        } else {
            System.out.println("Opción no válida.");
        }
    }

}


