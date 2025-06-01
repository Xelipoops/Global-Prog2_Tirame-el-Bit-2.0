import java.util.ArrayList;

public class DetallePedido{
    private int cantidad;
    private double subTotal;
    private Articulo articulo;

    public DetallePedido(int cantidad, double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}

