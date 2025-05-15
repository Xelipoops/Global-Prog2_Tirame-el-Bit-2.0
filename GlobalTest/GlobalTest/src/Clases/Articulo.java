package Clases;

import java.util.ArrayList;

public class Articulo {
    protected String denominacion;
    protected Double precioVenta;
    protected UnidadMedida unidadMedida;

    protected ArrayList<Imagen> imagenes = new ArrayList<>();

    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida,DetallePedido detallePedido) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
        detallePedido.addArticulo(this);
    }

    public void addImagen(Imagen imagen){
        this.imagenes.add(imagen);
    }
}
