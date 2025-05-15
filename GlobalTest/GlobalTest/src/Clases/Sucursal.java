package Clases;

import java.time.LocalTime;
import java.util.ArrayList;

//Sucursal → (*)Promociones
//Sucursal → (1)Domicilio
//Sucursal → (*)Categorias

public class Sucursal {
    private String nombre;
    private LocalTime HorarioApertura;
    private LocalTime HorarioCierre;
    private Domicilio domicilio; // ⬜
    private ArrayList<Promocion> promociones = new ArrayList<>(); //⬜
    private ArrayList<Categoria> categorias = new ArrayList<>();//⬜

    public Sucursal(String nombre, Empresa empresa) {
        this.nombre = nombre;
        HorarioApertura = LocalTime.now();
        HorarioCierre = LocalTime.now();
        empresa.addSucursal(this);

    }

    public void addDomicilio(Domicilio domicilio){
        this.domicilio = domicilio;
    }

    public void addCategoria(Categoria categorias){
        this.categorias.add(categorias);
    }

    public void addPromocion(Promocion promocion){
        this.promociones.add(promocion);
    }
}
