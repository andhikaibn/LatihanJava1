/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contohgui;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ANDIKA
 */
public class DemoGUI2 extends JFrame {
    JPanel jp = new JPanel();
    JTextField jt = new JTextField();
    JLabel jl = new JLabel("Contoh Label");
    
    public DemoGUI2() {
        add(jl);
        add(jt);
        add(jp);
        jl.setBounds(15,20,80,25);
        jt.setBounds(120,20,80,25);
    }
    public static void main(String[] args) {
        DemoGUI2 demo2 = new DemoGUI2();
        
        demo2.setTitle("Form Dengan Label dan Textfield");
        demo2.setSize(300, 300);
        demo2.setVisible(true);
    }
}
