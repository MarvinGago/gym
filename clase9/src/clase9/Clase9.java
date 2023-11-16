/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase9;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CPUw1010
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        /*Persona arrpersona[ ] = new Persona[5];
        for(int x=0; x<arrpersona.length; x++){
            JOptionPane.showInputDialog(null,"Se solicitara los datos del estudiante "+x);
            int cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cedula:"));
            String nombre= JOptionPane.showInputDialog(null, "Escriba el nombre");
            String apellido = JOptionPane.showInputDialog("Escriba apellidos");
            String apellido2 = JOptionPane.showInputDialog("Escriba apellidos");
            arrpersona[x]=new Persona(cedula,nombre,apellido,apellido2);
            */
        
        //Ejercicio 1
        Pulperia pulperia = new Pulperias();

        // Agregar productos al inventario
        pulperia.agregarProducto(1, "Arroz", 10);
        pulperia.agregarProducto(2, "Azúcar", 5);
        pulperia.agregarProducto(3, "Aceite", 8);

        // Imprimir todos los productos
        pulperia.imprimirProductos();

        // Buscar un producto por código
        pulperia.buscarProducto(2);

        // Realizar una venta de productos
        pulperia.venderProducto(1, 5);

        // Imprimir todos los productos después de la venta
        pulperia.imprimirProductos();
    }
}


    



    
   
