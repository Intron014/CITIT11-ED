package listaordinal;

import java.util.Iterator;
import java.util.LinkedList;

public class FacturaBib {
    private String dni;
    private String fecha;
    private LinkedList listaProductos;
    private boolean cobrada;

    public FacturaBib(String dni, String fecha) {
        this.dni = dni;
        this.fecha = fecha;
        listaProductos = new LinkedList();
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
        if(listaProductos.contains(producto)){
            Iterator italia = listaProductos.listIterator();
            Producto p;
            while(italia.hasNext()){
                p = (Producto) italia.next();
                if(p.equals(producto)){
                    p.setUnidades(p.getUnidades() + producto.getUnidades());
                }
            }
        }
        else{
            listaProductos.add(producto);
        }
    }

    public void mostrar() {
        System.out.println("FACTURA de " + dni + ". Fecha: " + fecha);
        Iterator<Producto> interando = listaProductos.listIterator();
        if (listaProductos.isEmpty()) {
            System.out.println("List is empty");
        } else {
            while (interando.hasNext())
            {
                interando.next().mostrar();
            }
            System.out.println();
        }
        System.out.println("IMPORTE TOTAL: " + importeTotal());
    }

    public float importeTotal() {
        float total = 0;
        Iterator<Producto> iterante = listaProductos.listIterator();
        Producto p;
        while(iterante.hasNext()){
            p=iterante.next();
            total += p.getPrecio() * p.getUnidades();
        }
        return total;
    }

    public int eliminarProducto(Producto producto) {
        int items=0;
        Iterator<Producto> italia = listaProductos.listIterator();
        Producto p;
        if(listaProductos.contains(producto)){
            while(italia.hasNext()){
                p = italia.next();
                if(p.equals(producto)){
                    if(p.getUnidades() >= producto.getUnidades()){
                        items=producto.getUnidades();
                        p.setUnidades(p.getUnidades() - producto.getUnidades());
                    }
                    if(p.getUnidades() < producto.getUnidades()){
                        items=producto.getUnidades();
                        listaProductos.remove(producto);
                    }
                }
            }
        }
        return items;
    }

    public LinkedList mayoresPrecios(float precio) {
        int count=0;
        LinkedList lista = new LinkedList();
        Producto p;
        Iterator<Producto> iterante = listaProductos.listIterator();
        while(iterante.hasNext()){
            p = iterante.next();
            if(p.getPrecio()>precio){
                count++;
                lista.add(p);
            }
        }
        System.out.println("Se han obtenido " + count + " productos con precio mayor que " + precio + " €");
        Iterator<Producto> interando = listaProductos.listIterator();
        if (listaProductos.isEmpty()) {
            System.out.println("List is empty");
        } else {
            while (interando.hasNext())
            {
                interando.next().mostrar();
            }
            System.out.println();
        }
        System.out.println("IMPORTE TOTAL: " + importeTotal());
        return lista;
    }
}
