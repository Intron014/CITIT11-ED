public class Alumno {
    private String nombre;
    private String matricula;
    private double calificacion;
    private String[] asignaturas;
    private int numasignaturas;

    public Alumno(){
        nombre = "";
        matricula = "";
        calificacion = 0;
        numasignaturas = 0;
        asignaturas = new String[5];
    }
    public Alumno(String nombre, String matricula, double calificacion){
        setNombre(nombre);
        this.matricula = matricula;
        setCalificacion(calificacion);
        numasignaturas = 0;
        asignaturas = new String[5];
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public double getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(double cal){
        this.calificacion=cal;
    }
    public void matricularAsignatura(String asignatura){
        if(numasignaturas<5){
            this.asignaturas[this.numasignaturas]=asignatura;
            numasignaturas++;
        }
        else
            System.out.println("Tienes muchas asignaturas");
    }
    public void mostrarAsignaturas(){
        if(numasignaturas>0) {
            System.out.printf("Asignaturas %d:\n", numasignaturas);
            for (int aux = 0; aux < numasignaturas; aux++) {
                System.out.println(asignaturas[aux]);
            }
            System.out.println("\n");
        }
        else
            System.out.println("No estas matriculado en ninguna asignatura");
    }

    public void mostrarAlumno(){
        System.out.printf("%s. Mattr:%s (%f)\n", getNombre(), matricula, getCalificacion());
        mostrarAsignaturas();
    }

}
