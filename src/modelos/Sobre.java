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
public class Sobre extends Envio{
    private boolean esAcolchado;
    
    public Sobre(String id, double peso, Direccion destino, boolean esAcolchado) {
        super(id, peso, destino);
        this.esAcolchado = esAcolchado;
    }
    
    @Override
    public double calcularPrecioFinal() {
        double precio = 2;
        if (esAcolchado) {
            precio += 1.5;
        }
        if (destino.getCiudad().equals("Las Palmas")) {
            precio -= 0.5;
        }
        return precio;
    }
}
