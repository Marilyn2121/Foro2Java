/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdepc;
import aplicacion.PC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class Desktops extends PC{

    ArrayList desktopItems = new ArrayList();
    public void ingresardesktop(){
        //cree solo una clase que hace todo por que no vi necesidad de crear otra si solo cuando se mande a llamar con esta funcion sera cuando se agrege a esta lista asi es como lo entendi

        ArrayList clonelist = new ArrayList();
        JOptionPane.showMessageDialog(null, "Presion aceptar para continuar y registar nuevos datos", "TODOPC", JOptionPane.DEFAULT_OPTION);

        clonelist.add(super.getFabricante());     
        clonelist.add(super.getModelo());  
        clonelist.add(super.getMicropocesador());       
        clonelist.add(super.getMemoria());        
        clonelist.add(super.getTarjetaGrafica());        
        clonelist.add(super.getTorreSize());       
        clonelist.add(super.getDiscoDuroCapacidad());  
        
        desktopItems.add(clonelist.toArray());
        
    }//fin crear lista

    public void mostrarDesktop(){
        JOptionPane.showMessageDialog(null, "A continuacion se mostraran todos los desktops que han sido registrados", "TODOPC", JOptionPane.DEFAULT_OPTION);
	for (int i=0; i<desktopItems.size(); i++){
        JOptionPane.showMessageDialog(null,
        desktopItems.get(i),
        "Dispositivo desktop #"+(i+1),
        JOptionPane.INFORMATION_MESSAGE,
        null);
	}          
  
    }//fin mostrar lista
    
}
