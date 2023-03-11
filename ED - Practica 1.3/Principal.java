public class Principal {
    public static void main(String[] args) {
        Alumno alum1 = new Alumno("Felipe Arias González", "aa1253", 3.5);
        Alumno alum2 = new Alumno("Manuel García Sacedón", "ax0074", 8.35);
        Alumno alum3 = new Alumno("Margarita López Medina", "mj7726", 7.70);
        Alumno alum4 = new Alumno("Estela Sánchez Arellano", "bc2658", 6.75);

        alum1.matricularAsignatura("Estructuras de Datos");
        alum2.matricularAsignatura("Estructuras de Datos");
        alum3.matricularAsignatura("Estructuras de Datos");
        alum4.matricularAsignatura("Estructuras de Datos");
        alum4.matricularAsignatura("Estructuras de Computadores");
        alum4.matricularAsignatura("Algebra");

        alum4.mostrarAsignaturas();
        alum1.mostrarAlumno();
        alum4.mostrarAlumno();

        //GrupoAlumnos

        System.out.println("GRUPO DE ALUMNOS");

        GrupoAlumnos gx11 = new GrupoAlumnos("GX11", 20);
        gx11.insertarAlumno(alum1);
        gx11.insertarAlumno(alum2);
        gx11.insertarAlumno(alum3);
        gx11.insertarAlumno(alum4);
        gx11.mostrarGrupo();

        gx11.getAlumno(1).mostrarAlumno();

        System.out.println("DELETE ALUMNOS");
        gx11.eliminarAlumno("Estela Sánchez Arellano");
        gx11.mostrarGrupo();
        gx11.eliminarAlumno("Manuel García Sacedón");
        gx11.mostrarGrupo();
        gx11.eliminarAlumno("Felipe Arias González");
        gx11.mostrarGrupo();

    }
}
