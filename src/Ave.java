import java.util.Scanner;

public class Ave extends Animal {

    private String peakType;
    private String plumagecolor;
    private String habitat;

    public Ave(String name, int age, String race, String healthStatus, String description, String peakType,
               String plumagecolor, String habitat) {
        super(name, age, race, healthStatus, description);
        this.peakType = peakType;
        this.plumagecolor = plumagecolor;
        this.habitat = habitat;
    }

    public String getPeakType() {
        return peakType;
    }

    public void setPeakType(String peakType) {
        this.peakType = peakType;
    }

    public String getPlumagecolor() {
        return plumagecolor;
    }

    public void setPlumagecolor(String plumagecolor) {
        this.plumagecolor = plumagecolor;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo de Pico: " + peakType);
        System.out.println("Color del Plumaje: " + plumagecolor);
        System.out.println("Hábitat: " + habitat);
    }

    // Método estático para crear una instancia de Ave
    public static Ave crearAve(String name, int age, String race, String healthStatus, String description,
                               Scanner scanner) {
        System.out.print("Tipo de Pico (Corto, Largo, Curvo): ");
        String peakType = scanner.nextLine();
        System.out.print("Color del Plumaje: ");
        String plumagecolor = scanner.nextLine();
        System.out.print("Hábitat: ");
        String habitat = scanner.nextLine();
        return new Ave(name, age, race, healthStatus, description, peakType, plumagecolor, habitat);
    }
}