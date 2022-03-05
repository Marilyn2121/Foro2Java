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
public class Laptops extends PC{
    ArrayList laptopsItems = new ArrayList();

    public void ingresarLaptop(){
        PC laptop = new PC();
        ArrayList clonelist = new ArrayList();
        JOptionPane.showMessageDialog(null, "Presion aceptar para continuar y registar nuevos datos", "TODOPC", JOptionPane.DEFAULT_OPTION);
        
        clonelist.add(laptop.getFabricante());
        clonelist.add(laptop.getModelo());
        clonelist.add(laptop.getMicropocesador());
        clonelist.add(laptop.getMemoria());
        clonelist.add(laptop.getPantallaSize());        
        clonelist.add(laptop.getDiscoDuroCapacidad());

        laptopsItems.add(clonelist.toArray());
    }//fin crear lista

    public void mostrarLaptop(){
        JOptionPane.showMessageDialog(null, "A continuacion se mostraran todas las laptops que han sido registrados", "TODOPC", JOptionPane.DEFAULT_OPTION);
	for (int i=0; i<laptopsItems.size(); i++){
        JOptionPane.showMessageDialog(null,
        laptopsItems.get(i),
        "Dispositivo laptop #"+(i+1),
        JOptionPane.INFORMATION_MESSAGE,
        null);
	}          
  
    }//fin mostrar lista
    
}
