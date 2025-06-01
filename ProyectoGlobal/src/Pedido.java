import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

//Pedido → (1)Domicilio
//Pedido → (1)Sucursal
//Pedido → (1)factura

public class Pedido{
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private FormaPago formaPago;
    private TipoEnvio tipoEnvio;
    private LocalDate FechaPedido;

    private Domicilio domicilio; //⬜
    private Sucursal sucursal; //⬜
    private Factura factura; //⬜
    private ArrayList<DetallePedido> detallePedidos = new ArrayList<>();

    public Pedido(double total, double totalCosto, FormaPago formaPago, TipoEnvio tipoEnvio, Domicilio domicilio, Sucursal sucursal, Factura factura,DetallePedido detallePedidos) {
        this.horaEstimadaFinalizacion = LocalTime.now();
        this.total = total;
        this.totalCosto = totalCosto;
        this.formaPago = formaPago;
        this.tipoEnvio = tipoEnvio;
        FechaPedido = LocalDate.now();
        this.domicilio = domicilio;
        this.sucursal = sucursal;
        this.factura = factura;
        this.detallePedidos.add(detallePedidos);
    }

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public LocalDate getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        FechaPedido = fechaPedido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public ArrayList<DetallePedido> getDetallePedidos() {
        return detallePedidos;
    }

    public void setDetallePedidos(DetallePedido detallePedidos) {
        this.detallePedidos.add(detallePedidos);
    }
}