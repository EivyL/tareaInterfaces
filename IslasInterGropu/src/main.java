
import pckControladores.ingresoController;
import pckModelos.ingresoModelo;
import pckVistas.frmPrincipal;
import pckVistas.frmIngreso;

public class main {
    
    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmIngreso VistaUsuarios = new frmIngreso(VistaPrincipal,true);
        ingresoModelo ModeloIngresos = new ingresoModelo();
        
        
        ingresoController ControladorUsuarios = new ingresoController(VistaPrincipal,
                VistaUsuarios,ModeloIngresos);
        

        
    }
    
}
