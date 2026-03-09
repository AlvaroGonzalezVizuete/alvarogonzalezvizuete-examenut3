/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import detalles.Direccion;

/**
 *
 * @author Alumno
 */
public class Paquete extends Envio implements Asegurable{
    private double volumen;
    
    public Paquete(String id, double peso, Direccion destino, double volumen) {
        super(id, peso, destino);
        this.volumen = volumen;
    }
    
    @Override
    public double calcularPrecioFinal() {
        double precio = 5;
        if (peso > 5) {
            precio += (peso - 5) * 2;
        }
        if (volumen > 1) {
            precio += 10;
        }
        
        return precio;
    }
    
    @Override
    public double calcularSeguro(double valorMercancia) {
       return valorMercancia * 0.03;
    }
}
