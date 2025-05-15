package Clases;

import java.util.ArrayList;

//ArticuloManufacturado → ArticuloManufacturadoDetalle
// ArticuloManufacturado HEREDA DE Articulo

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private ArrayList<ArticuloManufacturadoDetalle> detalles_del_articulo_manufacturado; //⬜

    public ArticuloManufacturado(String denominacion, Double precioVenta, UnidadMedida unidadMedida, DetallePedido detallePedido, String descripcion, int tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta, unidadMedida, detallePedido);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public void addArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle){
        this.detalles_del_articulo_manufacturado.add(articuloManufacturadoDetalle);
    }
}
