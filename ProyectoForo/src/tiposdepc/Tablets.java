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
public class Tablets extends PC{
    ArrayList tabletsItems = new ArrayList();

    public void ingresarTablet(){
        //cree solo una clase que hace todo por que no vi necesidad de crear otra si solo cuando se mande a llamar con esta funcion sera cuando se agrege a esta lista asi es como lo entendi
        PC tablet = new PC();
        
        tabletsItems.add(tablet.getDiscoDuroCapacidad());
        tabletsItems.add(tablet.getMemoria());
        tabletsItems.add(tablet.getMicropocesador());
        tabletsItems.add(tablet.getModelo());
        tabletsItems.add(tablet.getFabricante());
        tabletsItems.add(tablet.getDiagonalSizePantalla());
        tabletsItems.add(tablet.getCapOres());
        tabletsItems.add(tablet.getMemoriaNAND());
        tabletsItems.add(tablet.getSistemaOperativo());
        
        //JOptionPane.showMessageDialog(null,desktopItems1.toString(),JOptionPane.INFORMATION_MESSAGE,null);
        //no me sale quiero mandar a llamar de un solo al array no rl
        
    }//fin crear lista

    public void mostrarTablet(){
        
        JOptionPane.showMessageDialog(null,
        tabletsItems.toString(),
        "Tablet Datos",
        JOptionPane.INFORMATION_MESSAGE,
        null);
        
    }//fin mostrar lista
    
}
