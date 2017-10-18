/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

import com.cice.interfaces.Ifuncional01;

/**
 *
 * @author cice
 */
public class Main {
    
        public static void main(String[] args) {
        
        Ifuncional01 ifuncional = new Ifuncional01() {
            @Override
            public void suma(int a, int b) {
                System.out.println("La suma es: " + (a+b));
            }
        };
        
        //primera expresión lambda
        Ifuncional01 func = (a,b) -> (System.out.println("La suma es: " + (a+b)));
        func.suma(4, 6);
        func.resta(0, 0);
        
        func = (a,b) -> (System.out.println("otra cosa"));
        func.suma(2, 3);
        
        func = (a,b) -> {
          
            //esto es un bloque de código
            
        };
        
        //ANALISIS DE LA EXPRESIÓN LAMBDA
        // (a,b) **** Esto es parametros de entrada
        // -> ******* Esto es operador lambda
        // (.....) ** Funcionalidad del metodo
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
