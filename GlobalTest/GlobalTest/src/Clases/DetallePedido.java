package Clases;

import java.util.ArrayList;

public class DetallePedido {
    private int cantidad;
    private double subTotal;
    private Articulo articulo;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public DetallePedido(int cantidad, double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public void addArticulo(Articulo articulo){
        this.articulo = articulo;
    }

    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
}
