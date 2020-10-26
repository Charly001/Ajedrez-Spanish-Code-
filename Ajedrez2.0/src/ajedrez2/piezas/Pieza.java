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
 public abstract class Pieza {
     
    private boolean blanca = true;
    private boolean existe = true;
    
    public Pieza(boolean blanca){
        this.blanca = blanca;
    }
    
    public boolean isBlanca() {
        return blanca;
    }

    public void setBlanca(boolean blanca) {
        this.blanca = blanca;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }
    
    public abstract boolean movimientoValido(Tablero tbl, Casilla posInicial, Casilla posFinal);
}
