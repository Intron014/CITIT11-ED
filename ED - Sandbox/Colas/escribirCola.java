public void escribirCola(Cola cola){
    int nE=cola.getNumElementos();
    for(i=0;i<nE;i++){
        int elemento=cola.desencolar();
        System.out.print(elemento + '');
    }
    System.out.println();
}