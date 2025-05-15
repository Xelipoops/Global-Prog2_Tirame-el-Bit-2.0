package Clases;

public class UnidadMedida {
    private String denominacion;

    public UnidadMedida(String denominacion, Articulo articulo) {
        this.denominacion = denominacion;
        articulo.addUnidadMedida(this);
    }
}
