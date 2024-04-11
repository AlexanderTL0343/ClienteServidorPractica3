/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CompraModel;
import Model.Producto;
import java.util.LinkedList;

/**
 *
 * @author Venta PC
 */
public class CompraController {
    CompraModel model = new CompraModel();

    public LinkedList getModel(){
        return model.getCompras();
    }
    public String getInfo(int x){
        Producto actual;
        actual = model.getAct();
        if(x==0){
            return actual.getNombre();
        }else if(x == 1){
            return ""+actual.getPrecio();
        }else{
            return actual.getDescripcion();
        }
    }

    public void compra(){
        model.comprar();
    }

    public void cambiarProducto(boolean b){

        if(b && model.getAct().getId()!=2){
            model.subirActual();
        }else if(b == false && model.getAct().getId()!=0){
            model.bajarActual();
        }
    }
    
}
