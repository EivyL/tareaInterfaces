
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import pckModelos.entregaModel;
import pckVistas.frmEntrega;
import pckVistas.frmPrincipal;

/**
 *
 * @author rodrigovelasquez
 */
public class entregaController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmEntrega VistaEntrega;
    entregaModel ModeloEntrega;
    public DefaultTableModel TablaEntrega = new DefaultTableModel();
    
    public entregaController(frmPrincipal VistaPrincipal, frmEntrega VistaUsuarios,entregaModel ModeloEntrega)
    {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEntrega = VistaUsuarios;
        this.ModeloEntrega = ModeloEntrega;
     
     //PONER A LA ESCUCHA LOS BOTONES CORRESPONDIENTES
        this.VistaPrincipal.btnEntrega.addActionListener(this);
     
     //LEVANTAR LA VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
     
     //ESTABLECER LOS TITULOS DE LA TABLA
        this.TablaEntrega.addColumn("CÓDIGO");
        this.TablaEntrega.addColumn("NOMBRE");
        this.TablaEntrega.addColumn("FECHA");
        this.TablaEntrega.addColumn("DESCRIPCIÓN");
     
     this.VistaEntrega.jtEntrega.setModel(TablaEntrega);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==this.VistaPrincipal.btnEntrega)
       {
       //PONER A LA ESCUCHA LOS BOTONES DE LA VISTA USUARIOS
        this.VistaEntrega.btnEntregarEquipo.addActionListener(this);
        
        //LEVANTAR LA VISTA USUARIOS
        this.VistaEntrega.setLocationRelativeTo(null);
        this.VistaEntrega.setVisible(true);   
       } 
       
       if(e.getSource()==this.VistaEntrega.btnEntregarEquipo)
       {
           this.ModeloEntrega.AgregarEnvio(this.VistaEntrega.txtCodigo.getText(), 
                   this.VistaEntrega.txtNombre.getText(), this.VistaEntrega.txtFecha.getText(), 
                   this.VistaEntrega.txtDescripcion.getText());
           
           this.TablaEntrega.addRow(new Object[]{
               this.ModeloEntrega.ListaEntrega.get(0).getCodigo(),
               this.ModeloEntrega.ListaEntrega.get(0).getNombre(),
               this.ModeloEntrega.ListaEntrega.get(0).getFecha(),
               this.ModeloEntrega.ListaEntrega.get(0).getDescripcion()});
           
       }
       
    }
}
