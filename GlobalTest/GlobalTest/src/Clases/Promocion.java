package Clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

//Promocion → (*)Articulo
//Promocion → (*)Imagen

public class Promocion {
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;

    private ArrayList<Imagen> imagenes; // ⬜
    private ArrayList<Articulo> articulos;//⬜
}
