package aplicacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.swing.*;
import tiposdepc.Desktops;
import tiposdepc.Laptops;
import tiposdepc.Tablets;
/**
 *
 * @author Eveling Santos
 */
public class Main {


    public static void main(String[] args) {
  
 //--------------------------Inicializacion ---------------------
        int indice;
        int indice2;
        int salir=1;
        String indice3, msg, msg2;
        
        Desktops d=new Desktops();
        Laptops c=new Laptops();
        Tablets e= new Tablets();
        
        String[] equipos={
            "Desktops",
            "Laptops",
            "Tablets",
            "Regresar"
        };
        
        String[] funciones={
            "1- Ingresar equipos",
            "2- Ver equipos",
            "3- salir"
        };
        
        
        //---------------------------------------Inicia Primer menu
        while(salir==1){
        do{
        msg = (String)JOptionPane.showInputDialog(null, "Bienvenido \n Ingrese la opcion que desee realizar: ","Elegir",
                    JOptionPane.DEFAULT_OPTION,
                    null,funciones,
                    funciones[0]);
       indice = Arrays.asList(funciones).indexOf(msg);
       if (msg==null || indice==2){
           System.exit(0);
       }
       if (indice < 0){
           JOptionPane.showMessageDialog(null, "¡Debe seleccionar una opcion!", " Error ", JOptionPane.WARNING_MESSAGE);
       }
     //----------------------------------------------------Inicia segundo menu-----------------------------------------  
        do{
        msg2 = (String)JOptionPane.showInputDialog(null, "Que equipo desea consultar: ","Elegir",
                    JOptionPane.DEFAULT_OPTION,
                    null,equipos,
                    equipos[0]);
       indice2 = Arrays.asList(equipos).indexOf(msg2);
       
       if (msg2==null){
           indice2=3;
       }  
       if (indice2 < 0){
           JOptionPane.showMessageDialog(null, "¡Debe seleccionar una opcion!", " Error ", JOptionPane.WARNING_MESSAGE);
       }
        }while(indice2 < 0);
    //------------------------------------------------------Termina segundo menu
    
       }while(indice < 0 || indice2==3); 
    //-------------------------------Fin de primer menu
    //-------------------------------Creando nuevo indice
       indice3=indice+"."+indice2;
    //-------------------------------Fin Creacion nuevo indice
    
       switch (indice3){
           case "0.0": //INGRESAR UNA DESKTOp           
              d.ingresardesktop();
               break;
           case "0.1":
               c.ingresarLaptop();
               break;
           case "0.2":
               e.ingresarTablet();
               break;
           case "1.0":
               d.mostrarDesktop();
               break;
           case "1.1":
               c.mostrarLaptop();
               break;
           case "1.2":
               e.mostrarTablet();
               break;
               
       }
    }
}
}
       