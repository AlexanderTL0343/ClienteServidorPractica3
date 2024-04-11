/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;

/**
 *
 * @author Venta PC
 */
public class CompraModel {
    LinkedList<Producto> productos = new LinkedList<>();
    LinkedList<Producto> compras = new LinkedList<>();
    
    Producto actual = null;

    public CompraModel() {
        productos.add(new Producto("Oreja", 1500, "Galletitas de hojaldre con azucar", 0));
        productos.add(new Producto("Galleta de panaderia", 2000, "de pequeño tamaño y dulce", 1));
        productos.add(new Producto("Queque seco", 4000, "Masa de harina y otros ingredientes que se cocina al horno", 2));
        actual = productos.getFirst();
    }
    
    public Producto getAct(){
        return actual;
    }
    
    public void comprar(){
        compras.add(actual);
    }
    
    public void subirActual(){
        actual = productos.get(actual.getId()+1);
    }
    
    public void bajarActual(){
        actual = productos.get(actual.getId()-1);
    }
    
    public LinkedList getCompras(){
        return compras;
    }
}
