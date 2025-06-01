import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

//Promocion → (*)Articulo
//Promocion → (*)Imagen

public class Promocion{
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;

    private ArrayList<Imagen> imagenes = new ArrayList<>(); // ⬜
    private ArrayList<Articulo> articulos = new ArrayList<>();//⬜

    public Promocion(String denominacion, String descripcionDescuento, double precioPromocional, TipoPromocion tipoPromocion, Imagen imagen) {
        this.denominacion = denominacion;
        FechaDesde = LocalDate.now();
        FechaHasta = LocalDate.now();
        HoraDesde = LocalTime.now();
        HoraHasta = LocalTime.now();
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        this.imagenes.add(imagen);
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public LocalDate getFechaDesde() {
        return FechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        FechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return FechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        FechaHasta = fechaHasta;
    }

    public LocalTime getHoraDesde() {
        return HoraDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        HoraDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return HoraHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        HoraHasta = horaHasta;
    }

    public String getDescripcionDescuento() {
        return descripcionDescuento;
    }

    public void setDescripcionDescuento(String descripcionDescuento) {
        this.descripcionDescuento = descripcionDescuento;
    }

    public double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }

    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    public ArrayList<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(Imagen imagen) {
        this.imagenes.add(imagen);
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo articulo) {
        this.articulos.add(articulo);
    }
}