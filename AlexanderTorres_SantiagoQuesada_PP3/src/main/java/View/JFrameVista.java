/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.CompraController;
import Controller.LoginController;
import Controller.TotalController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Venta PC
 */
public class JFrameVista {
    LoginController lc = new LoginController();
    CompraController Cc = new CompraController();
    TotalController Tc;
    
    JFrame frame = new JFrame();
    //login
    JPanel panelLogin = new JPanel();
    JLabel labelUser = new JLabel("Usuario:");
    JLabel labelPass = new JLabel("Contraseña:");
    JTextField txtUser = new JTextField();
    JTextField txtPass = new JTextField();
    JButton btnAceptarLogin = new JButton("Aceptar");
    //compra
    JPanel panelCompra = new JPanel();
    JLabel labelProducto = new JLabel("Producto");
    JLabel labelPrecio = new JLabel("Precio");
    JLabel labelDescripcion = new JLabel("Descripción");
    JButton btnAnterior = new JButton("Anterior");
    JButton btnSiguiente = new JButton("Siguiente");
    JButton btnComprar = new JButton("Comprar");
    JButton btnTerminar = new JButton("Terminar");
    //total
    JPanel panelTotal = new JPanel();
    JLabel labelTotalPrecio = new JLabel("TotalPrecio");
    JLabel labelTotalProductos = new JLabel("TotalProductos");
    
    public JFrameVista() {
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);
        //login
        panelLogin.setSize(600, 600);
        panelLogin.setLayout(null);
        
        labelUser.setBounds(150, 100, 100, 30);
        labelPass.setBounds(150, 150, 100, 30);
        txtUser.setBounds(250,100,200,30);
        txtPass.setBounds(250, 150, 200, 30);
        btnAceptarLogin.setBounds(400, 200, 100, 30);
        
        btnAceptarLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(lc.login(txtUser.getText(), txtPass.getText())){
                    frame.setVisible(false);
                    frame.remove(panelLogin);
                    frame.add(panelCompra);
                    frame.setVisible(true);
                }
            }
            
        });
        
        panelLogin.add(labelUser);
        panelLogin.add(labelPass);
        panelLogin.add(txtUser);
        panelLogin.add(txtPass);
        panelLogin.add(btnAceptarLogin);
        
        //compra
        panelCompra.setLayout(null);
        panelCompra.setSize(600,600);
        
        labelProducto.setBounds(150, 100, 400, 30);
        labelPrecio.setBounds(150,150,400,30);
        labelDescripcion.setBounds(150, 200, 400, 30);
        btnAnterior.setBounds(100, 250, 100, 30);
        btnSiguiente.setBounds(200, 250, 100, 30);
        btnComprar.setBounds(300, 250, 100, 30);
        btnTerminar.setBounds(400, 250, 100, 30);
        
        btnAnterior.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(lc.login(txtUser.getText(), txtPass.getText())){
                    Cc.cambiarProducto(true);
                    updateCompra();
                }
            }
            
        });
        
        btnSiguiente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(lc.login(txtUser.getText(), txtPass.getText())){
                    Cc.cambiarProducto(false);
                    updateCompra();
                }
            }
            
        });
        
        btnComprar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(lc.login(txtUser.getText(), txtPass.getText())){
                    Cc.compra();
                }
            }
            
        });
        
        btnTerminar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(lc.login(txtUser.getText(), txtPass.getText())){
                    Tc = new TotalController(Cc.getModel());
                    frame.setVisible(false);
                    frame.remove(panelCompra);
                    updateTotal();
                    frame.add(panelTotal);
                    frame.setVisible(true);
                }
            }
            
        });
        
        panelCompra.add(labelProducto);
        panelCompra.add(labelPrecio);
        panelCompra.add(labelDescripcion);
        panelCompra.add(btnAnterior);
        panelCompra.add(btnSiguiente);
        panelCompra.add(btnTerminar);
        panelCompra.add(btnComprar);
        
        
        //total
        panelTotal.setSize(600,600);
        panelTotal.setLayout(null);
        
        labelTotalPrecio.setBounds(150, 100, 400, 30);
        labelTotalProductos.setBounds(150, 150, 400, 30);
        
        panelTotal.add(labelTotalPrecio);
        panelTotal.add(labelTotalProductos);
        
        frame.add(panelLogin);
        frame.setVisible(true);
    }
    
    private void updateCompra(){
        labelProducto.setText(Cc.getInfo(0));
        labelPrecio.setText(Cc.getInfo(1));
        labelDescripcion.setText(Cc.getInfo(2));
    }
    
    private void updateTotal(){
        labelTotalPrecio.setText(Tc.getInfo(1));
        labelTotalProductos.setText(Tc.getInfo(0));
    }
}
