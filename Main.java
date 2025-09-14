public class Main {
    public static void main(String[] args) {
        EstudiantesUniversitario estudiante1 = new EstudiantesUniversitario("Juan", 20, "Ingeniería", 3);
        estudiante1.mostrarDatos();

        EstudiantesSecundario estudiante2 = new EstudiantesSecundario("Luis", 16, "Colegio Nacional", 10);
        estudiante2.mostrarDatos();

        Estudiante estudiante3 = new Estudiante("Ana", 18);
        estudiante3.mostrarDatos();
    }
}
