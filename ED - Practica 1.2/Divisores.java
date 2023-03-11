public class Divisores {
    public void visualizarDivisores(int valor){
        int l;
        int aux;

        System.out.printf("Los divisores de %d:\n", valor);
        for(l=1;l<=valor;l++){
            aux=(valor%l);
            if(aux==0){
                System.out.println(l);
            }
        }
    }
}
