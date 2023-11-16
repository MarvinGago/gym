/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_gym;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author CPUw1010
 */
public class Proyecto_Gym {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Parte principal del proyecto
        Scanner entra = new Scanner(System.in);
        
        //primera parte de la creacion del menu
        JOptionPane.showInputDialog("Escriba una opcion\n1: Gymnasio\n2: Peliculas\n3: Baile o Yoga\n4 salida\n");
        String seleccion=entra.nextLine();
        
    
        //menu
        switch(seleccion){
            case"Peliculas":
                     System.out.println("Seleccionaste Peliculas");
                     break;
            case "1":
                     System.out.println("Seleccionaste Gymnasio");
                     Gym gym = new Gym();
                     gym.hacerReserva(1, "Marvin", 5);
                     gym.cancelarReserva(5);
                     gym.mostrarHorariosDisponibles();
                     break;
            case"Baile o Yoga":
                     System.out.println("Seleccionaste Baile o Yoga");
                     break;
            default:
                    System.out.println("");
                    break;
           
        }
        
        }
        }
        
         
        
    
    

