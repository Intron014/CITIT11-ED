public boolean verticesDistintaComponenteConexa(GrafoMA g, int v1, int v2){
	boolean visitados[] = new boolean[this.getNumVertices()];
	for (int i=0; i<g.getNumVertices(); i++){
		visitados[i]=false;
	}
	g.recorridoEnProfundidad(v1, visitados);
	return !visitados[v2]
}
