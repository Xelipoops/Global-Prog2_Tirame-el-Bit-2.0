package Clases;

public class Localidad {
    private String nombre;
    private Provincia provincia;

    public Localidad(String nombre, Domicilio domicilio) {
        this.nombre = nombre;
        domicilio.addLocalidad(this);
    }

    public void addProvincia(Provincia provincia){
        this.provincia = provincia;
    }
}
