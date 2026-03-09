/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alvarogonzalezvizuete_examenut3;
import detalles.Direccion;
import modelos.Paquete;

/**
 *
 * @author Alumno
 */
public class AlvaroGonzalezVizuete_ExamenUT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion dir = new Direccion("Calle", "35460", "Galdar");
        Paquete paq = new Paquete("1", 10, dir, 2);
        
        paq.historialParadas[0] = "Madrid";
        paq.historialParadas[1] = "Sevilla";
        for (int i = 0; i < paq.historialParadas.length; i++) {
            System.out.println(paq.historialParadas[i]);
        }
        
        System.out.println("Precio final: " + paq.calcularPrecioFinal());
        System.out.println("Seguro: " + paq.calcularSeguro(paq.calcularPrecioFinal()));
    }
}
