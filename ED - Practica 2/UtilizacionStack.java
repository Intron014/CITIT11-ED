import java.util.Stack;

/**
 * Clase UtilizacionStack, para desarrollar los ejercicios propuestos en el apartado 3
 * @author Jorge Benjumea Burillo - CITIT11 - bt0354
 * @version 1.0
 */
public class UtilizacionStack {

    /**
     * Método que recibe un texto y una lista de etiquetas. Comprueba si todas las etiquetas
     * del texto están balanceadas (cada etiqueta de apertura se corresponde con una de cierre)
     *
     * @param lista contiene las etiquetas que queremos analizar.
     * @param texto que contiene el contenido de una página html
     * @return verdadero si las etiquetas están balanceadas, falso en caso contrario
     */
    public boolean comprobarLineaStack (ListaEtiquetas lista, String texto) {
            Stack stackeado = new Stack<String>();
            int i=0;
            String[] archive = texto.split(" ");
            boolean returnin=true;
            for(;i< archive.length && returnin;i++){
                if(lista.esApertura(archive[i])){
                    stackeado.push(archive[i]);
                }
                else
                    if(lista.esCierre(archive[i])){
                        String potatoe = (String) stackeado.pop();
                        if(!lista.emparejados(potatoe, archive[i])){
                            returnin=false;
                            System.out.println("Quedan elementos en la pila");
                            mostrar(stackeado);
                        }
                    }
            }
            return returnin;
    }
    /**
     * Método que muestra el contenido de la pila
     * @param pila la pila que deseamos mostrar
     */
    public void mostrar (Stack <String> pila)  {
        if(pila.empty()){

        }
        else{
            String item=pila.pop();
            System.out.println(item);
            mostrar(pila);
            pila.push(item);
        }

    }
    /**
     * Método que muestra el contenido de la pila invertido (el fondo arriba y la cima abajo)
     * @param pila la pila que deseamos mostrar
     */
    public void mostrarInverso (Stack <String> pila) {
        if(pila.empty()){

        }
        else{
            String item=pila.pop();
            mostrar(pila);
            System.out.println(item);
            pila.push(item);
        }
    }
}
