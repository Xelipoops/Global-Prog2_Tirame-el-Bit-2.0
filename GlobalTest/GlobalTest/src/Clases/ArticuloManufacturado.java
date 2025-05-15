package Clases;

import java.util.ArrayList;

//ArticuloManufacturado → ArticuloManufacturadoDetalle
// ArticuloManufacturado HEREDA DE 🔳Articulo

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private ArrayList<ArticuloManufacturadoDetalle> detalles_del_articulo_manufacturado; //⬜
}
