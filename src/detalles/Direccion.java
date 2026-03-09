/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package detalles;

/**
 *
 * @author Alumno
 */
public class Direccion {
    private String calle;
    private String codigoPostal;
    private String ciudad;
    
    public Direccion(String calle, String codPostal, String ciudad) {
        this.calle = calle;
        this.codigoPostal = codPostal;
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString () {
        return "Calle: " + this.calle + " Codigo postal: " + this.codigoPostal + " Ciudad: " + this.ciudad;
    }
    
    public String getCiudad() {
        return ciudad;
    }
}
