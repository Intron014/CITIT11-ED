package conjunto;

public class Conjunto {

    private Nodo inicio;
    private int numElementos;

    public Conjunto() {
        inicio = null;
        numElementos = 0;
    }

    public boolean vacio() {
        return inicio == null;
    }

    /**
     * Inserta el dato en la posición que le corresponde
     */
    public boolean insertar(int dato) {
        if (dato >= 0) {
            Nodo anterior = null;
            Nodo actual = inicio;
            while ((actual != null) && (actual.getDato() < dato)) {  // Buscar posición de inserción
                anterior = actual;
                actual = actual.getSiguiente();
            }
            if ((actual == null) || (actual.getDato() > dato)) {  // Insertar antes de actual
                Nodo nuevo = new Nodo(dato, actual);
                if (actual == inicio) {  // insertar al principio de la lista
                    inicio = nuevo;
                } else {
                    anterior.setSiguiente(nuevo);
                }
                numElementos++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    /**
     * Determina si la clave recibida como parámetro existe en la lista.
     */
    public boolean contiene(int dato) {
        Nodo actual = inicio;
        while ((actual != null) && (actual.getDato() < dato)) {  // Buscar dato
            actual = actual.getSiguiente();
        }
        return (actual != null) && (actual.getDato() == dato);
    }

    /**
     * Elimina de la lista el alumno con número de matrícula clave,
     * en caso de existir.
     */
    public boolean borrar(int dato) {
        Nodo actual = inicio;
        Nodo anterior = null;
        while ((actual != null) && (actual.getDato() < dato)) {  // Buscar dato
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if ((actual == null) || (actual.getDato() > dato)) {  // No existe clave
            return false;
        } else {  // Clave encontrada
            if (actual == inicio) {    // eliminar el primero de la lista
                inicio = actual.getSiguiente();
            } else {
                anterior.setSiguiente(actual.getSiguiente());
            }
            numElementos--;
            return true;
        }
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void mostrar() {
        if (this.vacio()) {
            System.out.println ("Conjunto vacío");
        } else {
            System.out.print("[ " + inicio.getDato());
            Nodo actual = inicio.getSiguiente();
            while (actual != null) {
                System.out.print(", " + actual.getDato());
                actual = actual.getSiguiente();
            }
            System.out.println(" ]");
        }
    }



    public int[] toArray() {
        int[] array = new int[numElementos];
        Nodo actual = inicio;
        int i = 0;
        while (actual != null) {
            array[i] = actual.getDato();
            actual = actual.getSiguiente();
            i++;
        }
        System.out.print("El array contiene: ");
        for(i=0; i<array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[i] + "\n");
        return array;
    }


    public int mayor() {
        Nodo actual = inicio;
        int mayor=-1;
        while(actual!=null){
            if(actual.getDato()>mayor){
                mayor=actual.getDato();
            }
            actual=actual.getSiguiente();
        }
        return mayor;
    }

    public Conjunto subconjunto(int inferior, int superior) {
        Nodo actual = inicio;
        Conjunto conjuntado = new Conjunto();
        while(actual!=null){
            if(actual.getDato()>=inferior && actual.getDato()<=superior){
                conjuntado.insertar(actual.getDato());
            }
            actual=actual.getSiguiente();
        }
        return conjuntado;
    }

    public boolean equals(Conjunto conjunto) {
        Nodo actual = this.inicio;
        Nodo actual2 = conjunto.inicio;
        Boolean status=true;
        if(conjunto.numElementos!=this.numElementos){
            status=false;
        }
        while(actual!=null&&actual2!=null){
            if(actual.getDato()!=actual2.getDato()){
                status=false;
            }
            actual=actual.getSiguiente();
            actual2=actual2.getSiguiente();
        }
        return status;
    }




}
