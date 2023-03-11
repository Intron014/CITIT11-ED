public class GrupoAlumnos {
    private String nombre;
    private Alumno[] listaAlumno;
    private int numAlumnos;
    private int MAXIMO;

    public GrupoAlumnos(){
        nombre = "GrupoDesconocido";
        MAXIMO = 10;
        numAlumnos = 0;
        listaAlumno = new Alumno[MAXIMO];
    }
    public GrupoAlumnos(String nombre, int maximo){
        this.nombre = nombre;
        MAXIMO = maximo;
        numAlumnos = 0;
        listaAlumno = new Alumno[MAXIMO];
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public int getMAXIMO(){
        return MAXIMO;
    }
    public boolean insertarAlumno(Alumno alumno){
        if(numAlumnos<MAXIMO){
            listaAlumno[numAlumnos]=alumno;
            numAlumnos++;
            return true;
        }
        else
            return false;
    }
    public int getNumAlumnos(){
        return numAlumnos;
    }
    public Alumno getAlumno(int i){
        if(i>=0 && i<numAlumnos)
            return listaAlumno[i];
        else
            return null;
    }
    public void mostrarGrupo(){
        System.out.printf("GRUPO %s: %d alumnos\n", nombre, getNumAlumnos());
        for(int i=0;i<numAlumnos;i++){
            listaAlumno[i].mostrarAlumno();
        }
    }
    public double mediaCalificaciones(){
        double media = 0;
        for(int i=0;i<numAlumnos;i++){
            media += listaAlumno[i].getCalificacion();
        }
        return media/numAlumnos;
    }
    public Alumno mejorAlumno(){
        Alumno mejor = listaAlumno[0];
        for(int i=1;i<numAlumnos;i++){
            if(listaAlumno[i].getCalificacion()>mejor.getCalificacion())
                mejor = listaAlumno[i];
        }
        return mejor;
    }
    public boolean eliminarAlumno(String nombreAlumno){
        int i=0;
        while(i<numAlumnos && !listaAlumno[i].getNombre().equals(nombreAlumno))
            i++;
        if(i<numAlumnos){
            for(int j=i;j<numAlumnos-1;j++){
                listaAlumno[j]=listaAlumno[j+1];
            }
            numAlumnos--;
            return true;
        }
        else
            return false;
    }
}
