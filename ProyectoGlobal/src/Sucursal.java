import java.time.LocalTime;
import java.util.ArrayList;

//Sucursal → (*)Promociones
//Sucursal → (1)Domicilio
//Sucursal → (*)Categorias

public class Sucursal{
    private String nombre;
    private LocalTime HorarioApertura;
    private LocalTime HorarioCierre;
    private Domicilio domicilio; // ⬜
    private ArrayList<Promocion> promociones = new ArrayList<>(); //⬜
    private ArrayList<Categoria> categorias = new ArrayList<>();//⬜

    public Sucursal(String nombre, Domicilio domicilio, Promocion promocion, Categoria categoria) {
        this.nombre = nombre;
        HorarioApertura = LocalTime.now();
        HorarioCierre = LocalTime.now();
        this.domicilio = domicilio;
        this.promociones.add(promocion);
        this.categorias.add(categoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return HorarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        HorarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return HorarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        HorarioCierre = horarioCierre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(Promocion promociones) {
        this.promociones.add(promociones);
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria categorias) {
        this.categorias.add(categorias);
    }
}
