
import pckControladores.entregaController;
import pckControladores.ingresoController;
import pckModelos.entregaModel;
import pckModelos.ingresoModelo;
import pckVistas.frmEntrega;
import pckVistas.frmPrincipal;
import pckVistas.frmIngreso;

public class main {

    public static void main(String[] args) 
    {
        //Rony de León
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmIngreso VistaUsuarios = new frmIngreso(VistaPrincipal,true);
        ingresoModelo ModeloIngresos = new ingresoModelo();
        
        ingresoController ControladorIngresos = new ingresoController(VistaPrincipal,
        VistaUsuarios,ModeloIngresos);    
        
        //Rodrigo Velasquez
        frmEntrega VistaEntrega = new frmEntrega(VistaPrincipal,true);
        entregaModel ModeloEntrega = new entregaModel();
        
        entregaController ControladorUsuarios = new entregaController(VistaPrincipal,
        VistaEntrega,ModeloEntrega);
    } 
}


