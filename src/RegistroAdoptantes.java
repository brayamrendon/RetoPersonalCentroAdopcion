import java.util.ArrayList;

public class RegistroAdoptantes {
    private ArrayList<Adoptante> listaAdoptantes;

    public RegistroAdoptantes() {
        listaAdoptantes = new ArrayList<>();
    }

    public void agregarAdoptante(Adoptante adoptante) {
        listaAdoptantes.add(adoptante);
    }

    // Método o funcion que me permite imprimir la lista de adoptantes en la base de datos
    public void imprimirListaAdoptantes() {
        System.out.println("Lista de adoptantes en la base de datos:");
        for (Adoptante adoptante : listaAdoptantes) {
            adoptante.imprimirInformacion();
            System.out.println("----------------------------------------------------------------");
        }
    }
}