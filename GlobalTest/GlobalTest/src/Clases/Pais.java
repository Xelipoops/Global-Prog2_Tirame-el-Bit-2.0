package Clases;

public class Pais {
    private  String nombre;

    public Pais(String nombre,Provincia provincia) {
        this.nombre = nombre;
        provincia.addPais(this);
    }
}
