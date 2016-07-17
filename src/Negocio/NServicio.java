/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dato.DEmpleado;
import Dato.DServicio;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel
 */
public class NServicio {
    DServicio DatoServicio;

    public NServicio() {
    DatoServicio= new DServicio();
    }
    public boolean GuardarServicio(int ID,String NOMBRE,String DESCRIPCION,double PRECIO){
  
       DatoServicio.setDESCRIPCION(DESCRIPCION);
       DatoServicio.setID(ID);
       DatoServicio.setNOMBRE(NOMBRE);
       DatoServicio.setPRECIO(PRECIO);
       return DatoServicio.GuardarServicio();
    }
    
    public boolean ModificarServicio(int ID,String NOMBRE,String DESCRIPCION,double PRECIO){
     DatoServicio.setDESCRIPCION(DESCRIPCION);
       DatoServicio.setID(ID);
       DatoServicio.setNOMBRE(NOMBRE);
       DatoServicio.setPRECIO(PRECIO);
       return DatoServicio.ModificarServicio();
    }
    
    public boolean  EliminarServicio(int ID){
    DatoServicio.setID(ID);
    return DatoServicio.EliminarServicio();   
    }
    
    public DefaultTableModel getServicio(){
        return DatoServicio.getServicio();
    }
    
    
}
