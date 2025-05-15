package Clases;

public class ArticuloInsumo extends Articulo{

    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, Double precioVenta, UnidadMedida unidadMedida, DetallePedido detallePedido, double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar, ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        super(denominacion, precioVenta, unidadMedida, detallePedido);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
        articuloManufacturadoDetalle.addArticuloInsumo(this);
    }
}
