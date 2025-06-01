import java.util.ArrayList;

public abstract class Articulo {
    protected String denominacion;
    protected Double precioVenta;
    protected UnidadMedida unidadMedida;

    protected ArrayList<Imagen> imagenes = new ArrayList<>();

    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida, Imagen imagenes) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
        this.imagenes.add(imagenes);
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public ArrayList<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
}
