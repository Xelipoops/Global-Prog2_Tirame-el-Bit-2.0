import java.time.LocalDate;
import java.util.ArrayList;

//Cliente → 1.Imagen
//Cliente → 1.Usuario
//Cliente → *.Pedido
//Cliente → *.Domicilio


public class Cliente {
    private String nombre,apellido,telefono,email;
    private LocalDate fechaNacimiento;
    private Imagen imagen;//⬜
    private Usuario usuario;//⬜
    private ArrayList<Pedido> pedidos = new ArrayList<>();//⬜
    private ArrayList<Domicilio> domicilios = new ArrayList<>();//⬜

    public Cliente(String nombre, String apellido, String telefono, String email, Imagen imagen, Usuario usuario,Pedido pedidos, Domicilio domicilios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = LocalDate.now();
        this.imagen = imagen;
        this.usuario = usuario;
        this.pedidos.add(pedidos);
        this.domicilios.add(domicilios);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedidos) {
        this.pedidos.add(pedidos);
    }

    public ArrayList<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(Domicilio domicilios) {
        this.domicilios.add(domicilios);
    }
}



