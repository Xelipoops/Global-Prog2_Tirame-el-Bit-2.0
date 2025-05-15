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
}

