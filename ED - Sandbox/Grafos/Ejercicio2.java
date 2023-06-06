public class Ejercicio2 {
    public GrafoMA Ejercicio2(GrafoMA g1, int v){
        int num = g1.getNumVertices();
        if(g1.verticeEnRango(v)){
            for(int i=0 ; i < num ; i++){
                if(i!=v){
                    g1.eliminarArista(i, v);
                }
            }
        }
        return g1;
    }
}
