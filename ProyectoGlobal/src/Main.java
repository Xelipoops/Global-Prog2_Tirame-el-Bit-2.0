//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UnidadMedida unidadMedida1  = new UnidadMedida("Gramos");
        UnidadMedida unidadMedida2  = new UnidadMedida("Gramos");
        Imagen imagen1 = new Imagen("Emprendimiento");
        Imagen imagen2 = new Imagen("Emprendimiento");
        Promocion promocion1 = new Promocion("Burguer X Coca", "50%", 100.0, TipoPromocion.PROMOCION, imagen1);
        Promocion promocion2 = new Promocion("Lomopizza X Birra", "20%", 500.0, TipoPromocion.PROMOCION, imagen2);
        Pais pais1 = new Pais("Argentina");
        Pais pais2 = new Pais("Argentina");
        Provincia provincia1 = new Provincia("Mendoza",pais1);
        Provincia provincia2 = new Provincia("Mendoza",pais2);
        Localidad localidad1 = new Localidad("Las heras", provincia1);
        Localidad localidad2 = new Localidad("Las heras", provincia2);
        Domicilio domicilio1 = new Domicilio("San martin",150, 3234, localidad1);
        Domicilio domicilio2 = new Domicilio("San martin",110, 6534, localidad2);
        Categoria categoria1 = new Categoria("Ropa");
        Categoria categoria2 = new Categoria("Comida");
        Sucursal sucursal1 = new Sucursal("Atomo",domicilio1,promocion1,categoria1);
        Sucursal sucursal2 = new Sucursal("Carrefour",domicilio2,promocion2,categoria2);
        Empresa empresa1 = new Empresa("Empresa1","si", 12331, sucursal1);
        Empresa empresa2 = new Empresa("Empresa2","no", 4531, sucursal2);
        Usuario usuario1 = new Usuario("123","Skelenger");
        Usuario usuario2 = new Usuario("142","Wstmen");
        Factura factura1 = new Factura(123123, 321, "asasd0", "asdasd", FormaPago.EFECTIVO,100.9);
        Factura factura2 = new Factura(923, 221, "sdgsasd0", "sfgd", FormaPago.MERCADOPAGO,1123.2);
        DetallePedido detallePedido1 = new DetallePedido(100,500.0);
        DetallePedido detallePedido2 = new DetallePedido(1400,5002.0);
        Pedido pedido1 = new Pedido(200.0,100.0,FormaPago.EFECTIVO,TipoEnvio.DELIVERY,domicilio1,sucursal1,factura1,detallePedido1);
        Pedido pedido2 = new Pedido(1500.0,500.0,FormaPago.EFECTIVO,TipoEnvio.TAKEAWAY,domicilio2,sucursal2,factura2,detallePedido2);
        Cliente cliente1 = new Cliente("Celina", "Frassinelli", "2614924958", "Xelipoops@gmail.com", imagen1, usuario1, pedido1, domicilio1);
        Cliente cliente2 = new Cliente("Franco", "Castro", "2615341562", "WStmen@gmail.com", imagen2, usuario2, pedido2, domicilio2);
        ArticuloInsumo articuloInsumo1 = new ArticuloInsumo("Ropa",100.0,unidadMedida1,imagen1,200.0,10,100,true);
        ArticuloInsumo articuloInsumo2 = new ArticuloInsumo("Comida",1400.0,unidadMedida2,imagen2,2040.0,10,100,true);
        ArticuloManufacturadoDetalle articuloManufacturadoDetalle1 = new ArticuloManufacturadoDetalle(100,articuloInsumo1);
        ArticuloManufacturadoDetalle articuloManufacturadoDetalle2 = new ArticuloManufacturadoDetalle(150,articuloInsumo2);
        ArticuloManufacturado articuloManufacturado1 = new ArticuloManufacturado("Algo",100.0,unidadMedida1,imagen1,"Algo que sirve",1000,"Cocinarlo",articuloManufacturadoDetalle1);
        ArticuloManufacturado articuloManufacturado2 = new ArticuloManufacturado("Ogla",500.0,unidadMedida2,imagen2,"Algo que no sirve",5000,"Cocinar",articuloManufacturadoDetalle2);
    }


}