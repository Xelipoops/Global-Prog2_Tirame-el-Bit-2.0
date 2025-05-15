package Clases;

import java.time.LocalDate;
import java.time.LocalTime;

//Pedido → (1)Domicilio
//Pedido → (1)Sucursal
//Pedido → (1)factura

public class Pedido {

    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private FormaPago formaPago;
    private TipoEnvio tipoEnvio;
    private LocalDate FechaPedido;

    private Domicilio domicilio; //⬜
    private Sucursal sucursal; //⬜
    private Factura factura; //⬜

    public Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto, LocalDate fechaPedido, Sucursal sucursal, Domicilio domicilio,FormaPago formaPago, TipoEnvio tipoEnvio, Cliente cliente, DetallePedido detallePedido) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        FechaPedido = fechaPedido;
        this.sucursal = sucursal;
        this.domicilio = domicilio;
        this.formaPago = formaPago;
        this.tipoEnvio = tipoEnvio;
        cliente.addPedido(this);
        detallePedido.addPedido(this);
    }

    public void addFacturas(Factura factura){
        this.factura = factura;
    }
}
