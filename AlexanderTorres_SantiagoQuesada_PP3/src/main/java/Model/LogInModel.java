/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Venta PC
 */
public class LogInModel {

    private String user = "admin";
    private String pass = "admin";

    public boolean checkLogin(String userT, String passT) {
        if (userT.equals(user) && passT.equals(pass)) {
            return true;
        } else {
            return false;
        }

    }

}
