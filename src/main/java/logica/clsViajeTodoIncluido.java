/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author EDWIN ADRADA y CARLOS HOYOS
 */
public class clsViajeTodoIncluido extends clsViaje{

    // <editor-fold desc="Constructor">
    
    public clsViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    // </editor-fold>
    
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }

}
