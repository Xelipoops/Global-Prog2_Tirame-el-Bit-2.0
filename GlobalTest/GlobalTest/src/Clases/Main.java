package Clases;

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

       //Inicializamos desde Categoria hasta UnidadMedida del mas chico al mas grande

       UnidadMedida unidadMedida1 = new UnidadMedida("Metros");
       UnidadMedida unidadMedida2 = new UnidadMedida("Pies");
       Articulo articulo1 = new Articulo("madera", 100.0, unidadMedida1);
       Articulo articulo2 = new Articulo("tela", 400.0, unidadMedida2);



    }

}