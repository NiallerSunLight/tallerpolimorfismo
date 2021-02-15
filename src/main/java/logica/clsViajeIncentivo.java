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
public class clsViajeIncentivo extends clsViaje {
    
    // <editor-fold desc="Atributos">
    
    private String empresa;
    
    // </editor-fold>

    // <editor-fold desc="Contructor">
    
    public clsViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }
    
    // </editor-fold>
    
    // <editor-fold desc="Getters">

    public String getEmpresa() {
        return empresa;
    }
    
    // </editor-fold>
    
    // <editor-fold desc="Setters">

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    // </editor-fold>
    
@Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

@Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }
}
