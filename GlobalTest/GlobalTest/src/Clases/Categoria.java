package Clases;

import java.util.ArrayList;

public class Categoria {
    private  String denominacion;
    private ArrayList<Categoria> subCategorias;
    private ArrayList<Articulo> articulos = new ArrayList<>(); //⬜

    public Categoria(String denominacion, Articulo articulo, Sucursal sucursal) {
        this.denominacion = denominacion;
        this.addArticulos(articulo);
        sucursal.addCategoria(this);
    }

    public void addArticulos(Articulo articulo){
        this.articulos.add(articulo);
    }
}
