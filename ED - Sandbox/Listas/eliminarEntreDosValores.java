public int eliminarEntreDosValores(int v1, int v2){
   int eliminados=0;
   Nodo actual = inicio;
   Nodo anterior = null;
   while(actual!=null&&actual.getClave()<= v2){
       if(actual.getClave() > v1){
           eliminados++;
	   if(anterior==null){
	       inicio=actual.getSiguiente();
	   }else{
	       anterior.setSiguiente(actual.getSiguiente());
	   }
	   actual=actual.getSiguiente();
       }else{
           anterior=actual;
	   actual=actual.getSiguiente();
       }
   }
   return eliminados
}
