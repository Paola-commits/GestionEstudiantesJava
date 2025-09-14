public class EstudiantesUniversitario extends Estudiante {
    private String carrera;
    private int semestre;

    public EstudiantesUniversitario(String nombre, int edad, String carrera, int semestre) {
        super(nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}
