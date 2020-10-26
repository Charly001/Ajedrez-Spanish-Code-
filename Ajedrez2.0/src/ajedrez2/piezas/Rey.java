/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez2.piezas;

import ajedrez2.Casilla;
import ajedrez2.Tablero;

/**
 *
 * @author Carlo
 */
public class Rey extends Pieza{


    public Rey(boolean blanca) {
        super(blanca);

    }


    @Override
    public boolean movimientoValido(Tablero tbl, Casilla posInicial, Casilla posFinal) {
        //no puede moverse a una casilla que contenga pieza mismo color
        if (posFinal.getPieza().isBlanca()) {
            return false;
        }
        
        int x= Math.abs(posInicial.getX() - posFinal.getX());
        int y= Math.abs(posInicial.getY() - posFinal.getY());
        if(x + y == 1){
             // revisara si este movimiento no resultara en el rey puesto en jaque
             // y de ser asi devolvera true
             return true;
        }
        
        return true;
        
       
    }
    
    
}
