package listaordinal;

public class PruebasLista {
    public static void main(String[] args) {
        Producto mesa_escritorio_2 = new Producto("Mesa escritorio", 185, 2);
        Producto silla = new Producto("Silla oficina", 95.9f, 3);
        Producto mesa_cocina_1 = new Producto("Mesa cocina", 125, 1);
        Producto sillon_2 = new Producto("Sillón reclinable", 230, 2);

        ListaOrdinal listosa = new ListaOrdinal();

        listosa.insertar(mesa_escritorio_2);
        listosa.insertar(silla);
        listosa.insertar(mesa_cocina_1);
        listosa.insertar(sillon_2);

        listosa.mostrar();
        listosa.borrar(silla);
        listosa.mostrar();

        Factura factura = new Factura("12345678B", "17/03/2021");
        factura.añadirProducto(mesa_escritorio_2);
        factura.añadirProducto(silla);
        factura.añadirProducto(mesa_cocina_1);
        factura.añadirProducto(sillon_2);
        Producto silla_1 = new Producto("Silla oficina", 95.9f, 1);
        factura.añadirProducto(silla_1);
        factura.mostrar();

        Producto silla_2 = new Producto("Silla oficina", 95.9f, 2);
        Producto sillon_3 = new Producto("Sillón reclinable", 230, 3);
        factura.eliminarProducto(silla_2);
        factura.eliminarProducto(sillon_3);
        factura.mostrar();

        System.out.println();
        factura.mayoresPrecios(100);


        FacturaBib factura2 = new FacturaBib("88888888A", "08/08/2008");
        Producto armario_5 = new Producto("Armario", 385, 5);
        Producto cama_3 = new Producto("Cama", 255, 3);
        Producto cama_2 = new Producto("Cama", 255, 2);
        Producto armario_1 = new Producto("Armario", 385, 1);

        factura2.añadirProducto(armario_5);
        factura2.añadirProducto(cama_3);
        factura2.añadirProducto(cama_2);
        factura2.eliminarProducto(armario_1);
        factura2.mostrar();
        factura2.mayoresPrecios(250);


    }
}
