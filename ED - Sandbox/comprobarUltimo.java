public int comprobarUltimo(ListaOrdinal lista){
    int returner=0;
    int n=0;
    int last=0;
    Iterador iterador = lista.getIterador();
    while(iterador.hasNext()){
        last=iterador.next();
	n++;
    }

    if(last==n){
        returner=0;
    }
    if(last<n){
        returner=-1;
    }
    if(last>n){
        returner=1;
    }
    return returner;

}
