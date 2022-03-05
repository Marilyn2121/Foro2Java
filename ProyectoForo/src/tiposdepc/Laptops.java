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
        //cree solo una clase que hace todo por que no vi necesidad de crear otra si solo cuando se mande a llamar con esta funcion sera cuando se agrege a esta lista asi es como lo entendi
        PC laptop = new PC();
        
        laptopsItems.add(laptop.getDiscoDuroCapacidad());
        laptopsItems.add(laptop.getMemoria());
        laptopsItems.add(laptop.getMicropocesador());
        laptopsItems.add(laptop.getModelo());
        laptopsItems.add(laptop.getFabricante());
        laptopsItems.add(laptop.getPantallaSize());
        //JOptionPane.showMessageDialog(null,desktopItems1.toString(),JOptionPane.INFORMATION_MESSAGE,null);
        //no me sale quiero mandar a llamar de un solo al array no rl
        
    }//fin crear lista

    public void mostrarLaptop(){
        
        JOptionPane.showMessageDialog(null,
        laptopsItems.toString(),
        "Laptop Datos",
        JOptionPane.INFORMATION_MESSAGE,
        null);
        
    }//fin mostrar lista
    
}
