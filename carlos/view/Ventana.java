/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.view;

import java.awt.Graphics;
import javafx.scene.paint.Color;
import javax.swing.*;

/**
 *
 * @author Carlo
 */
public class Ventana extends JFrame {
    
    private PintandoCasillas jp = new PintandoCasillas();
    private final int Alto = 700;
    private final int Largo = 700;
    
    public Ventana(){
        
        this.add(jp);
        this.setTitle("Ajedrez...ponele"); //Investigar como centrar titulo
        this.setSize(Largo, Alto);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
    
}

class PintandoCasillas extends JPanel {
    private final int LARGO = 640;
    private final int ALTO = 640;
    private final int CASILLA = 80;
    public PintandoCasillas(){
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
       

        for (int i = 0; i < ALTO; i++) {
            
            g.drawRect(i, 0, CASILLA, CASILLA);
            if (i%2==0) {
                g.fillRect(i, 0, CASILLA, CASILLA);
                g.setColor(java.awt.Color.DARK_GRAY);
            }            
            for (int j = 0; j < LARGO; j++) {
                
                g.drawRect(i, j, CASILLA, CASILLA);
                if(i%2!=0 && j%2!=0){
                    g.fillRect(i, j, CASILLA, CASILLA);
                }
                else if(i%2==0 && j%2==0){
                    g.fillRect(i, j, CASILLA, CASILLA);
                }
                j+=CASILLA;
            }
            i+=CASILLA; //tamaño de una casilla
            
        }
        
    }
}
