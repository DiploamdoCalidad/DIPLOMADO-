/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dato.DEmpleado;

/**
 *
 * @author Miguel
 */
public class NEmpleado {
    DEmpleado DatoEmpleado;

    public NEmpleado() {
    DatoEmpleado= new DEmpleado();
    }
    public void GuardarEmpleado(int ID,int CI,String NOMBRE,int TELEFONO,String DIRECCION,String DESCRIPCION){
       DatoEmpleado.setCI(CI);
       DatoEmpleado.setDESCRIPCION(DESCRIPCION);
       DatoEmpleado.setDIRECCION(DIRECCION);
       DatoEmpleado.setID(ID);
       DatoEmpleado.setNOMBRE(NOMBRE);
       DatoEmpleado.setTELEFONO(TELEFONO);
        DatoEmpleado.GuardarEmpleado();
    }
    
}
