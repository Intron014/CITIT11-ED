public class Ejercicios {
    public GrafoMA Ejercicio1(GrafoMA g1) {
        int num = g1.getNumVertices();
        GrafoMA result = new GrafoMA(num, g1.getDirigido());
        for(int i=0;i < num; i++){
            for(int j=0; j < num; j++){
                if (!g1.existeArista(i, j) && i != j) {
                    result.insertarArista(i, j);
                }
            }
        }
        return result;
    }

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

    public int Ejercicio3(GrafoMA g1){
        int num = g1.getNumVertices();
        boolean found = false;
        boolean check = true;
        int i=0;
        int j=0;

        while(i<num && !found){
            while(j<num && check){
                check = g1.existeArista(i, j);
                j++;
            }
            if(check){
                found = check;
            }
            else{
                i++;
                j=0;
            }
        }
        if(!found){
            i=-1;
        }
        return i;
    }

    public int Ejercicio4(int n){
        n = (n*(n-1)/2);
        return n;
    }

    public int Ejercicio5(GrafoMA g1){
        int n = 0;
        for(int i=0; i<g1.getNumVertices(); i++){
            if(g1.existeArista(i, i)){
                n++;
            }
        }
        return n;
    }
}
