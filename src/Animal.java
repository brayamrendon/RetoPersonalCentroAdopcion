import java.util.Scanner;
import java.util.logging.*;

// Clase para registro de animales
public class Animal {
    //Atributos de los animales
    private String name;
    private int age;
    private String species;
    private String race;
    private String healthStatus;
    private String description;

    private static Logger logger;

    //Creacion de un constructor vacio y constructor con parametros definidos.

    public Animal(String name, int age, String race, String healthStatus, String description) {
    }

    public Animal(String name, int age, String species, String race, String healthStatus, String description) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.race = race;
        this.healthStatus = healthStatus;
        this.description = description;
    }

    // Creacion de los metodos  Getters y setters de esta clase


    public String getName() {
        return name;
    }

    // Método set con validacione

    public void setName(String name) {
        try {
            if (name != null && !name.isEmpty()) {
                this.name = name;
            } else {
                throw new IllegalArgumentException("Nombre no válido");
            }
        } catch (IllegalArgumentException e) {
            logException(Level.WARNING, "Error al establecer el nombre del animal: " + e.getMessage());
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (age >= 0) {
                this.age = age;
            } else {
                throw new IllegalArgumentException("Edad no válida");
            }
        } catch (IllegalArgumentException e) {
            logException(Level.SEVERE, "Error al establecer la edad del animal: " + e.getMessage());
        }
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        try {
            if (species != null && !species.isEmpty()) {
                this.species = species;
            } else {
                throw new IllegalArgumentException("Especie no válida");
            }
        } catch (IllegalArgumentException e) {
            logException(Level.INFO, "Error al establecer la especie del animal: " + e.getMessage());
        }
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        try {
            if (race != null && !race.isEmpty()) {
                this.race = race;
            } else {
                throw new IllegalArgumentException("Raza no válida");
            }
        } catch (IllegalArgumentException e) {
            logException(Level.WARNING, "Error al establecer la raza del animal: " + e.getMessage());
        }
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        try {
            if (healthStatus != null && !healthStatus.isEmpty()) {
                this.healthStatus = healthStatus;
            } else {
                throw new IllegalArgumentException("Estado de salud no válido");
            }
        } catch (IllegalArgumentException e) {
            logException(Level.WARNING, "Error al establecer el estado de salud del animal: " + e.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Método para inicializar el logger
    public static void initLogger() {
        logger = Logger.getLogger(Animal.class.getName());
        try {
            FileHandler fileHandler = new FileHandler("animal_logs.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para registrar excepciones en el logger con un nivel específico
    private void logException(Level level, String message) {
        logger.log(level, message);
    }

    // Método para imprimir la información del animal

    public void imprimirInformacion() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Especie: " + species);
        System.out.println("Raza: " + race);
        System.out.println("Estado de Salud: " + healthStatus);
        System.out.println("Descripción: " + description);
    }

    public static Animal crearAnimal(Scanner scanner) {
        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Edad: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Raza: ");
        String race = scanner.nextLine();

        System.out.print("Especie: ");
        String species = scanner.nextLine();

        System.out.print("Estado de Salud: ");
        String healthStatus = scanner.nextLine();

        System.out.print("Descripción: ");
        String description = scanner.nextLine();

        return new Animal(name, age, species, race, healthStatus, description);
    }
}