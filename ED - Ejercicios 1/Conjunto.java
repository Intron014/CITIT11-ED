public class Conjunto {
    private int[] datos;
    private final int MAXIMO;
    private int numElementos;

    public Conjunto(int maximo) {
        MAXIMO = maximo;
        datos = new int[MAXIMO];
        numElementos = 0;
    }

    public Conjunto() {
        MAXIMO = 10;
    }

    public boolean insertar(int valor) {
        for (int i = 0; i < numElementos; i++) {
            if (datos[i] == valor) {
                return false;
            }
        }
        if (numElementos < MAXIMO) {
            datos[numElementos] = valor;
            numElementos++;
            return true;
        } else {
            return false;
        }
    }
    public int insertar(int[] vector){
        int numInsertados = 0;
        for (int i = 0; i < vector.length; i++) {
            if (insertar(vector[i])) {
                numInsertados++;
            }
        }
        return numInsertados;
    }
    public boolean vacio(){
        if(numElementos == 0) {
            return true;
        }
        else
            return false;
    }
    public boolean contiene(int valor){
        for (int i = 0; i < numElementos; i++) {
            if (datos[i] == valor) {
                return true;
            }
        }
        return false;
    }
    public boolean eliminar(int valor){
        for (int i = 0; i < numElementos; i++) {
            if (datos[i] == valor) {
                for (int j = i; j < numElementos - 1; j++) {
                    datos[j] = datos[j + 1];
                }
                numElementos--;
                return true;
            }
        }
        return false;
    }
    public int cardinalidad(){
        return numElementos;
    }
    public void mostrar(){
        if(numElementos==0){ // Está vacío?
            System.out.println("[]");
        }
        else
            for (int aux=0;aux<numElementos;aux++){
                if(aux==0){ //Vaya, pues es el primero?
                    System.out.printf("[%d, ", datos[aux]);
                }
                if(aux==(numElementos-1)){ //Es el último?!
                    System.out.printf("%d]", datos[aux]);
                }
                else //No? Pues estará en el medio...
                    System.out.printf("%d, ", datos[aux]);
            }
    }
    public int getElemento(int posicion){
        if(numElementos>posicion){
            return datos[posicion];
        }
        else
            return 0;
    }

}
