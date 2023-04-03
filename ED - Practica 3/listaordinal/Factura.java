package listaordinal;

public class Factura {
    private String dni;
    private String fecha;
    private ListaOrdinal listaProductos;
    private boolean cobrada;

    public Factura(String dni, String fecha) {
        this.dni = dni;
        this.fecha = fecha;
        listaProductos = new ListaOrdinal();
        cobrada = false;
    }

    public String getDNI() {
        return dni;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean estaCobrada() {
        return cobrada;
    }

    public void cobrada() {
        cobrada = true;
    }

    public void añadirProducto(Producto producto) {
        if(listaProductos.vacia()){
            listaProductos.insertar(producto);
        }
        else {
            if(listaProductos.contiene(producto)){
                Iterador italia = listaProductos.getIterador();
                while(italia.hasNext()){
                    Producto p = italia.next();
                    if(p.equals(producto)){
                        p.setUnidades(p.getUnidades() + producto.getUnidades());
                    }
                }
            }
            else{
                listaProductos.insertar(producto);
            }
        }
    }

    public void mostrar() {
        System.out.println("FACTURA de " + dni + ". Fecha: " + fecha);
        listaProductos.mostrar();
        System.out.println("IMPORTE TOTAL: " + importeTotal());
    }

    public float importeTotal() {
        float total = 0;
        Iterador iterante = listaProductos.getIterador();
        while(iterante.hasNext()){
            Producto p = iterante.next();
            total += p.getPrecio() * p.getUnidades();
        }
        return total;
    }

    public int eliminarProducto(Producto producto) {
        int items=0;
        if(listaProductos.vacia()){
        }
        else {
            if(listaProductos.contiene(producto)){
                Iterador italia = listaProductos.getIterador();
                while(italia.hasNext()){
                    Producto p = italia.next();
                    if(p.equals(producto)){
                        if(p.getUnidades()>producto.getUnidades()){
                            items=producto.getUnidades();
                            p.setUnidades(p.getUnidades() - producto.getUnidades());
                        }
                        if(p.getUnidades()<producto.getUnidades()){
                            items=producto.getUnidades();
                            listaProductos.borrar(producto);
                        }
                    }
                }
            }
        }
        return items;
    }

    public ListaOrdinal mayoresPrecios(float precio) {
        int count=0;
        ListaOrdinal lista = new ListaOrdinal();
        Iterador iterante = listaProductos.getIterador();
        while(iterante.hasNext()){
            Producto p = iterante.next();
            if(p.getPrecio()>precio){
                count++;
                lista.insertar(p);
            }
        }
        System.out.println("Se han obtenido " + count + " productos con precio mayor que " + precio + " €");
        lista.mostrar();
        return lista;
    }
}
