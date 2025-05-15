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

    public Pedido(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    private Domicilio domicilio; //⬜
    private Sucursal sucursal; //⬜
    private Factura factura; //⬜
}
