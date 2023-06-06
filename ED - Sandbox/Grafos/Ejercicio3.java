public class Ejercicio3 {
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
}
