
public class AmigosETSISI {
    //MOMBRE  Y GRUPO DEL ALUMNO
    private GrafoMA miREd;
    private Persona[] contactos;


    public AmigosETSISI(int n, Persona[] contactos) { //construye una matriz de nxn sin aristas
        miREd = new GrafoMA(n, false);
        this.contactos = contactos;
    }

    public int getNumPersonas() {
        return miREd.getNumVertices();
    }


    // MÉTODOS PARA INSERTAR Y ELIMINAR ARISTAS

    // ------------------------------------
    // método que inserta una relación de amistad directa (una arista en el grafo)
    public void insertaRelacion(int o, int d) {
        miREd.insertarArista(o, d);
    }

    // método que elimina una relación de amistad directa (una arista en el grafo)
    public void eliminaRelacion(int o, int d) {
        miREd.eliminarArista(o, d);
    }

    // método que indica si existe una relación de amistad directa (una arista en el grafo)
    public boolean existeRelacion(int o, int d) {
        return miREd.existeArista(o, d);
    }

    //Metodo que compara dos cadenas que representan dos nombres ignorando mayusculas y minusculas
    private boolean nombresIguales(String cad1, String cad2) {
        return (cad1.equalsIgnoreCase(cad2));
    }


    // encuentra la posición asociado a un nombre de persona en la tablade contactos que
    // ademas se corresponde con el vertice que le representa en el grafo

    public int devuelvePosNombre(String nombre) {
        int i = 0;
        boolean encontrado = false;
        while (i < contactos.length && !encontrado) {
            encontrado = nombresIguales(nombre, contactos[i].getNombre());
            if (!encontrado) i++;
        }
        // if (!miREd.verticeEnRango(i)) i=-1;//si ha salido por i= contactos.length no esta el nombre en la tabla
        if (!encontrado) i = -1;
        return i;
    }

    // devuelve una copia de un array
    private boolean[] copia(boolean[] v1) {
        boolean[] resul = new boolean[v1.length];
        for (int i = 0; i < v1.length; i++)
            resul[i] = v1[i];
        return resul;
    }
    //inicializa el array de vistados a false

    private boolean[] inicia_Visitados(boolean[] v1) {
        boolean[] resul = new boolean[v1.length];
        for (int i = 0; i < v1.length; i++)
            resul[i] = false;
        return resul;
    }


    // Imprime la Matriz del relaciones( Matriz de adyacencia del grafo) por consola
    public void imprimirRelaciones() {
        System.out.println("Contenido de la matriz: ");
        System.out.print("  ");
        for (int i = 0; i < miREd.getNumVertices(); i++) {
            if (i < 10) System.out.print(" " + i + " ");
            else System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < miREd.getNumVertices(); i++) {
            if (i < 10) System.out.print(" " + i);
            else System.out.print(i);
            for (int j = 0; j < miREd.getNumVertices(); j++) {
                if (miREd.existeArista(i, j)) System.out.print(" S ");
                else System.out.print(" N ");
            }
            System.out.println();
        }
    }

    //Imprime la información de la red y la matriz de Relaciones por consola
    public void mostrarRed() {
        System.out.println("Existen " + miREd.getNumVertices() + " contactos: \n");
        for (int i = 0; i < miREd.getNumVertices(); i++)
            System.out.println(i + ": " + contactos[i].getNombre());
        imprimirRelaciones();
        System.out.println();
    }

// ------------------------------------

    // MÉTODOS A COMPLETAR

    // ------------------------------------


    // TODO Apartado 2.2 Primer método
    public int mostrarGrupos() {
        int resul = 0;
        boolean[] visitados = new boolean[this.getNumPersonas()];
        visitados = this.inicia_Visitados(visitados);
        boolean[] amigos;
        for (int i = 0; i < contactos.length; i++) {
            if (!visitados[i]) {
                amigos = new boolean[this.getNumPersonas()];
                amigos = this.inicia_Visitados(amigos);
                this.miREd.recorridoEnProfundidadComponenteConexa(i, amigos);
                for (int j = 0; j < contactos.length; j++) {
                    if (amigos[j]) {
                        System.out.println(contactos[j].getNombre() + " ");
                        visitados[j] = true;
                    }
                }
                System.out.println("----");
                resul++;
            }
        }
        return resul;
    }

