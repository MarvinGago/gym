/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CPUw1010
 */
public class Pulperia {

    void agregarProducto(int i, String arroz, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void imprimirProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void buscarProducto(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void venderProducto(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class Pulperia {
    private List<Producto> inventario;

    public Pulperia() {
        inventario = new ArrayList<>();
    }

    public void agregarProducto(int codigo, String nombre, int cantidad) {
        Producto producto = new Producto(codigo, nombre, cantidad);
        inventario.add(producto);
    }

    public void imprimirProductos() {
        System.out.println("Inventario de la pulpería:");
        for (Producto producto : inventario) {
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Cantidad: " + producto.getCantidad());
            System.out.println("-------------------------");
        }
    }

    public void buscarProducto(int codigo) {
        for (Producto producto : inventario) {
            if (producto.getCodigo() == codigo) {
                System.out.println("Producto encontrado:");
                System.out.println("Código: " + producto.getCodigo());
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
                if (producto.getCantidad() >= cantidad) {
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    System.out.println("Venta realizada correctamente.");
                } else {
                    System.out.println("No hay suficiente cantidad de productos en el inventario.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
}
