/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ejercicio01.prueba;

import pe.egcc.ejercicio01.service.Ejercicio01Service;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        //DATO
        double importe=1000.0;
        //PROCESO
        Ejercicio01Service service=new Ejercicio01Service();
        double impuesto=service.calcularimpuesto(importe);
        double total=service.calculartotal(impuesto);
        double articulo=service.calcularArticulo(importe);
        //REPORTE
        System.out.println("Importe: " + importe);
        System.out.println("Articulo: " + articulo);
        System.out.println("Total: " + total);
        
    }
    
}
