/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ejercicio01.service;

/**
 *
 * @author Alumno
 */
public class Ejercicio01Service {
    
    private final double IGV=0.18;
    
    public double calcularArticulo (double importe){
        double articulo;
        articulo =calculartotal(importe)+IGV;
        return articulo;
    }
    
    public double calcularimpuesto (double importe){
        double impuesto;
        impuesto=importe*IGV;    
        return impuesto;
    }
    
    public double calculartotal (double importe){
        double total;
        total=importe + calcularimpuesto(importe);
        return total;
    }
    
}
