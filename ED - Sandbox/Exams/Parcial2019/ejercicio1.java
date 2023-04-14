public boolean similitudColas(Cola cola1, Cola cola2){
	int nel1 = cola1.getNumElementos();
	int nel2 = cola2.getNumElementos();
	int MAX, MIN;
	int i=0;
	boolean resultado;
	float acomp = 0;
	int simil = 0;
	if(ne1<ne2){
		MAX = ne2;
		MIN = ne1;
		acomp=MAX/2;
	}
	else{
		MAX = ne1;
		MIN = ne2;
		acomp=MAX/2;
	}

	while(i<MIN){
		int e1 = cola1.desencolar();
		int e2 = cola2.desencolar();
		if(e1==e2){
			simil++;
		}
		cola1.encolar(e1);
		cola2.encolar(e2);
		i++
	}
	if(simil>=acomp){
		resultado = true;
	}
	else{
		resultado = false;
	}
	return resultado;

}
