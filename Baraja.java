/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad8cej;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JGarciaO.23
 */
public class Baraja {
    
    List<Carta> cartas; 
    Scanner input = new Scanner(System.in);
    
    public void crearBaraja(String[] palo, String[] valores){
        
    cartas = new ArrayList<>();
   
        
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                Carta carta = new Carta();
                if (palo[i].equals("Corazon")  || palo[i].equals("Diamante")){
                    carta.color = "Rojo";
                } else {
                    carta.color = "Negro";
                }
                carta.palo = palo[i];
                carta.valor = valores[j];
                cartas.add(carta);
            }
        }
        System.out.println("Tamaño de la baraja:" + cartas.size());
        
    }
    public void mezclar(){
        Collections.shuffle(cartas);
        System.out.println("Se ha mezclado");
    }
    public void head(){
        System.out.println("head");
        Carta carta = cartas.get(0);
        System.out.println("Color: " + carta.color);
        System.out.println("Palo: " + carta.palo);
        System.out.println("Valor: " + carta.valor);
        cartas.remove(carta);
        //cartas.remove(0);
        System.out.println("Tamaño de la baraja:" + cartas.size());
    }
    
    public void showMenu(){
        boolean salir = true;
        while (salir) {
            int opcion;
            System.out.println("");
            System.out.println("Bienvenido a Poker!");
            System.out.println("");
            System.out.println("Selecciona una opción:");
            System.out.println("");
            System.out.println("1. Mezclar deck");
            System.out.println("");
            System.out.println("2. Sacar una carta");
            System.out.println("");
            System.out.println("3. Carta al azar");
            System.out.println("");
            System.out.println("4. Generar una mano de 5 cartas");
            System.out.println("");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.println("Opción:");
            opcion = input.nextInt();
            
            switch (opcion){
                case 1:
                    mezclar();
                    break;
                
                case 2:
                    head();
                    break;
                
                case 3:
                    pick();
                    break;
                
                case 4:
                    hand();
                    break;

                default:
                    salir = false;
                    break;
            }
          
        }
    }

    void pick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void hand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

