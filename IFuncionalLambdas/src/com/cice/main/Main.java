/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

import com.cice.interfaces.Ifuncional01;
import com.cice.interfaces.Ifuncional02;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author cice
 */
public class Main {
    
    public static void main(String... args) {
        
        Ifuncional01 funcional = new Ifuncional01() {
            @Override
            public void suma(int a, int b) {
                System.out.println("La suma es: " + (a+b));
            }
        };
        
        //Nuestra primera expresión lambda
        Ifuncional01 func = (a, b) -> (System.out.println("La suma es: " + (a+b)));
        //func.suma(4, 6);
        func.resta(0, 0);
        //ANALISIS DE LA EXPRESIÓN LAMBDA
        //(a, b) **** Esto es paramatros de entrada
        // -> ******* Esto es operador Lambda
        //(....) **** Funcionalidad del metodo
        
        func = (a,b) -> (System.out.println("otra cosa"));
        //func.suma(2, 3);
        
        func = (a,b) -> {
            //Esto es un bloque de codigo
        };
        
        //////////////////////////////////////////////////////////////
        
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Gustavo");
        listaNombres.add("Pedro");
        listaNombres.add("Marcela");
        listaNombres.add("Ana");
        listaNombres.add("Virginia");
        listaNombres.add("Sergio");
        listaNombres.add("Sara");
        
        ordenar(listaNombres);
        
        Ifuncional02 interfaz = (a) -> (new ArrayList<>(new PriorityQueue<>(a)));
                
    }
    
    //
    
    public static void ordenar(List<String> lista) {
        /*
        int contador = 0;
        String aux = "";
        for(String nombre : lista) {

            for(int i = ++contador; i < lista.size(); i++){
                
                aux = lista.get(i);
                
                int pos = aux.compareToIgnoreCase(nombre);
                
            }
            
            
        }
        */
        //COLAS o PILAS
        PriorityQueue<String> cola = new PriorityQueue<>(lista);
        List<String> ordenado = new ArrayList<>(cola);
        /*
        do{
            System.out.println("nombre: " + cola.poll());
        }while(cola.size() > 0);
*/
    }
}
