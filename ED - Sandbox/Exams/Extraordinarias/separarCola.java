public void separarCola(Cola cola, Pila pila){
    for(int cont=1; cont<cola.getNumElementos();cont++){
        int item = cola.desencolar();
        if(cont%2==0){
            cola.encolar(item);
        }
        else{
            pila.apilar(item);
        }
    }
}