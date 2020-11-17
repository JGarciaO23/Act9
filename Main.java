/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8cej;

import java.util.ArrayList;

/**
 *
 * @author JGarciaO.23
 */
public class Main {
    
    public static void main(String[] args) {
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] palo = {"Corazon", "Pika", "Diamante", "Trebol"};
        Baraja baraja;
        baraja = new Baraja();
        baraja.crearBaraja(palo, valores);
        baraja.showMenu();
        baraja.mezclar();
        baraja.head();
        baraja.pick();
        baraja.hand();
    }
}
