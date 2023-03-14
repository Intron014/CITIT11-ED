/**
 * Clase UtilizacionCola, para desarrollar los ejercicios propuestos en el
 * apartado 4
 *
 * @author Jorge Benjumea Burillo - CITIT11 - bt0354
 * @version 1.0
 */
public class UtilizacionCola {

    /**
     * TO-DO 1: Método que recibe una lista de etiquetas html y un String
     * conteniendo una página html.
     * Genera una cola que contiene las etiquetas de la lista contenidas en el texto
     *
     * @param lista lista que contiene las etiquetas que queremos comprobar
     * @param texto la página que vamos a analizar
     * @return la cola que contiene las etiquetas de la lista contenidas en el texto
     */
    public Cola leerTexto(ListaEtiquetas lista, String texto) {
        Cola cola = new Cola();
        int i=0;
        while(i<texto.length()) {
            if (texto.charAt(i) == '<') {
                String etiqueta = "<";
                i++;
                while (texto.charAt(i) != '>') {
                    etiqueta += texto.charAt(i);
                    i++;
                }
                if(texto.charAt(i) == '>'){
                    etiqueta += texto.charAt(i);
                }
                if (etiqueta.charAt(0) != '/') {
                    cola.encolar(etiqueta);
                }
            }
            i++;
        }
        return cola;
    }
    /**
     * Método que recibe una cola y una lista de etiquetas. Comprueba si todas las etiquetas
     * de la cola están balanceadas (cada etiqueta de apertura se corresponde con una de cierre)
     *
     * @param cola  que contiene las etiquetas extraídas de una página html
     * @param lista contiene las etiquetas que queremos analizar.
     * @return verdadero si las etiquetas están balanceadas, falso en caso contrario
     */
    public boolean comprobarHtml(Cola cola, ListaEtiquetas lista) {
        Pila comprobamos = new Pila();
        int i=0;
        while(i< cola.getNumElementos()){
            String elemento = cola.desencolar();
            cola.encolar(elemento);
            if(lista.esApertura(elemento)){
                comprobamos.apilar(elemento);
            }
            else{
                if(lista.esCierre(elemento)){
                    String elemento2= comprobamos.desapilar();
                    if(!lista.emparejados(elemento2, elemento)){
                        return false;
                    }
                    else{
                        i++;
                    }
                }
            }
        }
        return true;
    }
}
