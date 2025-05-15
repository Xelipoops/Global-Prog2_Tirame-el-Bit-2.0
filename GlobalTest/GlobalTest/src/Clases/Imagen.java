package Clases;

public class Imagen {
    private String denominacion;

    public Imagen(String denominacion, Promocion promocion,Articulo articulo, Cliente cliente) {
        this.denominacion = denominacion;
        promocion.addImagen(this);
        articulo.addImagen(this);
        cliente.addImagen(this);
    }
}

