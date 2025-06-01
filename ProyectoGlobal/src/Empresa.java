import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private int cuil;

    private ArrayList<Sucursal> sucursales = new ArrayList<>();

    public Empresa(String nombre, String razonSocial, int cuil, Sucursal sucursal) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.sucursales.add(sucursal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Sucursal sucursal){
        sucursales.add(sucursal);
    }
}
