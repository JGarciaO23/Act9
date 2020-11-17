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
    
    public void pick(){
        Carta carta = cartas.get(5);
        System.out.println("Tu carta es color: " + carta.color);
        System.out.println("Pertenece al palo: " + carta.palo);
        System.out.println("Tiene un valor de: " + carta.valor);
        cartas.remove(5);
        Collections.shuffle(cartas);
        System.out.println("Tamaño: " + cartas.size());
    }
    
    public void hand(){
    Carta carta = cartas.get(8);
    System.out.println ("Carta 5");
    System.out.println("Tu carta es color: " + carta.color);
    System.out.println("Pertenece al palo de: " + carta.palo);
    System.out.println("Tiene un valor de: " + carta.valor);
    cartas.remove(8);
    Collections.shuffle(cartas);
    System.out.println("Tamaño" + cartas.size());}
    
    { 
    Carta carta = cartas.get(6);
    System.out.println ("Carta 5");
    System.out.println("Tu carta es color: " + carta.color);
    System.out.println("Pertenece al palo de: " + carta.palo);
    System.out.println("Tiene un valor de: " + carta.valor);
    cartas.remove(6);
    Collections.shuffle(cartas);
    System.out.println("Tamaño: " + cartas.size());}
    
    {
    Carta carta = cartas.get(10);
    System.out.println ("Carta 5");
    System.out.println("Tu carta es color: " + carta.color);
    System.out.println("Pertenece al palo de: " + carta.palo);
    System.out.println("Tiene un valor de: " + carta.valor);
    cartas.remove(10);
    Collections.shuffle(cartas);
    System.out.println("Tamaño: " + cartas.size());}
    
    {
    Carta carta = cartas.get(15);
    System.out.println ("Carta 5");
    System.out.println("Tu carta es color: " + carta.color);
    System.out.println("Pertenece al palo de: " + carta.palo);
    System.out.println("Tiene un valor de: " + carta.valor);
    cartas.remove(15);
    Collections.shuffle(cartas);
    System.out.println("Tamaño: " + cartas.size());}
    
    {
    Carta carta = cartas.get(12);
    System.out.println ("Carta 5");
    System.out.println("Tu carta es color: " + carta.color);
    System.out.println("Pertenece al palo de: " + carta.palo);
    System.out.println("Tiene un valor de: " + carta.valor);
    cartas.remove(12);
    Collections.shuffle(cartas);
    System.out.println("Tamaño: " + cartas.size());}
 
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
                    System.out.println("Opción no válida");
                    System.out.println("");
                    break;
                 
                case 5:
                    salir= false;
                    break;
            }
        
        try {
            if(cartas.size() <=0){
                throw new Exception("Se han agotado las cartas " + "Ingresa el número 5 para salir");
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
    }
    
    }

    

