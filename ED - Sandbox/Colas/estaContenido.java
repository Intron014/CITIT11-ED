public boolean estaContenido(Cola cola, int dato){
    int nE=cola.getNumElementos();
    int i=0;
    boolean encontrado=false;
    while(i<nE&&!encontrado){
        int elemento=cola.desencolar();
        cola.encolar(elemento);
        if(elemento==dato){
            encontrado=true;
        }
        else{
            i++;
        }
    }
    System.out.println();
}