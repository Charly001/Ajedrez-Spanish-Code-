/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlos.view;

/**
 *
 * @author Carlo
 */
public class Tablero {


    private final int largo = 800;
    private final int alto = 800;
    private final Casilla[][] TABLERO = new Casilla[8][8];

    public int getLargo() {
        return largo;
    }

    public int getAlto() {
        return alto;
    }

    public Casilla[][] getTABLERO() {
        return TABLERO;
    }
    
    
    
    public Tablero(){
        for (int i = 0; i < 8; i++) {
            TABLERO[i][0] = new Casilla();
            for (int j = 0; j < 7; j++) {
                TABLERO[i][j] = new Casilla();
                System.out.print(j);
            }
            System.out.println(i);
        }
       

    }
    
        @Override
    public String toString() {
        return "Tablero{" + "largo=" + largo + ", alto=" + alto + ", TABLERO=" + TABLERO + '}';
    }
}


class Casilla{
    private int tamanioCasilla;
    private boolean ocupada;
    
    
    public Casilla(){
        tamanioCasilla= 10;
        ocupada= false;
    }

    public int getTamanioCasilla() {
        return tamanioCasilla;
    }

    public void setTamanioCasilla(int tamanioCasilla) {
        this.tamanioCasilla = tamanioCasilla;
    }

   

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Casilla{" + "tamanioCasilla=" + tamanioCasilla + ", ocupada=" + ocupada + '}';
    }
   
    
}
