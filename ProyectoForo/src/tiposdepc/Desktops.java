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
        PC desktop1 = new PC();
        
        desktopItems.add(desktop1.getDiscoDuroCapacidad());
        desktopItems.add(desktop1.getTorreSize());
        desktopItems.add(desktop1.getTarjetaGrafica());
        desktopItems.add(desktop1.getMemoria());
        desktopItems.add(desktop1.getMicropocesador());
        desktopItems.add(desktop1.getModelo());
        desktopItems.add(desktop1.getFabricante());
        
        //JOptionPane.showMessageDialog(null,desktopItems1.toString(),JOptionPane.INFORMATION_MESSAGE,null);
        //no me sale quiero mandar a llamar de un solo al array no rl
        
    }//fin crear lista

    public void mostrarDesktop(){
        
        JOptionPane.showMessageDialog(null,
        desktopItems.toString(),
        "Desktop Datos",
        JOptionPane.INFORMATION_MESSAGE,
        null);
        
    }//fin mostrar lista
    
}
