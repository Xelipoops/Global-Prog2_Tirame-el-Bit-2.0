package Clases;

import java.util.ArrayList;

public class Categoria{
    private  String denominacion;
    private ArrayList<Categoria> subCategorias;
    private ArrayList<Articulo> articulos = new ArrayList<>(); //⬜

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public ArrayList<Categoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(Categoria categoria){
        this.subCategorias.add(categoria);
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
}
