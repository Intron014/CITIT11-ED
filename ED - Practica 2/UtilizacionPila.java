/**
 * Clase UtilizacionPila, para desarrollar los ejercicios propuestos en el
 * apartado 2
 *
 * @author Jorge Benjumea Burillo - CITIT11 - bt0354
 * @version 1.o
 */
public class UtilizacionPila {

    /**
     * TODO 1: Método que recibe un texto y una lista de etiquetas. Comprueba
     * si todas las etiquetas del texto están balanceadas (cada etiqueta de
     * apertura se corresponde con una de cierre)
     *
     * @param lista contiene las etiquetas que queremos analizar.
     * @param texto que contiene el contenido de una página html
     * @return verdadero si las etiquetas están balanceadas, falso en caso contrario
     */
    public boolean comprobarTexto (ListaEtiquetas lista, String texto) {
        Pila pilosa = new Pila();
        int i=0;
        if(texto.isEmpty()){
            return false;
        }
        while(i<texto.length()){
            if(texto.charAt(i)=='<'){
                String etiqueta="";
                i++;
                while(texto.charAt(i)!='>'){
                    etiqueta+=texto.charAt(i);
                    i++;
                }
                if(etiqueta.charAt(0)!='/'){
                    pilosa.apilar(etiqueta);
                }else{
                    if(pilosa.vacia()){
                        return false;
                    }else{
                        String etiqueta2=pilosa.desapilar();
                        if(!etiqueta2.equals(etiqueta.substring(1))){
                            return false;
                        }
                    }
                }
            }
            i++;
        }
        return pilosa.vacia();
    }

    /**
     * Método que muestra el contenido de la pila invertido (el fondo arriba y la cima abajo)
     * @param pila la pila que deseamos mostrar
     */
    public void mostrarInverso(Pila pila) {
        if(pila.vacia()){
        }else{
            String item=pila.desapilar();
            mostrarInverso(pila);
            System.out.println(item);
            pila.apilar(item);
        }
     }
}

