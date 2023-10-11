import java.util.Scanner;

public class Adoptante {

    private String name;
    private String address;
    private String contactNumber;
    private String adoptionPreferences;

    public Adoptante() {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.adoptionPreferences = adoptionPreferences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAdoptionPreferences() {
        return adoptionPreferences;
    }

    public void setAdoptionPreferences(String adoptionPreferences) {
        this.adoptionPreferences = adoptionPreferences;
    }

    // Método para imprimir la información del adoptante
    public void imprimirInformacion() {
        System.out.println("Nombre: " + name);
        System.out.println("Dirección: " + address);
        System.out.println("Número de contacto: " + contactNumber);
        System.out.println("Preferencias de adopción: " + adoptionPreferences);
    }

    public void menuAdoptante(Scanner scanner) {
        RegistroAdoptantes registro = new RegistroAdoptantes();

        System.out.println("Bienvenido, Adoptante.");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Ver lista de animales disponibles para adopción");
        System.out.println("2. Realizar solicitud de adopción");

        int opcion = scanner.nextInt();
        scanner.nextLine();

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
