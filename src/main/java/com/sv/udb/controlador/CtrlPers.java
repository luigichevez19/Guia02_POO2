/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Pers;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class CtrlPers {
    
   public boolean guar(Pers obj)
    {
    boolean resp = false;
    Connection con = new Conexion().getConn();
        try 
        {
        PreparedStatement cmd = con.prepareStatement("Insert into pers values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        cmd.setString(1,obj.getNomb());
        cmd.setString(2,obj.getApel());
        cmd.setBytes(3, obj.getFoto());
        cmd.setInt(4,obj.getTipoP());
        cmd.setString(5,obj.getGene());
        cmd.setString(6,obj.getNaci());
        cmd.setString(7,obj.getDui());
        cmd.setString(8,obj.getNit());
        cmd.setString(9,obj.getEmail());
        cmd.setString(10,obj.getSang());
        cmd.setString(11,obj.getUbic());
        cmd.setString(12,obj.getFech1());
        cmd.setString(13,obj.getFech2());
        cmd.setBoolean(14,obj.isEsta());
        cmd.executeUpdate();
        resp=true;
        }
        catch (Exception e) 
        {
            System.out.println("Error:"+e.getMessage());
        }
         finally
        {
        try
        {
        if(con != null)
        {
        if(!con.isClosed())
        {
        con.close();
        }
        }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        }
    return resp;
    }
     public boolean actu(Pers obj)
    {
    boolean resp = false;
    Connection con = new Conexion().getConn();
        try 
        {
        PreparedStatement cmd = con.prepareStatement("update pers set NOMB_PERS=?,APEL_PERS=?, FOTO_PERS=?,CODI_TIPO_PERS=?,"
        + "GENE_PERS=?, FECH_NACI_PERS=?, DUI_PERS=?,NIT_PERS=?,Email=?,TIPO_SANG_PERS=?,CODI_UBIC_GEOG=?,FECH_ALTA=?,FECH_BAJA=?,"
                + "ESTA=? where CODI_PERS=?");
         cmd.setString(1,obj.getNomb());
        cmd.setString(2,obj.getApel());
        cmd.setBytes(3, obj.getFoto());
        cmd.setInt(4,obj.getTipoP());
        cmd.setString(5,obj.getGene());
        cmd.setString(6,obj.getNaci());
        cmd.setString(7,obj.getDui());
        cmd.setString(8,obj.getNit());
         cmd.setString(9,obj.getEmail());
        cmd.setString(10,obj.getSang());
        cmd.setString(11,obj.getUbic());
        cmd.setString(12,obj.getFech1());
        cmd.setString(13,obj.getFech2());
        cmd.setBoolean(14,obj.isEsta());
        cmd.setInt(15, obj.getCodi());
        cmd.executeUpdate();
        resp=true;
        }
        catch (Exception e) 
        {
           JOptionPane.showMessageDialog(null,"Ocurrio un error y no se guardo" );
        }
        finally
        {
        try
        {
        if(con != null)
        {
        if(!con.isClosed())
        {
        con.close();
        }
        }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        }
    return resp;
    }
     public boolean elim(Pers obj)
     {
     boolean resp=false;
     Connection con = new Conexion().getConn();
         try 
         {
         PreparedStatement cmd = con.prepareStatement("delete from pers where CODI_PERS=?");
         cmd.setInt(1,obj.getCodi());
         cmd.executeUpdate();
         resp=true;
         }
         catch (Exception e) 
         {
             System.out.println("Error:"+e.getMessage());
         }
      finally
        {
        try
        {
        if(con != null)
        {
        if(!con.isClosed())
        {
        con.close();
        }
        }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        }
     return resp;
     }
    public List<Pers> ver()
    {
    List<Pers> resp= new ArrayList();
    Connection cn =new Conexion().getConn();
        try 
        {
           PreparedStatement cmd = cn.prepareStatement("Select NOMB_PERS,APEL_PERS,Email from pers");
              ResultSet rs = cmd.executeQuery();
              while (rs.next())
              {
              resp.add(new Pers(rs.getString(1),rs.getString(2),rs.getString(3)));
              }
        }
        catch (Exception e)
        {
       JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
        try
        {
        if(cn != null)
        {
        if(!cn.isClosed())
        {
        cn.close();
        }
        }
        }
        catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
    return resp;
    }
    
}
