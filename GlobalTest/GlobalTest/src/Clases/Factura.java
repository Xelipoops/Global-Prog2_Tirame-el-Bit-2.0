package Clases;

import java.time.LocalDate;

public class Factura {

    private LocalDate fechaFacturacion;
    private int mpMerchantOrderId , mpPaymentId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;
}
