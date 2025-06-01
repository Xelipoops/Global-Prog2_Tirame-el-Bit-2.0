import java.time.LocalDate;

public class Factura{
    private LocalDate fechaFacturacion;
    private int mpMerchantOrderId , mpPaymentId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;

    public Factura(int mpMerchantOrderId, int mpPaymentId, String mpPreferenceId, String mpPaymentType, FormaPago formaPago, double totalVenta) {
        this.fechaFacturacion = LocalDate.now();
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.mpPaymentId = mpPaymentId;
        this.mpPreferenceId = mpPreferenceId;
        this.mpPaymentType = mpPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public int getMpMerchantOrderId() {
        return mpMerchantOrderId;
    }

    public void setMpMerchantOrderId(int mpMerchantOrderId) {
        this.mpMerchantOrderId = mpMerchantOrderId;
    }

    public int getMpPaymentId() {
        return mpPaymentId;
    }

    public void setMpPaymentId(int mpPaymentId) {
        this.mpPaymentId = mpPaymentId;
    }

    public String getMpPreferenceId() {
        return mpPreferenceId;
    }

    public void setMpPreferenceId(String mpPreferenceId) {
        this.mpPreferenceId = mpPreferenceId;
    }

    public String getMpPaymentType() {
        return mpPaymentType;
    }

    public void setMpPaymentType(String mpPaymentType) {
        this.mpPaymentType = mpPaymentType;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
}
