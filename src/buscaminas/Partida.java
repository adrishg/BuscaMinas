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
public class Partida {
    public Tablero tablero_partida;
    public ArrayList<Jugador> jugadores;
    public int tamanio;
    public int numMinas;

// creando tablero
Tablero tablerito= new Tablero(tamanio, numMinas);
    
Jugador jugador1 = new Jugador("Rolando");
Jugador jugador2 = new Jugador("Adriana");

    
public int Turno(int contador){
int turno = contador%2; // regresa 0 o 1
return turno;
}

public void Control(int turno, Jugador jugador){
    
    while (true){
        if(turno == 1) {
        System.out.println("Turno del jugador uno"); 
        // Jugador 1
        } 
        else {
        System.out.println("Turno del jugador dos");  
        // Jugador 2
        }   
    }

}


public Partida (Tablero tablero_partida, ArrayList<Jugador> jugadores, int numMinas){   
this.tablero_partida=tablero_partida;
this.jugadores=jugadores;
this.numMinas=numMinas;
}

}