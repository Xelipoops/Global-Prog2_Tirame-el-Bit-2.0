package Clases;

public class Provincia {
    private String nombre;
    private Pais pais;

    public Provincia(String nombre, Localidad localidad) {
        this.nombre = nombre;
        localidad.addProvincia(this);
    }

    public void addPais(Pais pais){
        this.pais = pais;
    }
}
