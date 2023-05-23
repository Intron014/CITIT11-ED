public boolean esNoDirigido(){
	boolean result = false;
	int i = 0;
	int j = 0;
	int count = 0;

	while(!result && i<numVertices){
		for(;j < numVertices;j++){
			if(existeArista(i,j) == existeArista(j,i)){
				result=false;
			}
		}
		i++;
		j = i+1;
	}
	return result;
}
