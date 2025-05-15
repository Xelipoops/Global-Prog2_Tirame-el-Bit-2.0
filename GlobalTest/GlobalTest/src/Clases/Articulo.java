package Clases;

public class Articulo {
    protected String denominacion;
    protected Double precioVenta;
    protected UnidadMedida unidadMedida;

    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }

}
