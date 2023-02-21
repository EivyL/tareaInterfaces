
import pckControladores.entregaController;
import pckControladores.ingresoController;
import pckModelos.entregaModel;
import pckModelos.ingresoModelo;
import pckVistas.frmEntrega;
import pckVistas.frmPrincipal;
import pckVistas.frmIngreso;

public class main {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmIngreso VistaUsuarios = new frmIngreso(VistaPrincipal,true);
        ingresoModelo ModeloIngresos = new ingresoModelo();
        
        
        ingresoController ControladorUsuarios = new ingresoController(VistaPrincipal,
                VistaUsuarios,ModeloIngresos);     
        
        
    }
    
    public void entrega(String[] args)
    {
    
    frmPrincipal VistaPrincipal = new frmPrincipal();
    frmEntrega VistaUsuarios = new frmEntrega(VistaPrincipal,true);
    entregaModel ModeloEntrega = new entregaModel();
    
    entregaController ControladorUsuarios = new entregaController(VistaPrincipal,
    VistaUsuarios,ModeloEntrega);
    }
}


