/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actividad4.model;

import java.util.Random;

/**
 *
 * @author luisleal
 */
public class Computer {
    public int generateOptionForComputer(){
        int min = 1;
        int max = 3;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        
        
        return value;
    }
    
    public int partida(String jugador, int com){
        String oponente = "";
        switch(com) {
            case 1: 
                oponente = "Papel";
                break;
            case 2: 
                oponente = "Piedra";
                break;
            case 3: 
                oponente = "Tijeras";
                break;    
        }
        
        if(jugador.equals(oponente)){
            return 0;
        } else if (
                (jugador.equals("Piedra") && oponente.equals("Tijeras")) 
                || (jugador.equals("Tijeras") && oponente.equals("Papel"))
                || (jugador.equals("Papel") && oponente.equals("Piedra"))){
            return 1;
        } else {
            return 2;
        }

    }
    
    
}
