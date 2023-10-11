import java.util.ArrayList;

class RegistroAnimales {
    private ArrayList<Animal> listaAnimales;
    private ArrayList<Empleado> listaEmpleados;

    public RegistroAnimales() {
        listaAnimales = new ArrayList<>();
    }




    // Método o funcion que me permite agregar un nuevo animal y adoptantes a la base de datos
    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }



    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    // Método o funcion que me permite imprimir la lista de animales, adoptantes, empleados en la base de datos
    public void imprimirListaAnimales() {
        for (Animal animal : listaAnimales) {
            animal.imprimirInformacion();
            System.out.println("----------------------------------------------------------------");
        }
    }




}