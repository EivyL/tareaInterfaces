package pckControladores;

import pckModelos.ingresoModelo;
import pckVistas.frmPrincipal;
import pckVistas.frmIngreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class usuariosController implements ActionListener {
frmPrincipal VistaPrincipal;
frmIngreso VistaUsuarios;
ingresoModelo ModeloIngresos;
public DefaultTableModel TablaIngreso = new DefaultTableModel();

    public usuariosController(frmPrincipal VistaPrincipal, frmIngreso VistaUsuarios, ingresoModelo ModeloIngresos)
    {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaUsuarios = VistaUsuarios;
        this.ModeloIngresos = ModeloIngresos;
        
        
        //PONER A LA ESCUCHA LOS BOTONES CORRESPONDIENTES
        this.VistaPrincipal.btnIngreso.addActionListener(this);
        
        //LEVANTAR LA VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        //ESTABLECER LOS TITULOS DE LA TABLA
           this.TablaIngreso.addColumn("MARCA");
           this.TablaIngreso.addColumn("MODELO");
           this.TablaIngreso.addColumn("TIPO");
           this.TablaIngreso.addColumn("PROBLEMA");
           
           this.VistaUsuarios.jtUsuarios.setModel(TablaIngreso);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==this.VistaPrincipal.btnIngreso)
       {
           //PONER A LA ESCUCHA LOS BOTONES DE LA VISTA USUARIOS
           this.VistaUsuarios.btnIngresoCom.addActionListener(this);
           
           //LEVANTAR LA VISTA USUARIOS
           this.VistaUsuarios.setLocationRelativeTo(null);
           this.VistaUsuarios.setVisible(true);
       }
       
       if(e.getSource()==this.VistaUsuarios.btnIngresoCom)
       {
           this.ModeloIngresos.AgregarEquipo(this.VistaUsuarios.txtMarca.getText(),
                   this.VistaUsuarios.txtModelo.getText(),
                   this.VistaUsuarios.txtTipo.getText(), this.VistaUsuarios.txtProblema.getText());
          
           this.TablaIngreso.addRow(new Object[]{
           this.ModeloIngresos.ListaIngreso.get(0).getMarca(),
           this.ModeloIngresos.ListaIngreso.get(0).getModelo(), 
           this.ModeloIngresos.ListaIngreso.get(0).getTipo(),
           this.ModeloIngresos.ListaIngreso.get(0).getProblema()});
          } 
    }    
}

