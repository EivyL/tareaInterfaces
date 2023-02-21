
package pckModelos;

import java.util.ArrayList;

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