    // TODO Apartado 2.2 Segundo método
    public void mostrarAmigosIndirectos(String nombre) {
        if (this.devuelvePosNombre(nombre) != -1) {
            boolean[] visitados = new boolean[this.getNumPersonas()];
            int count=0;
            visitados = inicia_Visitados(visitados);
            miREd.recorridoEnProfundidadComponenteConexa(devuelvePosNombre(nombre), visitados);
            System.out.println("Indirect friends of " + nombre + ":");
            for (int i = 0; i < contactos.length; i++) {
                if (!existeRelacion(devuelvePosNombre(nombre), i) && visitados[i] && !contactos[i].getNombre().equals(nombre)) {
                    System.out.println(devuelvePosNombre(contactos[i].getNombre()) + " --> " + contactos[i].getNombre());
                    count++;
                }
            }
            if(count==0){
                System.out.println(nombre + " no tiene amigos indirectos.");
            }
        } else {
            System.out.println("No tiene pinta de que " + nombre + " exista");
        }
    }

    // TODO Apartado 2.2 Tercer método
    public boolean noSonAmigos(Persona p, Persona p1) {
        boolean resul = false;
        boolean pfind = false;
        if (devuelvePosNombre(p.getNombre()) != -1) {
            pfind = true;
        }
        boolean p1find = false;
        if (devuelvePosNombre(p1.getNombre()) != -1) {
            p1find = true;
        }
        if (pfind && p1find) {
            boolean[] visitados = new boolean[getNumPersonas()];
            visitados = inicia_Visitados(visitados);
            miREd.recorridoEnProfundidadComponenteConexa(devuelvePosNombre(p.getNombre()), visitados);

            resul = visitados[devuelvePosNombre(p1.getNombre())];

            if (!resul) {
                System.out.println(p1.getNombre() + " y " + p.getNombre() + " no son amigos.");
            } else {
                System.out.println(p1.getNombre() + " y " + p.getNombre() + " son friends.");
            }
        } else {
            if (!pfind && !p1find) {
                System.out.println(p.getNombre() + " y " + p1.getNombre() + " no existen.");
            }
            if (pfind && !p1find) {
                System.out.println(p1.getNombre() + " no existe.");
            }
            if (!pfind && p1find) {
                System.out.println(p.getNombre() + " no existe.");
            }
        }
        return !resul;
    }

    // TODO Apartado 2.2 Cuarto método
    public void mostrarMiembrosSiAmigos(Persona p, Persona p1) {
        boolean pfind = false;
        if (devuelvePosNombre(p.getNombre()) != -1) {
            pfind = true;
        }
        boolean p1find = false;
        if (devuelvePosNombre(p1.getNombre()) != -1) {
            p1find = true;
        }
        if (pfind && p1find) {
            boolean[] visitados = new boolean[getNumPersonas()];
            visitados = inicia_Visitados(visitados);
            miREd.recorridoEnProfundidadComponenteConexa(devuelvePosNombre(p.getNombre()), visitados);

            if(visitados[devuelvePosNombre(p1.getNombre())]){
                for(int i=0; i<contactos.length; i++){
                    if(visitados[i]){
                        System.out.println(devuelvePosNombre(contactos[i].getNombre()) + " --> " + contactos[i].getNombre());
                    }
                }
            }
            else{
                System.out.println(p1.getNombre() + " y " + p.getNombre() + " no son amigos.");
            }

        } else {
            if (!pfind && !p1find) {
                System.out.println(p.getNombre() + " y " + p1.getNombre() + " no existen.");
            }
            if (pfind && !p1find) {
                System.out.println(p1.getNombre() + " no existe.");
            }
            if (!pfind && p1find) {
                System.out.println(p.getNombre() + " no existe.");
            }

        }
    }
}
