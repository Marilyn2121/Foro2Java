/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */

//intente pensar en como crear un metodo que los evaluara a todos pero tenian que pasar por ese metodo primero antes de ser invocados y no se me ocurrio como no me gusta la copia y la pega pero es lo unico que se me ocurrio si piensan en otra manera haganmelo saber
public class PC {
    //componentes de la pc
    String fabricante,modelo, micropocesador, memoria, tarjetaGrafica , discoDuroCapacidad;// iguales en todos los tipos
    String torreSize, pantallaSize, diagonalSizePantalla, capOres, memoriaNAND, sistemaOperativo;// difiere en cada uno
    
    //======================= metodos ==========================
    //getters
    //
    public String getFabricante() {
        fabricante = JOptionPane.showInputDialog("Inserte el fabricante del Dispositivo");
        while(fabricante.isEmpty()){
        fabricante = JOptionPane.showInputDialog(null,"El fabricante del dispositivo no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Nombre del fabricante: "+fabricante+"\n";
    }

    public String getModelo() {
        modelo = JOptionPane.showInputDialog("Inserte el modelo del Dispositivo");
        while(modelo.isEmpty()){
        modelo = JOptionPane.showInputDialog(null,"El modelo del dispositivo no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Modelo: "+modelo+"\n";
    }

    public String getMicropocesador() {
        micropocesador = JOptionPane.showInputDialog("Inserte el micropocesador del Dispositivo");
        while(micropocesador.isEmpty()){
        micropocesador = JOptionPane.showInputDialog(null,"El micropocesador no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Microprocesador: "+micropocesador+"\n";
    }


    public String getMemoria() {
        memoria = JOptionPane.showInputDialog("Inserte la memoria del Dispositivo");
        while(memoria.isEmpty()){
        memoria = JOptionPane.showInputDialog(null,"La memoria del dispositivo no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Capacidad de memoria: "+memoria+"\n";
    }

    public String getTarjetaGrafica() {
        tarjetaGrafica = JOptionPane.showInputDialog("Inserte la Tarjeta Grafica del Dispositivo");
        while(tarjetaGrafica.isEmpty()){
        tarjetaGrafica = JOptionPane.showInputDialog(null,"La Tarjeta Grafica no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Tipo de tarjeta grafica: "+tarjetaGrafica+"\n";
    }

    public String getTorreSize() {
        torreSize = JOptionPane.showInputDialog("Inserte el tamaño de torre del Dispositivo");
        while(torreSize.isEmpty()){
        torreSize = JOptionPane.showInputDialog(null,"El tamaño del dispositivo no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Tamaño de torre: "+torreSize+"\n";
    }

    public String getDiscoDuroCapacidad() {
        discoDuroCapacidad = JOptionPane.showInputDialog("Inserte la capacidad del disco duro del Dispositivo");
        while(discoDuroCapacidad.isEmpty()){
        discoDuroCapacidad = JOptionPane.showInputDialog(null,"La capacidad del disco duro no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Capacidad de disco duro: "+discoDuroCapacidad+"\n";
    }

    public String getPantallaSize() {
        pantallaSize = JOptionPane.showInputDialog("Inserte el tamaño de la pantalla del Dispositivo");
        while(pantallaSize.isEmpty()){
        pantallaSize = JOptionPane.showInputDialog(null,"El tamaño de la pantalla no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Tamaño de la pantalla"+pantallaSize+"\n";
    }

    public String getDiagonalSizePantalla() {
        diagonalSizePantalla = JOptionPane.showInputDialog("Inserte el tamaño de la pantalla diagonal del Dispositivo");
        while(diagonalSizePantalla.isEmpty()){
        diagonalSizePantalla = JOptionPane.showInputDialog(null,"El tamaño de la pantalla diagonal no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Tamaño de la pantalla diagonal: "+diagonalSizePantalla+"\n";
    }

    public String getCapOres() {
        String[] opcion={"Capacitiva","Resistiva"};
        
        String msg = (String)JOptionPane.showInputDialog(null, "Elegir el tipo de pantalla","Entrada",
        JOptionPane.DEFAULT_OPTION,
        null,opcion,
        opcion[0]);
        return "Tipo de pantalla: "+msg+"\n";
    }

    public String getMemoriaNAND() {
        memoriaNAND = JOptionPane.showInputDialog("Inserte el tamaño de la memoria NAND del Dispositivo");
        while(memoriaNAND.isEmpty()){
        memoriaNAND = JOptionPane.showInputDialog(null,"El tamaño de la memoria NAND no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Tamaño de la memoria NAND: "+memoriaNAND+"\n";
    }

    public String getSistemaOperativo() {
        sistemaOperativo = JOptionPane.showInputDialog("Inserte el sistema operativo del Dispositivo");
        while(sistemaOperativo.isEmpty()){
        sistemaOperativo = JOptionPane.showInputDialog(null,"El sistema operativo no fue ingresado intente de nuevo", " Error ", JOptionPane.WARNING_MESSAGE);
        }
        return "Sistema operativo: "+sistemaOperativo+"\n";
    }

    //fin de los setters y getters    
  
}//fin clase
