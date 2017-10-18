/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.interfaces;

/**
 *
 * @author cice
 */
public interface Ifuncional01 {
    
        void suma (int a, int b); //metodo abstracto, tiene declaración pero NO definición
    
    
    //Estos metodos por defecto puede definir una funcionalidad del metodo
    //También pueden ser sobreesritos para cambiar su funcionalidad
    default void resta(int a, int b) {
        System.out.println("La resta es: " + (a-b));
        
        
    }    
    
}
