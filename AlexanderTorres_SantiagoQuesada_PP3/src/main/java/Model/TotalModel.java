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
public class TotalModel {
    LinkedList<Producto> compras;

    public TotalModel(LinkedList<Producto> compras) {
        this.compras = compras;
    }
    
    public int getTotalProductos(){
        int x = 0;
        for (Producto compra : compras) {
            x++;
        }
        return x;
    }
    
    public int getTotalPrecio(){
        int x = 0;
        for (Producto compra : compras) {
            x = x+compra.getPrecio();
        }
        return x;
    }
}
