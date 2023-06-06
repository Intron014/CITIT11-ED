# Grafos
### And their history
###### By Jorge Benjumea

## Introducción
### Conceptos
- **Adyacencia**: Relación entre dos vértices.
- **Incidencia**: Relación entre un vértice y una arista.
- **Grado**:
  - GN[^1]:
    - **Grado de un Vértice**: Número de aristas que inciden en un vértice.
  - GD[^2]:
    - **Grado de Salida**: Número de aristas que salen de un vértice.
    - **Grado de Entrada**: Número de aristas que entran en un vértice.
- **Bucle**: Arista que conecta un vértice consigo mismo.
- **Ciclo**: Camino que comienza y termina en el mismo vértice.
### Partes de los Grafos
- **Camino**: Secuencia de vértices y aristas que conectan dos vértices.
- **Camino Simple**: Camino que no repite vértices.
- **Coste de un camino**: Suma de los costes de las aristas que lo componen.
- **Camino mínimo GD**: Camino de menor coste entre dos vértices.
- **Camino minimo GN**: Camino con menos aristas entre dos vértices.
- **Cadena**: Secuencia de vértices y aristas que no tiene por qué comenzar y terminar en el mismo vértice.
-----------------
- **Grafo conexo**: Grafo en el que existe un camino entre cualquier par de vértices.
- **Grafo fuertemente conexo**: Grafo en el que existe un camino entre cualquier par de vértices en ambos sentidos.
-----------------
## Representación de Grafos
- Las estructuras que mas se usan son:
  - Las _Matrices de Adyacencia_.
  - Las _Listas de Adyacencia_.
### Matriz de Adyacencia
- Se representa mediante una matriz cuadrada de orden _n_.
- Si el grafo es no dirigido, la matriz es simétrica.
#### Implementación
Al usarla
```java	
boolean[] visitados = new boolean[this.getNumPersonas()];
visitados = this.inicia_Visitados(visitados);
```
```java	
public int gradoEntrada(int v) {
    int resul = 0;
    if (this.verticeEnRango(v)){
        for (int i = 0; i < this.numVertices; i++)      /Recorrer la columna del vertice v
            if (this.matrizAdy[i][v]) resul++;
    }
    return resul;
}
public int gradoSalida(int v) {
    int resul = 0;
    if (this.verticeEnRango(v)) {
        for (int j = 0; j < this.numVertices; j++)      /Recorrer fila del vertice v
            if (this.matrizAdy[v][j]) resul++;
    }
    return resul;
}
```

### Listas de Adyacencia
- Se representa mediante un array de listas.
- Cada posición del array representa un vértice.
- Cada lista representa los vértices adyacentes al vértice representado por la posición del array.
#### Implementación
- Grados de salida de v:
  - Número de elementos de la lista de adyacencia de V
- Grado de entrada de v:
  - Recorrer todas las listas de adyacencia y contar las veces que aparece v.
### Recorrido del grafo


[^1]: Grafo No Dirigido
[^2]: Grafo Dirigido