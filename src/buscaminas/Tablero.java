/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Tablero {
    public int tamanio;
    //public int filas;
    public int numMinas;
    //public ArrayList<ArrayList<Celda>> tablero_juego;
    
}
//Constructor
//public void Tablero( ArrayList tablero_juego){
    
//}


//Getters 

public Tablero(int tamanio, int numMinas){
    this.tamanio = tamanio;
    this.numMinas = numMinas;
}

public ArrayList<ArrayList<Celda>> creadorTablero(Tablero){
    ArrayList<ArrayList<Celda>> tablero_juego = new ArrayList<ArrayList<Celda>>;
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
            tablero_juego[][].add( new Celda(false,0));
    }
return tablero_juego;
}
}
    