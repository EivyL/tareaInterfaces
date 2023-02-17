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
public class usuarioModelo {
    public ArrayList<Usuarios> ListaUsuarios = new ArrayList<Usuarios>(); 
    
public void AgregarUsuarios(String marca, String modelo, String tipo, String problem)
{
    Usuarios NuevoUsuario = new Usuarios(marca,modelo,tipo, problem);
    this.ListaUsuarios.add(NuevoUsuario);
}

public ArrayList ListarUsuarios()
{
    return ListaUsuarios;
}
    
}
