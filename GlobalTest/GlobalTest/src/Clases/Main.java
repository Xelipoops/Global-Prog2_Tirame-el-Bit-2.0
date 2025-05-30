package Clases;

import java.time.LocalDate;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Inicializamos desde Empresa hasta pais de mas grande a mas chico
       Empresa empresa1 = new Empresa("TirameElBit", "Franco", 111);
       Empresa empresa2 = new Empresa("TirameElBit2.0", "Leandro", 110);
       Sucursal sucursal1 = new Sucursal("Francisco", empresa1);
       Sucursal sucursal2 = new Sucursal("Leandro", empresa2);
       Domicilio domicilio1 = new Domicilio("San martin", 100, 54, sucursal1);
       Domicilio domicilio2 = new Domicilio("Las heras", 600, 546, sucursal2);
       Localidad localidad1 = new Localidad("Tunuyan", domicilio1);
       Localidad localidad2 = new Localidad("Tunuyan", domicilio2);
       Provincia provincia1 = new Provincia("Mendoza", localidad1);
       Provincia provincia2 = new Provincia("Mendoza", localidad2);
       Pais pais1 = new Pais("Argentina", provincia1);
       Pais pais2 = new Pais("Argentina", provincia2);
       //Inicializamos DetallePedido
       DetallePedido detallePedido1 = new DetallePedido(123, 4.0);
       DetallePedido detallePedido2 = new DetallePedido(100, 10.0);

       //Inicializamos desde UnidadMedida hasta Categoria del mas chico al mas grande

       UnidadMedida unidadMedida1 = new UnidadMedida("Metros");
       UnidadMedida unidadMedida2 = new UnidadMedida("Pies");
       Articulo articulo1 = new Articulo("madera", 100.0, unidadMedida1, detallePedido1);
       Articulo articulo2 = new Articulo("tela", 400.0, unidadMedida2, detallePedido2);
       Categoria categoria1 = new Categoria("Mueble", articulo1, sucursal1);
       Categoria categoria2 = new Categoria("Hogar", articulo2, sucursal2);

       //Inicializamos desde Sucursal hasta imagen lado izquierdo
       Promocion promocion1 = new Promocion("Descuento", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), "20%", 160, sucursal1);
       Promocion promocion2 = new Promocion("DescuentoW", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), "40%", 120, sucursal2);
       //Inicializamos desde Domicilio hasta imagen y pedido
       Cliente cliente1 = new Cliente("Francisco", "Mestre", "261523342", "Francisco@gmail.com", LocalDate.now());
       Cliente cliente2 = new Cliente("Franco", "Castro", "26145232", "Franco@gmail.com", LocalDate.now());
       Usuario usuario1 = new Usuario("2031", "Xelipoops", cliente1);
       Usuario usuario2 = new Usuario("2050", "Negrito", cliente2);

       //Inicializamos desde sucursal hasta imagen lado derecho
       Pedido pedido1 = new Pedido(LocalTime.now(),200.0, 1000.0, LocalDate.now(), sucursal1, domicilio1, FormaPago.MERCADOPAGO, TipoEnvio.DELIVERY, cliente1,detallePedido1);
       Pedido pedido2 = new Pedido(LocalTime.now(),290.0, 2000.0, LocalDate.now(), sucursal2, domicilio2, FormaPago.EFECTIVO, TipoEnvio.TAKEAWAY, cliente2, detallePedido2);
       Factura factura1 = new Factura(LocalDate.now(), 10, 100, "ass", "sss", FormaPago.EFECTIVO, 15000.0, pedido1);
       Factura factura2 = new Factura(LocalDate.now(), 11, 101, "saa", "aaa", FormaPago.MERCADOPAGO, 11000.0, pedido2);

       //Agregamos imagen a Articulo
       Imagen imagen1 = new Imagen("Publicidad", promocion1, articulo1, cliente1);
       Imagen imagen2 = new Imagen("Publicidad", promocion2, articulo2,cliente2);

       //Empezamos con las herencias de Articulo
       ArticuloManufacturado articuloManufacturado1 = new ArticuloManufacturado("Cacao", 23.0, unidadMedida1, detallePedido1,"Es algo marron", 20, "Preparalo con semillas de cacao");
       ArticuloManufacturado articuloManufacturado2 = new ArticuloManufacturado("Leche", 23.0, unidadMedida2, detallePedido2,"Es algo blanco", 20, "Preparalo con la vaca");
       ArticuloManufacturadoDetalle articuloManufacturadoDetalle1 = new ArticuloManufacturadoDetalle(100, articuloManufacturado1);
       ArticuloManufacturadoDetalle articuloManufacturadoDetalle2 = new ArticuloManufacturadoDetalle(500, articuloManufacturado2);
       ArticuloInsumo articuloInsumo1 = new ArticuloInsumo("Algo", 2.0, unidadMedida1, detallePedido1, 20.0, 10, 20, true, articuloManufacturadoDetalle1);
       ArticuloInsumo articuloInsumo2 = new ArticuloInsumo("asd", 10.0, unidadMedida2, detallePedido2, 250.0, 140, 220, false,articuloManufacturadoDetalle2);

    }

}