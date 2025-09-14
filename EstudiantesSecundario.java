public class EstudiantesSecundario extends Estudiante {
    private String escuela;
    private int grado;

    public EstudiantesSecundario(String nombre, int edad, String escuela, int grado) {
        super(nombre, edad);
        this.escuela = escuela;
        this.grado = grado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Escuela: " + escuela);
        System.out.println("Grado: " + grado);
    }
}
