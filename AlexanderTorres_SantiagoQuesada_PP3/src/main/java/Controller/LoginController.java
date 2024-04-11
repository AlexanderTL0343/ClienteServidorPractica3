/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.LogInModel;

/**
 *
 * @author Venta PC
 */
public class LoginController {
    private LogInModel model = new LogInModel();
    
    public boolean login(String user, String pass){
        return model.checkLogin(user, pass);
    }
    
    
}
