/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author CPUw1010
 */
public class Pulperias {
    public class Pulperia {
    private final List<Producto> inventario;

    public Pulperia() {
        inventario = new ArrayList<>();
    }

    public void agregarProducto(int codigo, String nombre, int cantidad) {
        Producto producto = new Producto(codigo, nombre, cantidad);
        inventario.add(producto);
    }

    public void imprimirProductos() {
        System.out.println("Inventario de la pulperia:");
        for (Producto producto : inventario) {
            JOptionPane.showInputDialog("Codigo: " + producto.getCodigo());
            JOptionPane.showInputDialog("Nombre: " + producto.getNombre());
            JOptionPane.showInputDialog("Cantidad: " + producto.getCantidad());
            System.out.println("-------------------------");
        }
    }

    public void buscarProducto(int codigo) {
        for (Producto producto : inventario) {
            if (producto.getCodigo() == codigo) {
                System.out.println("Producto encontrado:");
                System.out.println("Codigo: " + producto.getCodigo());
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Cantidad: " + producto.getCantidad());
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void venderProducto(int codigo, int cantidad) {
        for (Producto producto : inventario) {
            if (producto.getCodigo() == codigo) {
                if (cantidad > 0 && cantidad <= producto.getCantidad()) {
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    System.out.println("Venta realizada correctamente.");
                } else {
                    System.out.println("Cantidad invalida. Verifique el stock disponible.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    }}