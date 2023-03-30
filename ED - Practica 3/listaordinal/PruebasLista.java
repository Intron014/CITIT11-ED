package listaordinal;

public class PruebasLista {
    public static void main(String[] args) {
        Producto mesa_escritorio = new Producto("Mesa escritorio", 185, 2);
        Producto silla = new Producto("Silla oficina", 95.9f, 3);
        Producto mesa_cocina = new Producto("Mesa cocina", 125, 1);
        Producto sillon = new Producto("Sillón Reclinable", 230, 2);

        ListaOrdinal listosa = new ListaOrdinal();

        listosa.insertar(mesa_escritorio);
        listosa.insertar(silla);
        listosa.insertar(mesa_cocina);
        listosa.insertar(sillon);

        listosa.mostrar();
        listosa.borrar(silla);
        listosa.mostrar();

    }
}
