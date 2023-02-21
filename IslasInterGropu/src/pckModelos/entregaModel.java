/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModelos;

import java.util.ArrayList;

/**
 *
 * @author umg
 */
public class entregaModel {
    public ArrayList<Entrega> ListaEntrega = new ArrayList<Entrega>(); 
    
public void AgregarEnvio(String codigo, String nombre, String fecha,String descripcion )
{
    Entrega NuevoEntrega = new Entrega(codigo,nombre,fecha,descripcion);
    this.ListaEntrega.add(NuevoEntrega);
}

public ArrayList ListarUsuarios()
{
    return ListaEntrega;
}

}


