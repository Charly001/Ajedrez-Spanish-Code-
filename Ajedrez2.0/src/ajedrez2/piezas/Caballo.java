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
public class Caballo extends Pieza {

    public Caballo(boolean blanca) {
        super(blanca);
    }

    @Override
    public boolean movimientoValido(Tablero tbl, Casilla posInicial, Casilla posFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
