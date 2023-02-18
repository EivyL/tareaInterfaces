package pckModelos;

import java.util.ArrayList;

public class ingresoModelo {
    
public ArrayList<Ingreso> ListaIngreso = new ArrayList<Ingreso>(); 
    
public void AgregarEquipo(String marca, String modelo, String tipo, String problema)
{
    Ingreso NuevoIngreso = new Ingreso( marca, modelo, tipo, problema);
    this.ListaIngreso.add(NuevoIngreso);
}
public ArrayList ListarIngreso()
{
    return ListaIngreso;
}   
}
