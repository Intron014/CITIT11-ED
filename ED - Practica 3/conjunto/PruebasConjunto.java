package conjunto;

public class PruebasConjunto {

    public static void main(String[] args) {
        Conjunto conjuntoso = new Conjunto();
        conjuntoso.insertar(4);
        conjuntoso.insertar(6);
        conjuntoso.insertar(2);
        conjuntoso.insertar(4);
        conjuntoso.insertar(-2);
        conjuntoso.mostrar();
        conjuntoso.toArray();
        System.out.println("El mayor es: " + conjuntoso.mayor());
        conjuntoso.subconjunto(3, 6);
        System.out.println("");

        Conjunto conjuntazo = new Conjunto();
        conjuntazo.insertar(2);
        conjuntazo.insertar(4);
        conjuntazo.mostrar();
        System.out.println("Es igual que el conjunto de trabajo? " + conjuntazo.equals(conjuntoso));
        conjuntazo.insertar(6);
        conjuntazo.mostrar();
        System.out.println("Es igual que el conjunto de trabajo? " + conjuntazo.equals(conjuntoso));

        Conjunto conjuntofinal = new Conjunto();
        conjuntofinal.insertar(4);
        conjuntofinal.insertar(5);
        Algoritmos algoritmosos = new Algoritmos();
        Conjunto conjuntoInterseccion = algoritmosos.interseccion(conjuntoso, conjuntofinal);
        System.out.println("La interseccion es: ");
        conjuntoInterseccion.mostrar();
    }

}
