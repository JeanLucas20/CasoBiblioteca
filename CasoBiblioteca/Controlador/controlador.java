package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaPrincipal;
import modelo.Libro;

public class controlador implements ActionListener
{
    
        //------------
        // Atributos
        //------------
    
        private VentanaPrincipal vista;
        private Libro modelo;
    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public controlador(VentanaPrincipal pVista, Libro pModelo)
        {
            this.vista = pVista;
            this.modelo= pModelo;
            this.vista.miPanelOperaciones.btHallar.addActionListener(this);
            this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);      
        }
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            // Identificar el comando generado [hallar,borrar, salir]
            String comando = ae.getActionCommand();
            
            if(comando.equals("Salir"))
            {
                System.exit(0);
            }
            
            if(comando.equals("Borrar"))
            {
                this.vista.miPanelEntradaDatos.borrar();
                this.vista.miPanelResultados.borrar();
            }
    
            if(comando.equals("Hallar"))
            {
                modelo.setNombreLibro(vista.miPanelEntradaDatos.getTfx());
                modelo.setNombreAutor1(vista.miPanelEntradaDatos.getTfy());
                modelo.setNombreAutor2(vista.miPanelEntradaDatos.getTfh());
                modelo.setAñoEdicion(Integer.parseInt(vista.miPanelEntradaDatos.getTfz()));
                modelo.setEdicionLujo(vista.miPanelEntradaDatos.getEdicionLujo());
                vista.miPanelResultados.mostrarResultado(modelo);
            }
        }
}