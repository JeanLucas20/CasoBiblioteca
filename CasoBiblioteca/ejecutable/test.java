package ejecutable;

import Controlador.controlador;
import modelo.Libro;
import vista.VentanaPrincipal;

public class test 
{
    public static void main (String[] args)
    {
       VentanaPrincipal miVentana= new VentanaPrincipal();
       Libro miModelo = new Libro(null, null, null, 0, null);  
       controlador miControlador = new controlador(miVentana,miModelo);

    }   
}