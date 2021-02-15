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
public class clsViajeFamiliar extends clsViaje{
    
    // <editor-fold desc="Atributos">
    
    //Cantidad de integrantes de la familia
    private int familia;
    
    // </editor-fold>
    
    // <editor-fold desc="Constructor">
    
    public clsViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }
    
    // </editor-fold>
    
    // <editor-fold desc="Getters">
    
    public int getFamilia() {
        return familia;
    }

    // </editor-fold>
    
    // <editor-fold desc="Setters">

    public void setFamilia(int familia) {
        this.familia = familia;
    }
    
    // </editor-fold>
    
@Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
 
@Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
    
}
