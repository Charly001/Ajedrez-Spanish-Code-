/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos;

/**
 *
 * @author Carlo
 */
public abstract class Pieza {
    
    protected int xPos, yPos;
    protected boolean blanca; //true blanca, false negra
    protected String rol;
    
//    public Pieza(){
//        xPos=0;
//        yPos=0;
//        blanca=true;
//        rol="";
//    }
    
    public void removerPieza(){
    
}
    
    public abstract void movimiento();
    
    public abstract void posicionInicial();
    
        public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean isBlanca() {
        return blanca;
    }

    public void setBlanca(boolean blanca) {
        this.blanca = blanca;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

 