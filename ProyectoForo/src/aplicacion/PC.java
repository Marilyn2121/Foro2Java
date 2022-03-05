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

// en esta clase se creara como las funciones para solicitar y mostrat los datos
//no se necesita constructor ya que no vamos a instanciar nada solo crear funciones con atributos
public class PC {
    //componentes de la pc
    String fabricante,modelo, micropocesador, memoria, tarjetaGrafica , discoDuroCapacidad;// iguales en todos los tipos
    String torreSize, pantallaSize, diagonalSizePantalla, capOres, memoriaNAND, sistemaOperativo;// difiere en cada uno
    
    //======================= metodos ==========================
    
    //getters
    //para cada set preguntar por los datos por que le vamos a dar el valor para el get es para mandarlo a llamar
    public String getFabricante() {
        fabricante = JOptionPane.showInputDialog("Inserte el fabricante del Dispositivo");
        return "Nombre del fabricante: "+fabricante+"\n";
    }

    public String getModelo() {
        modelo = JOptionPane.showInputDialog("Inserte el modelo del Dispositivo");
        return "Modelo: "+modelo+"\n";
    }

    public String getMicropocesador() {
        micropocesador = JOptionPane.showInputDialog("Inserte el micropocesador del Dispositivo");
        return "Microprocesador: "+micropocesador+"\n";
    }


    public String getMemoria() {
        memoria = JOptionPane.showInputDialog("Inserte la memoria del Dispositivo");
        return "Capacidad de memoria: "+memoria+"\n";
    }

    public String getTarjetaGrafica() {
        tarjetaGrafica = JOptionPane.showInputDialog("Inserte la Tarjeta Grafica del Dispositivo");
        return "Tipo de tarjeta grafica: "+tarjetaGrafica+"\n";
    }

    public String getTorreSize() {
        torreSize = JOptionPane.showInputDialog("Inserte el tamaño de torre del Dispositivo");
        return "Tamaño de torre: "+torreSize+"\n";
    }

    public String getDiscoDuroCapacidad() {
        discoDuroCapacidad = JOptionPane.showInputDialog("Inserte la capacidad del disco duro del Dispositivo");
        return "capacidad de disco duro: "+discoDuroCapacidad+"\n";
    }

    public String getPantallaSize() {
        pantallaSize = JOptionPane.showInputDialog("Inserte el tamaño de la pantalla del Dispositivo");
        return pantallaSize;
    }

    public String getDiagonalSizePantalla() {
        diagonalSizePantalla = JOptionPane.showInputDialog("Inserte el tamaño de la pantalla diagonal del Dispositivo");
        return diagonalSizePantalla;
    }

    public String getCapOres() {
        String[] opcion={"Capacitiva","Resistiva"};
        
        String msg = (String)JOptionPane.showInputDialog(null, "Elegir el tipo de pantalla","Entrada",
        JOptionPane.DEFAULT_OPTION,
        null,opcion,
        opcion[0]);
        return capOres;
    }

    public String getMemoriaNAND() {
        memoriaNAND = JOptionPane.showInputDialog("Inserte el tamaño de la memoria NAND del Dispositivo");
        return memoriaNAND;
    }

    public String getSistemaOperativo() {
        sistemaOperativo = JOptionPane.showInputDialog("Inserte el sistema operativo del Dispositivo");
        return sistemaOperativo;
    }

    //fin de los setters y getters    
  
}//fin clase
