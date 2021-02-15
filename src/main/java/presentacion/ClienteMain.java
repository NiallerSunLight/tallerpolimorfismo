/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.clsViaje;
import logica.clsViajeFamiliar;
import logica.clsViajeIncentivo;
import logica.clsViajeIndividual;
import logica.clsViajeTodoIncluido;

/**
 *
 * @author EDWIN ADRADA y CARLOS HOYOS
 */
public class ClienteMain {
    
    /**
    * Arreglo polimórfico de viajes
    */
    public static List<clsViaje> viajes = new ArrayList();
    
    public static void main(String[] args) {
        leerViajes();
        mostrarViajes();
    }
    /**
    * Lee viajes en el arreglo polimórfico
    */
    public static void leerViajes() {
        try {
            clsViaje viaje1 = new clsViajeFamiliar("Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
            viajes.add(viaje1);
            clsViaje viaje2 = new clsViajeIncentivo("Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
            viajes.add(viaje2);
            clsViaje viaje3 = new clsViajeIndividual("Popayán", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje3);
            clsViaje viaje4 = new clsViajeTodoIncluido("Popayán", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje4);
        } catch (ParseException ex) {
            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Recorre e imprime datos del arreglo polimófico
     */
    public static void mostrarViajes() {
        // En este caso vemos que todos los viajes ejecutan el método"descripcion()" de forma diferente // ya que al ser este método abstracto en la clase padre, les forzamos alas clases hijas a que 
        // implementen ese método.
        for (clsViaje viaje : viajes) {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripción: " + viaje.descripcion());
            System.out.println("Cualquier método: " + viaje.cualquierMetodo());
            System.out.println("Cualquier método2: " + viaje.cualquierMetodo2());
            System.out.println("");
        }
    }
}
