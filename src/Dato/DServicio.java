/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dato;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Miguel
 */
public class DServicio {
    private Conexion con;
    private int ID;
    private String NOMBRE;
    private String DESCRIPCION;
    private double PRECIO;

    public DServicio() {
     con=Conexion.getInstncia();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }

    public double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(double PRECIO) {
        this.PRECIO = PRECIO;
    }

  


    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }



    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    
     public Boolean GuardarServicio(){
       Statement Consulta;
       String dato ="INSERT INTO servicios VALUES("+String.valueOf(ID) +",'"+NOMBRE+"','"+DESCRIPCION+"',"+PRECIO+",NOW(),NOW());";
       try {
           Consulta=(Statement) con.getConexion().createStatement();
           Consulta.execute(dato);
           Consulta.close();
           System.out.println("los datos se GUARDARON con exito...");
           return true;
       } catch (Exception e) {
           System.out.println("no se puede GUARDAT TABLA EMPLEADOO");
           return false;
       }
    }
     
     public Boolean ModificarServicio(){
       Statement Consulta;
       String dato ="update servicios set id="+String.valueOf(ID) +",nombre='"+NOMBRE+"', descripcion='"+DESCRIPCION+"',precio="+PRECIO+",updated_at=now() where id="+String.valueOf(ID) +";";
       try {
           Consulta=(Statement) con.getConexion().createStatement();
           Consulta.execute(dato);
           Consulta.close();
           System.out.println("los datos se MODIFICARON con exito...");
           return true;
       } catch (Exception e) {
           System.out.println("no se puede MODIFICARON TABLA EMPLEADOO");
           return false;
       }
    }
     
     public boolean EliminarServicio(){
       Statement Consulta;
       String dato ="DELETE FROM SERVICIOS where id="+String.valueOf(ID) +";";
       try {
          Consulta=(Statement) con.getConexion().createStatement();
          Consulta.execute(dato);
           Consulta.close();
           System.out.println("los datos se ELIMINARON con exito...");
           return true;
       } catch (Exception e) {
       System.out.println("no se puede REGISTRAR la conexion");
           System.out.println("no se pudo eliminar en la tabla Empleado");
           return false;
       }
    }
     
     public DefaultTableModel getServicio(){
         String[] columnNames = {"ID","NOMBRE","DESCRIPCION","PRECIO"};
        DefaultTableModel tabla = new DefaultTableModel(columnNames, 0); 
        Statement Consulta;
        ResultSet resultado=null;
        String dato="select * from servicios;";

        try {
           Consulta=(Statement) con.getConexion().createStatement();
           resultado=Consulta.executeQuery(dato);
            int i =0;
            while(resultado.next()){
                tabla.setRowCount(tabla.getRowCount()+1);
                tabla.setValueAt(resultado.getObject(1).toString(), i, 0);
                tabla.setValueAt(resultado.getObject(2).toString(), i, 1);
                tabla.setValueAt(resultado.getObject(3).toString(), i, 2);
                tabla.setValueAt(resultado.getObject(4).toString(), i, 3);
                i++;
            }
            Consulta.close();
           
       } catch (Exception e) {
            System.out.println("no se pudo CARGAR LOS DATOS TABLA GENERO");
       } 
      
      return tabla;
     }
     
    
}
