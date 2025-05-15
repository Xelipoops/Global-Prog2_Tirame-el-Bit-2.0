package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

//Cliente → 1.Imagen
//Cliente → 1.Usuario
//Cliente → *.Pedido
//Cliente → *.Domicilio


public class Cliente {
    private String nombre,
    apellido,telefono,email;

    private  LocalDate fechaNacimiento;

    private Imagen imagen;//⬜
    private Usuario usuario;//⬜
    private ArrayList<Pedido> pedidos;//⬜
    private ArrayList<Domicilio> domicilios;//⬜

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void addImagen (Imagen imagen){
        this.imagen = imagen;
    }

    public void addPedido (Pedido pedidos){
        this.pedidos.add(pedidos);
    }

    public void addUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void addDomicilio(Domicilio domicilio){
        this.domicilios.add(domicilio);
    }
}

