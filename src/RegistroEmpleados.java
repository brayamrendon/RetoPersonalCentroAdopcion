import java.util.ArrayList;

public class RegistroEmpleados {
    private ArrayList<Empleado> listaEmpleados;


    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }
    // Método o funcion que me permite imprimir la lista de empleados en la base de datos
    public void imprimirListaEmpleados() {
        System.out.println("Lista de empleados en la base de datos:");
        for (Empleado empleado : listaEmpleados) {
            empleado.imprimirInformacion();
            System.out.println("----------------------------------------------------------------");
        }
    }
}