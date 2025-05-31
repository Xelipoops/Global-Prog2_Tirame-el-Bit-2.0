package Clases;

import java.util.ArrayList;

//ArticuloManufacturado → ArticuloManufacturadoDetalle
// ArticuloManufacturado HEREDA DE Articulo

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private ArrayList<ArticuloManufacturadoDetalle> detalles_del_articulo_manufacturado = new ArrayList<>(); //⬜

    public ArticuloManufacturado(String denominacion, Double precioVenta, UnidadMedida unidadMedida, Imagen imagenes, String descripcion, int tiempoEstimadoMinutos, String preparacion,ArticuloManufacturadoDetalle detalles_del_articulo_manufacturado) {
        super(denominacion, precioVenta, unidadMedida, imagenes);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        this.detalles_del_articulo_manufacturado.add(detalles_del_articulo_manufacturado);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public ArrayList<ArticuloManufacturadoDetalle> getDetalles_del_articulo_manufacturado() {
        return detalles_del_articulo_manufacturado;
    }

    public void setDetalles_del_articulo_manufacturado(ArticuloManufacturadoDetalle detalles_del_articulo_manufacturado) {
        this.detalles_del_articulo_manufacturado.add(detalles_del_articulo_manufacturado);
    }
}