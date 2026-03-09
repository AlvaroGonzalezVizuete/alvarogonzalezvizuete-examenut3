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
public abstract class Envio {
    protected String idSeguimiento;
    protected double peso;
    protected Direccion destino;
    public String[] historialParadas = new String[3];
    
    public Envio (String id, double peso, Direccion destino) {
        this.idSeguimiento = id;
        this.peso = peso;
        this.destino = destino;
        this.historialParadas[0] = "Sin registro";
        this.historialParadas[1] = "Sin registro";
        this.historialParadas[2] = "Sin registro";
    }
    
    abstract double calcularPrecioFinal();
    
    @Override
    public boolean equals(Object obj) {
        Envio otroEnvio = (Envio) obj;
        
        return this.idSeguimiento.equals(otroEnvio.idSeguimiento);
    }
}
