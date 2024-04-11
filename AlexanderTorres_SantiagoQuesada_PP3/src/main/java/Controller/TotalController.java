/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.TotalModel;
import java.util.LinkedList;

/**
 *
 * @author Venta PC
 */
public class TotalController {
    TotalModel model;
    public TotalController(LinkedList compras) {
        model = new TotalModel(compras);
    }
    
    public String getInfo(int x){
        if(x == 0){
            return ""+model.getTotalProductos();
        }else{
            return ""+model.getTotalPrecio();
        }
    }
    
    
}
